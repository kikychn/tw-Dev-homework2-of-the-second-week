package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] numberList : array) {
            result.addAll(Arrays.asList(numberList));
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = transformToOneDimesional();
        return result.stream().distinct().collect(Collectors.toList());
    }
}
