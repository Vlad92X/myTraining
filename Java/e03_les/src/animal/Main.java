package animal;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat(5,"Marsel",6,"Sphynx");
        Cat c2=new Cat(3,"Barsick",6,"Main Coon");

        System.out.println(c.age+" "+c.name+" "+c.getWeight()+" "+c.getBrade());
        System.out.println(c2.age+" "+c2.name+" "+c2.getWeight()+" "+c2.getBrade());
    }
}
