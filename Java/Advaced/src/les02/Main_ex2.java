package les02;

//import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main_ex2 {
    public static void main(String[] args) throws Exception{
        //вызываем метод,  изменяющий время 10 тысяч вставок в список
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list){
        //создаем объект Date
        Date currentTime =new Date();
        //Вызываем метод insert10000
        insert10000(list);
        Date newTime=new Date();
        //Вычисляем разницу между currtentTime и newTime
        long msDelay=newTime.getTime()-currentTime.getTime();
        System.out.println("Time distance is: "+msDelay+" in ms");

        return msDelay;
    }

    public static void insert10000(List list){
        for (int i = 0; i <100000 ; i++) {
            //Вставляем в начало объекты
            list.add(new Object());

        }
    }
}
