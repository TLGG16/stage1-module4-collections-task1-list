package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> answ = new LinkedList<>();
        for (Integer i: sourceList
             ) {
            if (i%2==1){
                answ.addFirst(i);
            }else {
                answ.addLast(i);
            }
        }
        return answ;
    }
}
