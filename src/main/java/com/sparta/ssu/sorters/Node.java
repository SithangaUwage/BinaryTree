package com.sparta.ssu.sorters;

    class Node {
        private final int value; // Cannot change the values
        private Node leftChild;
        private Node RightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {    // only a getter because we don't want to change the value only to get the value.
            return value;
        }

        public Node getLeftChild() { // get left child
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {  // set left child
            this.leftChild = leftChild;
        }

        public Node getRightChild() {   // get left child
            return RightChild;
        }

        public void setRightChild(Node rightChild) {    // set left child
            RightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            }
            return isLeftChildEmpty();
        }
    }




