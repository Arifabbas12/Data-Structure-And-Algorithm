package ArrayList;

import java.util.ArrayList;
public class printMaxNumArrayList {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(4);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
           if(max<list.get(i)){
               max=list.get(i);
           }
        }
        System.out.println("the max number is : "+max);
    }

}
