package les02.generick;


//import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List rawList= new ArrayList();
        List<String> list=new ArrayList<>();
        list.add("dr");


        rawList=list;
        rawList.add(8);
        System.out.println(rawList);



    }
}
