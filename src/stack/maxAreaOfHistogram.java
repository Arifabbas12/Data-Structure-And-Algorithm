package stack;

import java.util.*;

public class maxAreaOfHistogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nextSmallerRight[] = new int[arr.length];
        int nextSmallerLeft[] = new int[arr.length];
        // nextSmallerRight
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i]=arr.length;
            }else{
                nextSmallerRight[i]=s.peek();
            }
            s.push(i);
        }
    // nextSmallerLeft
        s=new Stack<>();
        for(int i=0;i<=arr.length-1;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i]=-1;
            }else{
                nextSmallerLeft[i]=s.peek();
            }
            s.push(i);
        }
    // current Area=width=j-i-1
        for(int i=0;i<=arr.length-1;i++){
            int height=arr[i];
            int width=nextSmallerRight[i]-nextSmallerLeft[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("maxArea of Histogram : "+maxArea);
}
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
