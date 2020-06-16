package les03;

public class Test01 {
    public static void main(String[] args) {

        int a=6, b=4;
        a=++a+b+++a++;
        int c=--a+b--;
        System.out.println("a="+a+" b="+b+" c="+c);


    }
}
