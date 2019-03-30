package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max(Comparator.comparing(a -> a)).get();
    }

    public double getMinimum() {
        return arrayList.stream().min(Comparator.comparing(a -> a)).get();
    }

    public double getAverage() {
        double sum = 0;
        for (Integer number : arrayList) {
            sum += number;
        }
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        double result;
        int length = arrayList.size();
        int mid = length / 2;
        if (length % 2 == 0) {
            result = (double) (arrayList.get(mid) + arrayList.get(mid - 1)) / 2;
        } else {
            result = (double) arrayList.get(mid);
        }
        return result;
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
