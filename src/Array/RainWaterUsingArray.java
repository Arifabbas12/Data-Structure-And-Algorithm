package Array;

import java.util.*;
public class RainWaterUsingArray {
    public static void trappedRainWater(int arr[]){
       int maxWater=0;
       int lp=0;
       int rp=arr.length-1;
       while(lp!=rp){
           int height=Math.min(arr[lp],arr[rp]);
           int width=rp-lp;
           int currWater=height*width;
           maxWater=Math.max(currWater,maxWater);
           if(arr[lp]<arr[rp]) lp++;
           else rp--;
       }
        System.out.println("MaxWater is : "+maxWater);
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        trappedRainWater(arr);
    }
}
