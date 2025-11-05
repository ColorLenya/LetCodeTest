package org.example;

class Solution {
    public int hIndex(int[] citations) {

        //从变量x开始，每个数组元素减去x长度。（x初始值是citations.length,每次循环-1）
        //为正说明满足引用次数，计数器Count+1；一旦count==x,返回该值
        for (int x=citations.length;x>=0;x--){
            int count=0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]-x>=0){
                    count++;
                }

                if(count==x){
                    return x;
                }
            }


        }
        return 0;
    }
}