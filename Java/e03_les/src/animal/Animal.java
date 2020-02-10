package animal;

public class Animal {
    private int weight;
    private String brade;

    Animal(int weight, String brade){
        this.weight=weight;
        this.brade=brade;

    }

    Animal(){

    }
    public int getWeight() {
        return weight;
    }

    public String getBrade() {
        return brade;
    }
}
