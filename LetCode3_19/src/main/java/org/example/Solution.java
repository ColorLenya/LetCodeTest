package org.example;

class Solution {
    boolean smallerThanLeft(int i,int []x){
        if(x[i]<x[i-1]){
            return true;
        }else{
            return false;
        }
    }

    boolean smallerThanRight(int i,int []x){
        if(x[i]<x[i+1]){
            return true;
        }else{
            return false;
        }
    }
    boolean isEdge(int i,int []x){
        if((i==0)||(i>=x.length-1)){
            return  true;
        }else{
            return  false;
        }
    }
    public int candy(int[] ratings) {
        int sum=0;
        int length =ratings.length;
        int minValueIndex=0;//评分最低的下标
        int[] model=new int[length];
        for(int v=0;v<ratings.length;v++){
            model[v]=ratings[v];
        }

        int[] result = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            result[i]=1;
        }//result 数组初始化

        while(length-1>0) {
            //找到评分最低的下标
            for (int j = 0; j <length-1; j++) {


                    if (model[j] < model[j + 1]) {
                        minValueIndex = j;
//                        int temp = 0;
//                        temp = model[j];
//                        model[j] = model[j + 1];
//                        model[j + 1] = temp;
                    }

            }
            //且最小值放在末尾
                        int temp = 0;
            temp = model[minValueIndex];
                        model[minValueIndex] = model[length-1];
                        model[length-1] = temp;

            if(isEdge(minValueIndex,ratings)){
                if(minValueIndex==length-1){
                    if (smallerThanLeft(minValueIndex, ratings) ) {
                        result[minValueIndex-1] = result[minValueIndex]+1;

                    }
                }
                if (minValueIndex==0){
                    if(smallerThanRight(minValueIndex,ratings)){
                        result[minValueIndex+1] = result[minValueIndex]+1;
                    }
                }
                length--;
                continue;

            }

            if (smallerThanLeft(minValueIndex, ratings) ) {
                result[minValueIndex-1] = result[minValueIndex]+1;

            }
            if(smallerThanRight(minValueIndex,ratings)){
                result[minValueIndex+1] = result[minValueIndex]+1;
            }
            length--;
        }

        for (int x=0;x<result.length;x++){
            sum+=result[x];
        }


        return sum;
    }
}