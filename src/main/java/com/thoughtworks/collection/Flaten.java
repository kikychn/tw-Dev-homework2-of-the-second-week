package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        throw new NotImplementedException();
    }
}
