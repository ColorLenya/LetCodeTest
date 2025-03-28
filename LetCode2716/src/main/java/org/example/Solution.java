package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> it =new HashSet<Character>();
        char[] array = s.toCharArray();
        for(int i=0;i<array.length;i++){
            it.add(array[i]);
        }
        return it.size();


    }
}
