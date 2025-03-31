package org.example;

public class Solution {
    public static void main(String[] args) {

       Solution a = new Solution();
       String s = "foobar";
       char letter = 'o';
        System.out.println(a.percentageLetter(s,letter));
    }
    public int percentageLetter(String s, char letter) {
        int[] array= new int[26];
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }
        int temp = letter-'a';
        int  result=(array[temp]*100)/s.length();

return result;
    }
}