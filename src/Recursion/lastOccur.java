package Recursion;

public class lastOccur {
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastOccurence(arr,key,i+1);
        if(isfound!=-1){
            return isfound;
        }
        // check with self
        if(arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main (String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr,5,0));
    }
}
