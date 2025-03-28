package org.example;

public class Solution{

    boolean hasBiggerLeft(int[]arr,int index){
        if(index==0){
            return false;
        }
        for(int i=index;i>=0;i--){
            if(arr[i]>arr[index]){
                return true;//只要有比它大的值就行
            }
        }
return false;
    }
    boolean hasBiggerRight(int[]arr,int index){
        if(index==arr.length-1){
            return false;
        }
        for(int i=index;i<arr.length;i++){
            if(arr[i]>arr[index]){
                return true;//只要有比它大的值就行
            }
        }
        return false;
    }
    public int trap(int[] height) {
        int sum=0;

        for(int i =0;i<height.length;i++){
            int leftvalue=0;
            int rightvalue=0;

            if(hasBiggerRight(height,i)&&(hasBiggerLeft(height,i))){
                for (int l=i;l>=0;l--){

                    if(height[l]>leftvalue){
                        leftvalue=height[l] ;//找到左边最大值

                    }
                }
                for(int r=i;r<height.length;r++){

                    if(height[r]>rightvalue){
                        rightvalue=height[r];//找到右边最大值


                    }
                }
            }//找到了左右的高值，比较两者的大小，选小的.需要的水为：小的-本下标的值

            int need=Math.min(leftvalue,rightvalue)-height[i];
            if(need>0){//我们仅仅需要正数
            sum+=need;}
        }
return sum;
    }
}