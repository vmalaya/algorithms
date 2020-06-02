package com.sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

  @Test
  void should_sort_array() {
    //given
    int[] array = {3, 6, 4, 8, 1, 5, 2, 7};

    //when
    MergeSort.sort(array);

    //then
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
  }
}
