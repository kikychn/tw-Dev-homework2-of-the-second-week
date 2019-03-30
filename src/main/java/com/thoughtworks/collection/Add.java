package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;
        int start = Math.min(leftBorder, rightBorder);
        int end = Math.max(leftBorder, rightBorder);
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result += i;
                i++;
            }
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;
        int start = Math.min(leftBorder, rightBorder);
        int end = Math.max(leftBorder, rightBorder);
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result += i;
                i++;
            }
        }
        return result;

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (Integer number : arrayList) {
            result += number * 3 + 2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
