package ArrayList;

import java.util.ArrayList;
public class usingArrayList {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        // add Element
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
        System.out.println(list);

        // set Element
        list.set(2,10);
        System.out.println(list);

        // get Element
       int element= list.get(3);
        System.out.println(element);

        // remove Element
        list.remove(3);
        System.out.println(list);

        // contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
