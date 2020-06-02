package com.sorts;

import com.search.Search;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {
  
  @Test
  void should_search_number_linearly() {
    //given
    int[] array = {4, 3, 6, 8, 1, 5, 2, 7};
    int number = 8;

    //when
    MergeSort.sort(array);
    int indexOfNumber = Search.linearSearch(array, number);

    //then
    Assertions.assertEquals(7, indexOfNumber);
  }

  @Test
  void should_do_binary_search_iterative() {
    //given
    int[] array = {4, 3, 6, 8, 1, 5, 2, 7};
    int number = 8;

    //when
    MergeSort.sort(array);
    int indexOfNumber = Search.iterativeBinarySearch(array, 0, array.length - 1, number);

    //then
    Assertions.assertEquals(7, indexOfNumber);
  }

  @Test
  void should_do_recurrent_binary_search() {
    //given
    int[] array = {4, 3, 6, 8, 1, 5, 2, 7};
    int number = 8;

    //when
    MergeSort.sort(array);
    int indexOfNumber = Search.recurrentBinarySearch(array, 0, array.length - 1, number);

    //then
    Assertions.assertEquals(7, indexOfNumber);
  }
}
