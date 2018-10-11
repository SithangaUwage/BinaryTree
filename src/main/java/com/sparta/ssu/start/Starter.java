package com.sparta.ssu.start;

//import com.sparta.ssu.sorters.BinaryTreeSorter;
import com.sparta.ssu.sorters.BinaryTreeImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Starter
{
    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(Starter.class.getName());

    public static void main(String[] args) {

//        log.info("Logging initialised");
//        BinaryTreeSorter newData = new BinaryTreeSorter();
//
//        newData.AddNewDataToNode(10);
//        newData.AddNewDataToNode(5);
//        newData.AddNewDataToNode(8);
//        newData.AddNewDataToNode(100);
//        newData.AddNewDataToNode(32);
//        newData.AddNewDataToNode(50);
//        newData.AddNewDataToNode(3);
//        newData.AddNewDataToNode(27);
//        newData.AddNewDataToNode(7);
//        newData.AddNewDataToNode(301);
//        newData.AddNewDataToNode(25);
//
//        log.info("Getting Root value: ");
//        newData.getRoot();
//        log.info("Getting Size of Binary Tree: ");
//        newData.getSize();
//
//        log.info("Getting the Lowest Value in the Binary Tree: ");
//        System.out.println(newData.getLowestValue());
//        log.info("Getting the Highest Value in the Binary Tree: ");
//        System.out.println(newData.getHighestValue());
//
//        log.info("Printing Left and Right Children of Binary Tree from Root: ");
//        System.out.println(newData);
//
//        log.info("Ascending order of the value: ");
//        newData.ascendingOrder();

//    SortManager sort = new SortManager();
//    sort.SortManager();

        int[] a = {4,6,1,3,5};

        BinaryTreeImpl binaryTree = new BinaryTreeImpl(a);
//        binaryTree.addElements(a);

        log.info("Root Elements is: " + binaryTree.getRootElement());
        log.info("Number of Elements: " + binaryTree.getNumberOfElements());
        log.info("Find Elements 5: "+ binaryTree.findElement(5));
//        log.info("Get Left Node: " + binaryTree.getLeftChild(5));

        log.info("Sorted tree Ascending: " + binaryTree.getSortedTreeAsc());
        log.info("Sorted tree Descending: " + binaryTree.getSortedTreeDesc());


    }
}