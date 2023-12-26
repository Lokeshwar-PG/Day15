package com.hashtables;

import java.util.Hashtable;
import java.util.LinkedList;

public class FrequencyWords {
    public static <myMapNode> void main(String[] args) {
        Hashtable<Integer, String> myMapNode = new Hashtable<>();
        Hashtable<Integer, String> myMapNode2 = new Hashtable<>();
        LinkedList<myMapNode> mapList = new LinkedList<>();
        myMapNode.put(1, "Lokesh");
        myMapNode.put(2, "Madhesh");
        myMapNode2.put(1, "Sam");
        myMapNode2.put(2, "Rajesh");
        mapList.add((myMapNode) myMapNode);
        mapList.add((myMapNode) myMapNode2);
        System.out.println(mapList);
        mapList.remove(myMapNode2.remove(2));
        System.out.println(mapList);
    }
}
