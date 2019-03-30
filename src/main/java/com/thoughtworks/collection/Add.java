package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < arrayList.size(); i++) {
            int sum = arrayList.get(i - 1) + arrayList.get(i);
            result.add(getNumberModify(sum, 3, 0));
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double result;
        List<Integer> evenList = arrayList.stream().filter(number -> isEven(number)).collect(Collectors.toList());
        int length = evenList.size();
        int mid = length / 2;
        if (isEven(length)) {
            result = (evenList.get(mid - 1) + evenList.get(mid)) / 2;
        } else {
            result = evenList.get(mid);
        }
        return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double result;
        List<Integer> evenList = arrayList.stream().filter(number -> isEven(number)).collect(Collectors.toList());
        int length = evenList.size();
        int sum = 0;
        for (Integer aEven : evenList) {
            sum += aEven;
        }
        result = sum / length;
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean result = false;
        List<Integer> evenList = arrayList.stream().filter(number -> isEven(number)).collect(Collectors.toList());
        if (evenList.contains(specialElment)) {
            result = true;
        }
        return result;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = arrayList.stream().filter(number -> isEven(number)).distinct().collect(Collectors.toList());
        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(number -> isEven(number)).sorted().collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(number -> !isEven(number)).sorted((x, y) -> y - x).collect(Collectors.toList());
        evenList.addAll(oddList);
        return evenList;
    }
}
