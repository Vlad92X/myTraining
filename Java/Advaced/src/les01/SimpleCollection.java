package les01;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list.add(1));
        //System.out.println(list.size());
        Collection<Integer>list2=new ArrayList<>();
        System.out.println(list2.size());
        list2.addAll(list);
        System.out.println(list2+" "+list2.size());
        list2.clear();
        System.out.println(list2+" "+list2.size());
        System.out.println(list2.isEmpty());
        Object [] arr=list2.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length );

    }
}
