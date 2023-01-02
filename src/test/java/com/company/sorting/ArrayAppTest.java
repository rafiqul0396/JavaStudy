package com.company.sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayAppTest {
    /**
     * Method under test: {@link ArrayApp#sortBasedOnFrequencyAndValue(List)}
     */
    @Test
    public void testSortBasedOnFrequencyAndValue() {
        assertTrue(ArrayApp.sortBasedOnFrequencyAndValue(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link ArrayApp#sortBasedOnFrequencyAndValue(List)}
     */
    @Test
    public void testSortBasedOnFrequencyAndValue2() {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        List<Integer> actualSortBasedOnFrequencyAndValueResult = ArrayApp.sortBasedOnFrequencyAndValue(integerList);
        assertEquals(9, actualSortBasedOnFrequencyAndValueResult.size());
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(0));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(1));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(2));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(3));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(4));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(5));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(6));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(7));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(8));
    }

    /**
     * Method under test: {@link ArrayApp#sortBasedOnFrequencyAndValue(List)}
     */
    @Test
    public void testSortBasedOnFrequencyAndValue3() {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        List<Integer> actualSortBasedOnFrequencyAndValueResult = ArrayApp.sortBasedOnFrequencyAndValue(integerList);
        assertEquals(9, actualSortBasedOnFrequencyAndValueResult.size());
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(0));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(1));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(2));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(3));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(4));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(5));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(6));
        assertEquals(1, (int) actualSortBasedOnFrequencyAndValueResult.get(7));
        assertEquals(2, (int) actualSortBasedOnFrequencyAndValueResult.get(8));
    }
}

