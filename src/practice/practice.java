package practice;

import java.util.*;
public class practice {

    // Question->1

//    public static void printSpiral(int matrix[][]){
//        int startRow=0;
//        int endRow=matrix.length-1;
//        int startCol=0;
//        int endCol=matrix[0].length-1;
//
//        while(startRow<=endRow && startCol<=endCol){
//            // top
//            for(int j=startCol;j<=endCol;j++){
//                System.out.print(matrix[startRow][j]+" ");
//            }
//            // right
//            for(int i=startRow+1;i<=endRow;i++){
//                System.out.print(matrix[i][endCol]+" ");
//            }
//            // bottom
//            for(int j=endCol-1;j>=startCol;j--){
//                if(startRow==endRow){
//                    break;
//                }
//                System.out.print(matrix[endRow][j]+" ");
//            }
//            // left
//            for(int i=endRow-1;i>=startRow+1;i--){
//                if(startCol==endCol){
//                    break;
//                }
//                System.out.print(matrix[i][startCol]+" ");
//            }
//            startRow++;
//            startCol++;
//            endRow--;
//            endCol--;
//        }
//        System.out.println();
//    }

    //Question->2

//    public static int digonalSum(int matrix[][]){
//        int Array.sum=0;
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if((i==j)){ // primary digonal
//                    Array.sum+=matrix[i][j];
//                }
//                if(i+j==matrix.length-1){  // secondary digonal
//                    Array.sum+=matrix[i][j];
//                }
//            }
//        }
//        return Array.sum;
//    }

    //Question->3

//    public static boolean Search(int matrix[][],int key){
//        int row=0;
//        int col=matrix[0].length-1;
//
//        while(row<matrix.length && col>0){
//            if(matrix[row][col]==key){
//                System.out.println("key found at("+row+","+col+")");
//                return true;
//            }
//            else if(key<matrix[row][col]){
//                col--;
//            }
//            else{
//                row++;
//            }
//        }
//        return false;
//    }
//    public static void main(String args[]){
//            int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//            int key=33;
//        System.out.println(Search(matrix,key));
//    }


    //Question->4
//      public static boolean isPelindrom(String str){
//          for(int i=0;i<str.length()/2;i++){
//              if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//                  return false;
//              }
//          }
//          return true;
//      }

    // Question->5

//    public static float getShortpath(String path){
//        int x=0;
//        int y=0;
//        for(int i=0;i<path.length();i++){
//            char dir=path.charAt(i);
//            // south
//            if(dir=='S'){
//                y--;
//            }
//            // north
//           else if(dir=='N'){
//               y++;
//            }
//           // west
//           else if(dir=='W'){
//               x--;
//            }
//           // east
//           else{
//               x++;
//            }
//        }
//        int x2=(x*x);
//        int y2=(y*y);
//        return (float)Math.sqrt(x2+y2);
//    }

    // Question->6

//    public static String subString(String str,int si,int ei){
//        String subStr="";
//        for(int i=si;i<ei;i++){
//            subStr+=str.charAt(i);
//        }
//        return subStr;
//    }

    // Question->7

//    public static void main(String[] args) {
//        String fruits[]={"apple","mango","banana"};
//        String String.largest=fruits[0];
//        for(int i=1;i<fruits.length;i++){
//            if(String.largest.compareTo(fruits[i])<0){
//                String.largest=fruits[i];
//            }
//        }
//        System.out.println(String.largest);
//
//    }

    // Question->8

//    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder("");
//        String s1="Arif";
//        String s2="Arif";
//        if(s1==s2){
//            System.out.println("the string are the same object");
//        }else{
//            System.out.println("String are the different object");
//        }
//
//        String interneds1=s1.intern();
//        String interneds2=s2.intern();
//        if(interneds1==interneds2){
//            System.out.println("String are same object");
//        }else{
//            System.out.println("String are different object");
//        }
//    }


    // Question->9
//    public static String toUpperCase(String str){
//       StringBuilder sb=new StringBuilder("");
//       char ch=Character.toUpperCase(str.charAt(0));
//       sb.append(ch);
//       for(int i=1;i<str.length();i++){
//           if(str.charAt(i)==' ' && i<str.length()-1){
//               sb.append(str.charAt(i));
//               i++;
//               sb.append(Character.toUpperCase(str.charAt(i)));
//           }else{
//               sb.append(str.charAt(i));
//           }
//       }
//       return sb.toString();
//    }
//    public static void main(String[] args) {
//       String str= "i am arif abbas";
//        System.out.println(toUpperCase(str));

    // Question->10

//    public static String compress(String str,String newString) {
//        for(int i=0;i<str.length();i++){
//            Integer count=1;
//            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newString+=str.charAt(i);
//            if(count>1){
//                newString+=count.toString();
//            }
//        }
//        return newString;
//    }
//       public static void main(String[] args) {
//           String str="aaabbbcccdd";
//           System.out.println(compress(str," "));
//       }

    // Question->11
//     public static String subString(String str,int si,int ei,String subStr){
//
//         for(int i=si;i<ei;i++){
//             subStr+=str.charAt(i);
//         }
//         return subStr;
//     }
//    public static void main(String[] args) {
//        String str="helloworld";
//        System.out.println(subString(str,0,10,""));
//    }


    // Question->12


//      public static void main(String[] args) {
//          Reddog r1=new Reddog();
//          r1.weep();
//          r1.walk();
//          r1.eat();
//      }
//      }
//      class Animal1{
//    String color;
//    void eat(){
//        System.out.println("something eat");
//    }
//    void walk(){
//        System.out.println("always walk");
//    }
//      }
//      class Dog extends Animal1{
//    void bark(){
//        System.out.println("always bark");
//    }
//      }
//      class Reddog extends Dog{
//    void weep(){
//        System.out.println("aoooo");
//    }

    // question->13

//    public static int printNum(int n){
//        if(n==0 || n==1){
//            return n;
//        }
//       int f1=printNum(n-1);
//        int f2=printNum(n-2);
//        int fn=f1+f2;
//        return fn;
//    }
//    public static void main(String[] args) {
//        int n=10;
//        System.out.println(printNum(n));
//    }


    // question->14

//    public static boolean isSorted(int arr[],int i){
//        if(i==arr.length-1){
//            return true;
//        }
//        if(arr[i]>arr[i+1]){
//            return false;
//        }
//         return isSorted(arr,i+1);
//
//    }
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        System.out.println(isSorted(arr,0));
//    }

    // question->15

//    public static int firstOccurance(int arr[],int key,int i){
//        if(i==arr.length){
//            return -1;
//        }
//        if(arr[i]==key){
//            return i;
//        }
//        return firstOccurance(arr,key,i+1);
//    }
//    public static void main(String[] args) {
//        int arr[]={8,5,6,9,5,10,6,3,3};
//        System.out.println(firstOccurance(arr,5,0));
//    }

    // question->16

//    public static int lastOccurance(int arr[],int key,int i){
//        if(i==arr.length){
//            return -1;
//        }
//        int isFound=lastOccurance(arr,key,i+1);
//        if(isFound==-1 && arr[i]==key){
//            return i;
//        }
//        return isFound;
//    }
//    public static void main(String[] args) {
//        int arr[]={8,5,6,9,5,10,6,3,3};
//        System.out.println(lastOccurance(arr,5,0));
//    }


    // Question->17

//    public static int Recursion.power(int x,int n){
//        if(n==0){
//            return 1;
//        }
//       int xnm1= Recursion.power(x,n-1);
//       int xn=x*xnm1;
//       return xn;
//    }
//     public static void main(String[] args) {
//         System.out.println(Recursion.power(2,10));
//     }

    // Question->18

//    public static int optimizedPower(int x,int n){
//        // base case
//        if(n==0){
//            return 1;
//        }
//        // even
//        int halfPowerSq=optimizedPower(x,n/2)*optimizedPower(x,n/2);
//        // odd
//        if(n%2!=0){
//            halfPowerSq=x*halfPowerSq;
//        }
//        return halfPowerSq;
//    }
//    public static void main(String[] args) {
//        System.out.println(optimizedPower(2,10));
//    }

    // question->19

//    public static int tillingProblem(int n){
//        // base case
//        if(n==0||n==1){
//            return 1;
//        }
//        int fnm1=tillingProblem(n-1);
//        int fnm2=tillingProblem(n-2);
//        int totalWays=fnm1+fnm2;
//        return totalWays;
//    }
//    public static void main(String[] args) {
//        System.out.println(tillingProblem(3));
//    }

    // Question->20

//    public static int friendsPairing(int n){
//        if(n==1 || n==2){
//            return n;
//        }
//        // choice-single choice
//        int fnm1=friendsPairing(n-1);
//        // choice-pairing
//        int fnm2=friendsPairing(n-2);
//        int pairWays=(n-1)*fnm2;
//        // totalWays
//        int totalWays=fnm1+pairWays;
//        return totalWays;
//    }
//    public static void main(String[] args) {
//        System.out.println(friendsPairing(3));
//    }

    // Question-21
//    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
//    public static void Recursion.printDigit(int n){
//        if(n==0){
//            return;
//        }
//        int lastDigit=n%10;
//        Recursion.printDigit(n/10);
//        System.out.println(digits[lastDigit]+"");
//    }
//    public static void main(String[] args) {
//        Recursion.printDigit(12345);
//        System.out.println();
//    }


    // question-22
//
//    public static int length(String str){
//        if(str.length()==0){
//            return 0;
//        }
//        return length(str.substring(1))+1;
//    }
//    public static void main(String[] args) {
//        String str="abcde";
//        System.out.println(length(str));
//    }

    // question-23

//    public static void printRev(String str,int idx){
//        if(idx==0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printRev(str,idx-1);
//    }
//    public static void main(String[] args) {
//        String str="abcd";
//        printRev(str,str.length()-1);
//    }

    // question-24
//    public static void moveAllx(String str,int idx,int count,String newString){
//        if(idx==str.length()){
//            for(int i=0;i<count;i++){
//                newString+='x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currChar=str.charAt(idx);
//        if(currChar=='x'){
//            count++;
//            moveAllx(str,idx+1,count,newString);
//        }else{
//            newString+=currChar;
//            moveAllx(str,idx+1,count,newString);
//        }
//    }
//    public static void main(String[] args) {
//        String str="axbcxxd";
//        moveAllx(str,0,0,"");
//    }

    // Question->25

//   public static void subSequence(String str,int idx,String newString){
//       if(idx==str.length()){
//           System.out.println(newString);
//           return;
//       }
//       char currChar=str.charAt(idx);
//       // to be add
//       subSequence(str,idx+1,newString+currChar);
//       // to be not add
//       subSequence(str,idx+1,newString);
//   }
//    public static void main(String[] args) {
//       String str="abc";
//       subSequence(str,0,"");
//    }

    // Question->26
//    public static void uniqueSubSq(String str,int idx,String newString,HashSet<String>set){
//        if(idx==str.length()){
//            if(set.contains(newString)){
//                return;
//            }else{
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//        char currChar=str.charAt(idx);
//        // to be add
//        uniqueSubSq(str,idx+1,newString+currChar,set);
//        // to be not add
//        uniqueSubSq(str,idx+1,newString,set);
//    }
//    public static void main(String[] args) {
//        String str="aaa";
//       HashSet<String>set=new HashSet<>();
//       uniqueSubSq(str,0,"",set);
//
//    }

    // Question->27
//    public static void permutation(String str,String permutation){
//        // base case
//        if(str.length()==0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0;i<str.length();i++){
//            char currChar=str.charAt(i);
//            // abcde=("ab"+"de") then c is remove
//            String newString=str.substring(0,i)+str.substring(i+1);
//            permutation(newString,permutation+currChar);
//        }
//    }
//    public static void main(String[] args) {
//        String str="abc";
//        permutation(str,"");
//    }

    // Question->28
//    public static int countPaths(int i,int j,int n,int m){
//        if(i==n-1 && j==m-1){  // last path,we can't move from here
//            return 1;
//        }
//        if(i==n || j==m){ // we are leaving the cell
//            return 0;
//        }
//        // move downward
//        int downPaths=countPaths(i+1,j,n,m);
//        // move right
//        int rightPaths=countPaths(i,j+1,n,m);
//        int totalPaths=downPaths+rightPaths;
//        return totalPaths;
//    }
//    public static void main(String[] args) {
//        int n=3,m=3;
//        System.out.println(countPaths(0,0,n,m));
//
//    }

    // Question->29

//    public static void print(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//        public static void Sorting.mergeSort(int arr[],int si,int ei){
//        while(si>=ei){
//            return;
//        }
//        int mid=si+(ei-si)/2;
//        Sorting.mergeSort(arr,si,mid);
//        Sorting.mergeSort(arr,mid+1,ei);
//        merge(arr,si,mid,ei);
//        }
//        public static void merge(int arr[],int si,int mid,int ei){
//        int temp[]=new int[ei-si+1];
//        int i=si;
//        int j=mid+1;
//        int k=0;
//
//        while(i<=mid && j<=ei){
//            if(arr[i]<arr[j]){
//                temp[k]=arr[i];
//                i++;
//            }else{
//                temp[k]=arr[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<=mid){
//            temp[k++]=arr[i++];
//        }
//        while(j<=ei){
//            temp[k++]=arr[j++];
//        }
//        for(k=0,i=si;k<temp.length;k++,i++){
//            arr[i]=temp[k];
//        }
//        }
//    public static void main(String[] args) {
//        int arr[]={6,3,9,5,2,7,8};
//        Sorting.mergeSort(arr,0,arr.length-1);
//        print(arr);
//    }

    // Question->30

//    public static void printArr(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void quickSort(int arr[],int si,int ei){
//        while(si>=ei){
//            return;
//        }
//        int pIdx = partition(arr,si,ei);
//        quickSort(arr,si,pIdx-1);
//        quickSort(arr,pIdx+1,ei);
//    }
//    public static int partition(int arr[],int si,int ei){
//        int pivot=arr[ei];
//        int i=si-1;
//        for(int j=si;j<ei;j++){
//            if(arr[j]<pivot){
//                i++;
//                // swap
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//            }
//        }
//        i++;
//        // swap
//        int temp=pivot;
//        arr[ei]=arr[i];
//        arr[i]=temp;
//        return i;
//    }
//    public static void main(String[] args) {
//     int arr[]={6,3,9,8,7,2,5};
//     quickSort(arr,0,arr.length-1);
//     printArr(arr);
//    }

    // Question->31

//    public static int search(int arr[],int tar,int si,int ei){
//        if(si>ei){
//            return-1;
//        }
//        // kaam
//        int mid=si+(ei-si)/2;
//        if(arr[mid]==tar){
//            return mid;
//        }
//        // mid on l1
//        if(arr[si]<=arr[mid]){
//            // case-a
//            if(arr[si]<=tar && tar<=arr[mid]){
//                return search(arr,tar,si,mid-1);
//            }else{
//                return search(arr,tar,mid+1,ei);
//            }
//        }else{  // mid on l2
//            if(arr[mid]<=tar && tar<=arr[ei]){
//                return search(arr,tar,mid+1,ei);
//            }else{
//                return search(arr,tar,si,mid-1);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={4,5,6,7,0,1,2};
//        int tar=0;
//        System.out.println(search(arr,tar,0,arr.length-1));
//    }

    // Question->32

//    public static void changeArr(int arr[],int i,int val){
//        if(i==arr.length){
//            printArr(arr);
//            return;
//        }
//        arr[i]=val;
//        changeArr(arr,i+1,val+1);
//        arr[i]=arr[i]-2;
//    }
//    public static void printArr(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int arr[]=new int[5];
//        changeArr(arr,0,1);
//        printArr(arr);
//    }

    // question->33

//    static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data=data;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    static class BinaryTree{
//        static int idx=-1;
//        public static Node buildTree(int nodes[]){
//            idx++;
//            if(nodes[idx]==-1){
//                return null;
//            }
//            // create a new node
//            Node newNode=new Node(nodes[idx]);
//            newNode.left=buildTree(nodes);
//            newNode.right=buildTree(nodes);
//            return newNode;
//        }
//        public static void preorder(Node root){
//            if(root==null){
//                System.out.print(-1+" ");
//                return;
//            }
//            System.out.print(root.data+" ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tree=new BinaryTree();
//        Node root=tree.buildTree(nodes);
//        tree.preorder(root);
//    }

    // Question->34

//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        // Array.reverse
//        for(int i=list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//    }

    // Question->35

//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(6);
//        list.add(8);
//        list.add(5);
//
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
//            if(max<list.get(i)){
//                max=list.get(i);
//            }
//        }
//        System.out.println(max);
//    }

    // Question->36

//    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
//        int temp=list.get(idx1);
//        list.set(idx1,list.get(idx2));
//        list.set(idx2,temp);
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//
//        int idx1=1;
//        int idx2=3;
//        System.out.println(list);
//        swap(list,idx1,idx2);
//        System.out.print(list);
//    }

    // Question->37

//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(7);
//        list.add(5);
//        list.add(2);
//        list.add(6);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//    }

    // Question->38

//    public static boolean pairSum(ArrayList<Integer>list, int target) {
//        for (int i=0; i<list.size(); i++) {
//            for (int j=i+1; j<list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int target=5;
//        System.out.println(pairSum(list,target));
//    }

    // Question->39

//    public static int TrappedRainWater(ArrayList<Integer>height) {
//        int maxWater = 0;
//        int lp = 0;
//        int rp = height.size() - 1;
//        while (lp < rp) {
//            int ht = Math.min(height.get(lp), height.get(rp));
//            int width = rp - lp;
//            int currWater = ht * width;
//            maxWater = Math.max(currWater, maxWater);
//            // update
//            if (height.get(lp) < height.get(rp)) {
//                lp++;
//            } else {
//                rp--;
//            }
//        }
//        return maxWater;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer>height=new ArrayList<>();
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//        System.out.println(TrappedRainWater(height));
//    }

    // Question->40

//    public static boolean ArrayList.pairSum1(ArrayList<Integer>list,int target){
//        int lp=0;
//        int rp=list.size()-1;
//        while(lp!=rp) {
//            if(list.get(lp)+list.get(rp)==target){
//                return true;
//            }
//            if(list.get(lp)+list.get(rp)<target){
//                lp++;
//            }else{
//                rp--;
//            }
//        }
//        return false;
//    }


    // Question->41

//    public static boolean ArrayList.pairSum2(ArrayList<Integer>list,int target){
//        int bp=-1;
//        int n=list.size();
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)>list.get(i+1)){
//                bp=i;
//                break;
//            }
//        }
//        int lp=bp+1;
//        int rp=bp;
//
//        while(lp!=rp){
//            if(list.get(lp)+list.get(rp)==target){
//                return true;
//            }
//            if(list.get(lp)+list.get(rp)<target){
//                lp=(lp+1)%n;
//            }else{
//                rp=(n+rp-1)%n;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(11);
//        list.add(15);
//        list.add(6);
//        list.add(9);
//        list.add(8);
//        list.add(10);
//        int target=20;
//        System.out.println(ArrayList.pairSum2(list,target));
//    }

    // Question->42

//      public static class Node{
//            int data;
//            Node next;
//
//            public Node(int data){
//                  this.data=data;
//                  this.next=null;
//            }
//      }
//      public static Node head;
//      public static Node tail;
//      public static Node size;
//
//      public void addFirst(int data){
//            // create a newNode
//            Node newNode=new Node(data);
//            if(head==null){
//                  head=tail=newNode;
//                  return;
//            }
//            newNode.next=head;
//            head=newNode;
//      }
//      public void addLast(int data){
//            Node newNode=new Node(data);
//            if(tail==null){
//                  head=tail=newNode;
//                  return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//      }
//      public void print(){
//            if(head==null){
//                  System.out.println("ll is empty");
//            }
//            Node temp=head;
//            while(temp!=null){
//                  System.out.print(temp.data+"->");
//                  temp=temp.next;
//            }
//            System.out.println("null");
//      }
//    public static void main(String[] args) {
//          LinkedList.LinkedList ll =new LinkedList.LinkedList();
//          ll.print();
//          ll.addFirst(2);
//          ll.print();
//          ll.addFirst(1);
//          ll.print();
//          ll.addLast(3);
//          ll.print();
//          ll.addLast(4);
//          ll.print();
//    }

    // Question->43
//      public static class Node{
//            int data;
//            Node next;
//
//            public Node(int data){
//                  this.data=data;
//                  this.next=null;
//            }
//      }
//      public static Node head;
//      public static Node tail;
//      public static Node size;
//
//      public void addFirst(int data){
//            Node newNode=new Node(data);
//            if(head==null){
//                  head=tail=newNode;
//                  return;
//            }
//            newNode.next=head;
//            head=newNode;
//      }
//      public void addLast(int data){
//            Node newNode=new Node(data);
//            if(tail==null){
//                  head=tail=newNode;
//                  return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//      }
//      public void print(){
//            if(head==null){
//                  System.out.println("ll is empty");
//            }
//            Node temp=head;
//            while(temp!=null){
//                  System.out.print(temp.data+"->");
//                  temp=temp.next;
//            }
//            System.out.println("null");
//      }
//      public  int itrSearch(int key){
//            Node temp=head;
//            int i=0;
//            while(temp!=null){
//                  if(temp.data==key){
//                       return i;
//                  }
//                  temp=temp.next;
//                  i++;
//            }
//            return -1;
//      }
//      public int helper(Node head,int key){
//            if(head==null){
//                  return -1;
//            }
//            if(head.data==key){
//                  return 0;
//            }
//            int idx=helper(head.next,key);
//            if(idx==-1){
//                  return -1;
//            }
//            return idx+1;
//      }
//      public int recSearch(int key){
//           return helper(head,key);
//      }

//      public void Array.reverse(){
//            Node curr=tail=head;
//            Node prev=null;
//            Node next;
//            while(curr!=null){
//                  next=curr.next;
//                  curr.next=prev;
//                  prev=curr;
//                  curr=next;
//            }
//            head=prev;
//      }

//      public void deleteNthFromEnd(int n){
//            //calculate size
//           int sz=0;
//           Node temp=head;
//           while(temp!=null){
//                 temp=temp.next;
//                 sz++;
//           }
//           if(n==sz){
//                 head=head.next;
//                 return;
//           }
//           int i=1;
//           int iTofind=sz-n;
//           Node prev=head;
//           while(i<iTofind){
//                 prev=prev.next;
//                 i++;
//           }
//           prev.next=prev.next.next;
//      }

//      public Node findMid(Node head){
//            Node slow=head;
//            Node fast=head;
//            while(fast!=null && fast.next!=null){
//                  slow=slow.next;
//                  fast=fast.next.next;
//            }
//            return slow;
//      }
//      public boolean checkPelindrom(){
//            if(head==null || head.next==null){
//                  return true;
//            }
//            // step-1
//            Node midNode=findMid(head);
//            // step-2->Reverse Array.second half
//            Node curr=midNode;
//            Node prev=null;
//            Node next;
//            while(curr!=null){
//                  next=curr.next;
//                  curr.next=prev;
//                  prev=curr;
//                  curr=next;
//            }
//            Node right=prev;
//            Node left=head;
//            // step-3->check the left half & right half
//            while(right!=null){
//                  if(left.data!=right.data){
//                        return false;
//                  }
//                  left=left.next;
//                  right=right.next;
//            }
//            return true;
//      }
//      public static void main(String[] args) {
//           practice.practice pp=new practice.practice();
//           pp.print();
//           pp.addFirst(2);
//           pp.print();
//           pp.addFirst(1);
//           pp.print();
//           pp.addLast(5);
//           pp.print();
//           pp.addLast(2);
//           pp.print();
//           pp.addLast(1);
//           pp.print();
//
//            System.out.println(pp.itrSearch(4));
//            System.out.println(pp.recSearch(3));
//            pp.Array.reverse();
//            pp.print();
//            pp.deleteNthFromEnd(3);
//            pp.print();
//            System.out.println(pp.checkPelindrom());
//      }

    // Question->44

//      public static class Node{
//            int data;
//            Node next;
//
//            public Node(int data){
//                  this.data=data;
//                  this.next=null;
//            }
//      }
//      public static Node head;
//      public static Node tail;
//      public static Node size;
//
//      public static boolean isCycle(){
//            Node slow=head;
//            Node fast=head;
//            while(fast!=null && fast.next!=null){
//                  slow=slow.next;
//                  fast=fast.next.next;
//                  if(fast==slow){
//                        return true;
//                  }
//            }
//            return false;
//      }
//      public static void removeCycle(){
//            Node slow=head;
//            Node fast=head;
//            boolean cycle=false;
//            while(fast!=null && fast.next!=null){
//                  slow=slow.next;
//                  fast=fast.next.next;
//                  if(slow==fast){
//                        cycle=true;
//                        break;
//                  }
//            }
//            if(cycle==false){
//                  return;
//            }
//            // find again meeting point
//            slow=head;
//            Node prev=null;
//            while(slow!=fast){
//                  prev=fast;
//                  slow=slow.next;
//                  fast=fast.next;
//            }
//            prev.next=null;
//      }
//      public static void main(String[] args) {
//            head=new Node(1);
//            Node temp=new Node(2);
//            head.next=temp;
//            head.next.next=new Node(3);
//            head.next.next.next=temp;
//            System.out.println(isCycle());
//            removeCycle();
//            System.out.println(isCycle());
//      }

    // question->45

//      public static void main(String[] args) {
//            LinkedList.LinkedList<Integer>ll=new LinkedList.LinkedList<>();
//            ll.addFirst(2);
//            ll.addFirst(1);
//            ll.addFirst(0);
//            ll.addLast(3);
//            ll.addLast(4);
//            ll.add(3,6);
//            System.out.println(ll);
//      }

    // Question-46
//      public static class Node{
//            int data;
//            Node next;
//            Node prev;
//
//            public Node(int data){
//                  this.data=data;
//                  this.next=null;
//                  this.prev=null;
//            }
//      }
//      public static Node head;
//      public static Node tail;
//      public static Node size;
//
//      // addFirst
//      public void addFirst(int data){
//            Node newNode=new Node(data);
//            if(head==null){
//                  head=tail=newNode;
//                  return;
//            }
//            newNode.next=head;
//            head.prev=newNode;
//            head=newNode;
//      }
//      public void addLast(int data){
//            Node newNode=new Node(data);
//            if(tail==null){
//                  head=tail=newNode;
//                  return;
//            }
//            tail.next=newNode;
//            newNode.prev=tail;
//            tail=newNode;
//      }
//      public void print(){
//            Node temp=head;
//            while(temp!=null){
//                  System.out.print(temp.data+"<->");
//                  temp=temp.next;
//            }
//            System.out.println("null");
//      }
//      public int removeFirst(){
//            if(head==null){
//                  System.out.println("dll is empty");
//                  return Integer.MIN_VALUE;
//            }
//            int val=head.data;
//            head=head.next;
//            head.prev=null;
//            return val;
//      }
//      public void Array.reverse(){
//            Node curr=head;
//            Node prev=null;
//            Node next;
//            while(curr!=null){
//                  next=curr.next;
//                  curr.next=prev;
//                  curr.prev=next;
//                  prev=curr;
//                  curr=next;
//            }
//            head=prev;
//      }
//      public static void main(String[] args) {
//           practice.practice dll=new practice.practice();
//           dll.addFirst(2);
//           dll.addFirst(1);
//           dll.addLast(3);
//           dll.addLast(4);
//           dll.print();
//           dll.removeFirst();
//            dll.print();
//            dll.Array.reverse();
//            dll.print();
    // }

    // Question->47
//      static class stack{
//             static ArrayList<Integer>list=new ArrayList<>();
//            public static boolean isEmpty(){
//                  return list.size()==0;
//            }
//            public static void push(int data){
//                  list.add(data);
//            }
//            public static int pop(){
//                  if(isEmpty()){
//                        return -1;
//                  }
//                  int top=list.get(list.size()-1);
//                  list.remove(list.size()-1);
//                  return top;
//            }
//            public static int peek(){
//                  return list.get(list.size()-1);
//            }
//      }
//
//      public static void main(String[] args) {
//            Stack s=new Stack();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            while(!s.isEmpty()){
//                  System.out.println(s.peek());
//                  s.pop();
//            }
//      }

    // Question-48

//      static class Node{
//            int data;
//            Node next;
//
//            public Node(int data){
//                  this.data=data;
//                  this.next=null;
//            }
//      }
//      static class Stack{
//            static Node head=null;
//            // empty
//            public static boolean isEmpty(){
//                  return head==null;
//            }
//            public static void push(int data){
//                  Node newNode=new Node(data);
//                  if(isEmpty()){
//                        head=newNode;
//                        return;
//                  }
//                  newNode.next=head;
//                  head=newNode;
//            }
//            public static int pop(){
//                  if(isEmpty()){
//                        return -1;
//                  }
//                  int top=head.data;
//                  head=head.next;
//                  return top;
//            }
//            public static int peek(){
//                  if(isEmpty()){
//                        return -1;
//                  }
//                  return head.data;
//            }
//      }

    // Question->49

//      public static void main(String[] args) {
//            Stack<Integer>s=new Stack<>();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            while(!s.isEmpty()){
//                  System.out.println(s.peek());
//                  s.pop();
//            }
//      }

    // Question->50

//      public static void pushAtBottom(Stack<Integer>s,int data){
//            if(s.isEmpty()){
//                  s.push(data);
//                  return;
//            }
//            int top=s.pop();
//            pushAtBottom(s,data);
//            s.push(top);
//      }
//      public static void main(String[] args) {
//            Stack<Integer>s=new Stack<>();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            pushAtBottom(s,4);
//            while(!s.isEmpty()){
//                  System.out.println(s.peek());
//                  s.pop();
//            }
//      }

    // Question->51

//      public static String reverseString(String str,String newString){
//            Stack<Character>s=new Stack<>();
//            int idx=0;
//            while(idx<str.length()){
//                  s.push(str.charAt(idx));
//                  idx++;
//            }
//            while(!s.isEmpty()){
//                  char curr=s.pop();
//                  newString+=curr;
//            }
//            return newString;
//      }
//      public static void main(String[] args) {
//            String str="abc";
//            System.out.println(reverseString(str,""));
//      }


    // Question->52

//    public static void pushAtBottom(Stack<Integer>s,int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottom(s,data);
//        s.push(top);
//    }
//    public static void reverseStack(Stack<Integer>s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top=s.pop();
//        reverseStack(s);
//        pushAtBottom(s,top);
//    }
//     public static void printStack(Stack<Integer>s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//      public static void main(String[] args) {
//            Stack<Integer>s=new Stack<>();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            reverseStack(s);
//            printStack(s);
//      }

    // Question->53-> next GreaterElement From right side

//    public static void main(String[] args) {
//        int arr[]={6,9,0,1,3};
//        Stack<Integer>s=new Stack<>();
//        int nextGreater[]=new int[arr.length];
//       for(int i=arr.length-1;i>=0;i--){
//           while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
//               s.pop();
//           }
//           if(s.isEmpty()){
//               nextGreater[i]=-1;
//           }else{
//               nextGreater[i]=arr[s.peek()];
//           }
//           s.push(i);
//       }
//        for(int i=0;i<nextGreater.length;i++){
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();
//    }

    // Question-54

//    public static void maxArea(int arr[]){
//        int maxArea=0;
//        int nextSmallerRight[]=new int[arr.length];
//        int nextSmallerLeft[]=new int[arr.length];
//        // nextSmallerRight
//        Stack<Integer>s=new Stack<>();
//        for(int i=arr.length-1;i>=0;i--){
//            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nextSmallerRight[i]=arr.length;
//            }else{
//                nextSmallerRight[i]=s.peek();
//            }
//            s.push(i);
//        }
//        // nextSmallerLeft
//      for(int i=0;i<arr.length;i++){
//          while(!s.isEmpty() && arr[s.peek()]>arr[i]){
//              s.pop();
//          }
//          if(s.isEmpty()){
//              nextSmallerLeft[i]=-1;
//          }else{
//              nextSmallerLeft[i]=s.peek();
//          }
//          s.push(i);
//      }
//        // current Area=width=j-i-1
//        for(int i=0;i<arr.length;i++){
//            int ht=arr[i];
//            int width=nextSmallerRight[i]-nextSmallerLeft[i]-1;
//            int currArea=ht*width;
//            maxArea=Math.max(currArea,maxArea);
//        }
//        System.out.println("maxArea of histogram ="+maxArea);
//    }
//    public static void main(String[] args) {
//        int arr[]={2,1,5,6,2,3};
//        maxArea(arr);
//    }

    // Question->55
//    public static int length(String str){
//        if(str.length()==0){
//            return 0;
//        }
//        return length(str.substring(1))+1;
//    }

    // Question-56
//    public static void reverse(String str, int idx) {
//        if (idx == 0) {
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        Array.reverse(str, idx - 1);
//    }
//
//    public static void main(String[] args) {
//        String str = "abcd";
//        reverse(str, str.length() - 1);
//    }

    // Question-57

//    public static String printUpper(String str){
//        String newStr=" ";
//        char ch=(Character.toUpperCase(str.charAt(0)));
//        newStr+=ch ;
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i)==' ' && i<str.length()-1){
//                i++;
//                newStr+=(Character.toUpperCase(str.charAt(i)));
//            }else{
//                newStr+=(str.charAt(i));
//            }
//        }
//        return newStr;
//    }
//    public static void main(String[] args) {
//        String str="i am arif abbas";
//        System.out.println(printUpper(str));
//    }

    // Question-58

    //    public static String compress(String str,String newString){
//        for(int i=0;i<str.length();i++){
//            Integer count=0;
//            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newString+=str.charAt(i);
//            if(count>1){
//                newString+=count.toString();
//            }
//        }
//        return newString;
//    }
//    public static void main(String[] args) {
//        String str="aaabbbccc";
//        System.out.println(compress(str,""));
//    }

    // Question-59

//    public static void pushAtBottom(Stack<Integer>s,int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottom(s,data);
//        s.push(top);
//    }
//    public static void reverse(Stack<Integer>s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top=s.pop();
//        reverse(s);
//        pushAtBottom(s,top);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer>s=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        Array.reverse(s);
//        while(!s.isEmpty()){
//            System.out.println( s.pop());
//
//        }
//    }
//    public static void stockSpan(int stocks[],int span[]){
//        Stack<Integer>s=new Stack<>();
//        span[0]=1;
//        s.push(0);
//
//        for(int i=1;i<stocks.length;i++){
//            int currPrice=stocks[i];
//            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                span[i]=i+1;
//            }else{
//                int prevHigh=s.peek();
//                span[i]=i-prevHigh;
//            }
//            s.push(i);
//        }
//    }
//      public static void main(String[] args) {
//        int stocks[]={100,80,60,70,60,85,100};
//        int span[]=new int[stocks.length];
//        stockSpan(stocks,span);
//        for(int i=0;i<span.length;i++){
//            System.out.print(span[i]+" ");
//        }

    public static void main(String[] args) {
        for(int k=1;k<=10;k++){
            System.out.println(12*k);
            System.out.println("sunny deol");
        }
    }
  }


