package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    private boolean isFilterCondition(int i, int dev) {
        return i % dev == 0;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(number -> isFilterCondition(number, 2)).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(number -> isFilterCondition(number, 3)).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : firstList) {
            if (secondList.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}