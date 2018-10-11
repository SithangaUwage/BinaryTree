package com.sparta.ssu.sorters;

import com.sparta.ssu.start.BinaryTree;
import com.sparta.ssu.start.Starter;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImpl implements BinaryTree {

    private static Logger log = Logger.getLogger(Starter.class.getName());
    private final Node rootNode;
    private List<Integer> sortedTreeAsc = new ArrayList<Integer>();
    private List<Integer> sortedTreeDesc = new ArrayList<Integer>();
    private int numberOfNodes = 1;

    public BinaryTreeImpl(final int element) {
        rootNode = new Node(element);
    }

    public BinaryTreeImpl(int[] elements) {
        rootNode = new Node(elements[0]);

        for (int i = 1; i < elements.length; i++) {
            this.addElement(elements[i]);
        }
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfNodes;
    }

    @Override
    public void addElement(int element) {
        addElementRecursively(element, rootNode);
        numberOfNodes++;
    }

    private void addElementRecursively(final int value, Node current) {
        current = rootNode;
        Node node = null;
        boolean left = true;
        while (current != null) {
            if (value <= current.getValue()) {
                node = current;
                log.info(value + " is added to the left of " + current.getValue());
                left = true;
                current = current.getLeftChild();
            } else if (value > current.getValue()) {
                node = current;
                log.info(value + " is added to the right of " + current.getValue());
                left = false;
                current = current.getRightChild();
            }
        }
        if (left) {
            node.setLeftChild(new Node(value));
        } else {
            node.setRightChild(new Node(value));
        }

    }

    @Override
    public void addElements(int[] elements) {

        for (int i = 0; i < elements.length; i++) {
            this.addElement(elements[i]);
        }
    }

    @Override
    public boolean findElement(int value) {
        return findValueinTree(rootNode, value);
    }

    private boolean findValueinTree(Node current, int value) {
        if (current == null) {
            return false;
        }
        log.info("current value is "+current.getValue());
        if (value == current.getValue()) {
            return true;
        }
        return value < current.getValue()
                ? findValueinTree(current.getLeftChild(),value)
                :findValueinTree(current.getRightChild(),value); // if the value is less than assign the left child node to current, otherwise it will be true. Vise versa for right.
    }

    @Override
    public int getLeftChild(int element) {
        Node current = rootNode;
        while (current != null) {
            if (current.getValue() == element) {
                current = current.getLeftChild();
                return current.getValue();
            }
            else if (element < current.getValue()) {
                current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return 0;
    }


    @Override
    public int getRightChild(int element) {
        Node current = rootNode;
        while (current != null) {
            if (current.getValue() == element) {
                current = current.getRightChild();
                return current.getValue();
            }
            else if (element < current.getValue()) {
                current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return 0;
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        ascList(rootNode);
        return sortedTreeAsc;
    }

    private void ascList(Node rootNode) {
        if (rootNode != null) {
            ascList(rootNode.getLeftChild());
            sortedTreeAsc.add(rootNode.getValue());
            ascList(rootNode.getRightChild());
        }
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        descList(rootNode);
        return sortedTreeDesc;
    }

    private void descList(Node rootNode) {
        if (rootNode != null) {
            descList(rootNode.getRightChild());
            sortedTreeDesc.add(rootNode.getValue());
            descList(rootNode.getLeftChild());
        }
    }
}
