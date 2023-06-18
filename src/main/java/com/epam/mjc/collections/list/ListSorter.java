package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        boolean isSorted = false;
        while (!isSorted){
            isSorted =true;
            for (int i = 0; i < sourceList.size()-2; i++) {
                if (comparator.compare(sourceList.get(i), sourceList.get(i+1))== 1 ){
                    isSorted =false;

                    String buf =sourceList.get(i);
                    sourceList.set(i, sourceList.get(i+1));
                    sourceList.set(i+1, buf);
                } else if (comparator.compare(sourceList.get(i), sourceList.get(i + 1)) == 0) {
                    if (Integer.parseInt( sourceList.get(i)) >Integer.parseInt( sourceList.get(i + 1))){
                        String buf =sourceList.get(i);
                        sourceList.set(i, sourceList.get(i+1));
                        sourceList.set(i+1, buf);
                    }
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        ai = 5*ai*ai +3;
        bi = 5*bi*bi +3;
        if (ai>bi) return 1;
        if (ai<bi) return -1;
        return 0;
    }
}
