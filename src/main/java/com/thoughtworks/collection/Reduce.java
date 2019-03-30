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
        if (isEven(length)) {
            result = (double) (arrayList.get(mid) + arrayList.get(mid - 1)) / 2;
        } else {
            result = (double) arrayList.get(mid);
        }
        return result;
    }

    private boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public int getFirstEven() {
        return arrayList.get(getIndexOfFirstEven());
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (isEven(arrayList.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int getLastOdd() {
        return arrayList.get(getIndexOfLastOdd());
    }

    public int getIndexOfLastOdd() {
        int result = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!isEven(arrayList.get(i))) {
                result = i;
            }
        }
        return result;
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }
}
