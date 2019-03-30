package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        return getNumberList(left, right);
    }

    private List<Integer> getNumberList(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = getNumberList(left, right);
        return result.stream().filter(number -> isEven(number)).collect(Collectors.toList());
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
