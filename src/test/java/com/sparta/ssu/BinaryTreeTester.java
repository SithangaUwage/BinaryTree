/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sparta.ssu;

import com.sparta.ssu.sorters.BinaryTreeImpl;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @param <T>
 * @author keithdauris
 */
public class BinaryTreeTester<T> {

    private BinaryTreeImpl binaryTree;

    @Before
    public void setup() {
        int[] elements = {4, 1, 13, 4, 20, 78, 2, 8, 6, 10, 3, 5, 9, 50};
        binaryTree = new BinaryTreeImpl(7);
        binaryTree.addElements(elements);
    }

    @Test
    public void testCreateNewTree() {
        int value = binaryTree.getRootElement();
        assertEquals(value, 7);
    }

    @Test
    public void testAddChildNodes() {
        int element = 7;
//        binaryTree.addElement(element);

        int leftValue = binaryTree.getLeftChild(element);
        int rightValue = binaryTree.getRightChild(element);
        assertEquals(4, leftValue);
        assertEquals(13, rightValue);
    }

    @Test
    public void testSortTreeAsc() {
        List<Integer> sortedList = binaryTree.getSortedTreeAsc();
        for (int value : sortedList) {
            int index = sortedList.indexOf(value);
            if (sortedList.indexOf(value) > 0) {
                int previousElement = sortedList.get(index - 1);
                assertTrue(value > previousElement);
            }
        }
    }

    @Test
    public void testSortTreeDesc() {
        List<Integer> sortedList = binaryTree.getSortedTreeDesc();
        for (int value : sortedList) {
            int index = sortedList.indexOf(value);
            if (sortedList.indexOf(value) > 0) {
                int previousElement = sortedList.get(index - 1);
                assertTrue(value < previousElement);
            }
        }
    }

    @Test
    public void testNumberOfNodes() {
        binaryTree.addElement(12);
        int num = binaryTree.getNumberOfElements();
        assertEquals(num, 15);
    }

    @Test
    public void testFindElement() {
        int elementToFind = 10;
        boolean isFound = binaryTree.findElement(elementToFind);
        assertTrue(isFound);
    }
}