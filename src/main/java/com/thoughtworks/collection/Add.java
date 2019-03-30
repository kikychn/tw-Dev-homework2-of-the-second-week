package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return getSumOfEvenOrOdd(leftBorder, rightBorder, true);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return getSumOfEvenOrOdd(leftBorder, rightBorder, false);
    }

    private int getSumOfEvenOrOdd(int leftBorder, int rightBorder, boolean isAEven) {
        int result = 0;
        int start = Math.min(leftBorder, rightBorder);
        int end = Math.max(leftBorder, rightBorder);
        for (int i = start; i <= end; i++) {
            if (isAEven && isEven(i)) {
                result += i;
                i++;
            } else if (!isAEven && !isEven(i)) {
                result += i;
                i++;
            }
        }
        return result;
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

    private int getNumberModify(Integer number, int multiple, int addition) {
        return number * multiple + addition;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (Integer number : arrayList) {
            result += getNumberModify(number, 3, 2);
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : arrayList) {
            if (!isEven(number)) {
                number = getNumberModify(number, 3, 2);
            }
            result.add(number);
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (Integer number : arrayList) {
            if (!isEven(number)) {
                result += getNumberModify(number, 3, 5);
            }
        }
        return result;

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
