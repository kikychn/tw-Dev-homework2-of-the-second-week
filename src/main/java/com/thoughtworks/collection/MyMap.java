package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        array.forEach(number -> result.add(number * 3));
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        array.forEach(index -> result.add(letters[index - 1]));
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        int letterCount = letters.length;
        for (Integer index : array) {
            if (index <= letterCount) {
                result.add(letters[index - 1]);
            } else {
                int loop = index / letterCount;
                int remainder = index % letterCount;
                if (remainder == 0) {
                    result.add(letters[loop - 2] + letters[letterCount - 1]);
                } else {
                    result.add(letters[loop - 1] + letters[remainder - 1]);
                }
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
