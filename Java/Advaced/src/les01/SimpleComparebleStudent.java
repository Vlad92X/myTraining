package les01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparebleStudent {
    private String firstName;
    private int group;

    public String getFirstName() {
        return firstName;
    }

    public int getGroup() {
        return group;
    }

    public SimpleComparebleStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString(){
        return firstName+""+group;
    }



    /*       @Override
        public int compareTo(Object o){
            if (this.group>((SimpleComparebleStudent)o).group){
                return 1;
            }
            else if (this.group<((SimpleComparebleStudent)o).group){
                return -1;
            }
            else return 0;

        }*/
}

class SimleComparatorStudent implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String firstName1=((SimpleComparebleStudent)o1).getFirstName();
        String firstName2=((SimpleComparebleStudent)o2).getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

class Main{
    public static void main(String[] args) {
        SimpleComparebleStudent[]myStudents={
                new SimpleComparebleStudent("Yevgenii",333),
                new SimpleComparebleStudent("Andrew",222),
                new SimpleComparebleStudent("Igor",111),
                new SimpleComparebleStudent("Peter",300)

        };

        Arrays.sort(myStudents,new SimleComparatorStudent());

        for (SimpleComparebleStudent myStudent:myStudents){
            System.out.println(myStudent );
        }
    }
}