package com.search;

import java.util.Arrays;

public class Search {

  public static int linearSearch(int[] array, int element) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) return i;
    }

    return -1;
  }

  public static int recurrentBinarySearch(int[] array, int start, int end, int element) {
    if(start > end) return -1;

    int middle = (start + end) / 2;

    if(array[middle] == element) return middle;

    if(array[middle] > element) return recurrentBinarySearch(array, start, middle - 1, element);
    else return recurrentBinarySearch(array, middle + 1, end, element);
  }

  public static int iterativeBinarySearch(int[] array, int start, int end, int element) {
    if (start > end) throw new IllegalArgumentException("Start may not be grater than end.");

    while (start <= end) {
      int middle = (start + end) / 2;
      if (array[middle] < element) start = middle + 1;
      else if (array[middle] > element) end = middle - 1;
      else if (array[middle] == element) return middle;
    }
    return -1;
  }
}
