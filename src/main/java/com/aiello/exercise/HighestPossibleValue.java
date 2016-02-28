package com.aiello.exercise;

import java.util.Arrays;

public class HighestPossibleValue {

    public static int getHighestPositiveValueOne(Integer[] array) {
        int length = array.length;
        Arrays.sort(array);
        return array[length-1] * array[length-2] * array[length-3];
    }

    public static int getHighestPositiveValueTwo(Integer[] inputlist) {
        Integer[] mylist = {0, 0, 0, 0, 0};

        for (Integer candidate : inputlist) {
            if (candidate >= mylist[0]) {
                mylist[2] = mylist[1];
                mylist[1] = mylist[0];
                mylist[0] = candidate;
            } else if (candidate >= mylist[1]) {
                mylist[2] = mylist[1];
                mylist[1] = candidate;
            } else if (candidate >= mylist[2]) {
                mylist[2] = candidate;
            } else if (candidate <= mylist[4]) {
                mylist[3] = mylist[4];
                mylist[4] = candidate;
            } else if (candidate <= mylist[3]) {
                mylist[3] = candidate;
            }

            //System.out.println(max((mylist[0] * mylist[1] * mylist[2]), (mylist[0] * mylist[3] * mylist[4])));
        }

        return mylist[0] * mylist[1] * mylist[2];
    }
}
