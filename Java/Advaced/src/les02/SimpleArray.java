package les02;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
//        al.add(10);
////        al.add(20);
////        al.add(0,30);
////        al.add(40);

//        for (Integer integer: al){
//            System.out.println(integer);
//        }
        for (int i = 0; i < 100; i++) {
            if(i<10) System.out.print(0);
            al.add(i);
            System.out.print(al.get(i)+" ");
        if(i==49) System.out.println();
        }
        System.out.println("\n\tsize="+al.size());

        for (int i = 0; i <50 ; i++) {
            al.remove(0);

        }
        for (Integer integer: al) {
            System.out.print(integer+" ");
        }
        System.out.println("\n\tsize="+al.size());

    }
}
