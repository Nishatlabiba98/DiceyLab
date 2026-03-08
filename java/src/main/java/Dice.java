

public class Dice {
    int toss;

    public Dice(int toss) {
        this.toss = toss;
    }
public Integer tossAndSum() {
    int sum = 0;
    for (int i = 0; i < toss; i++) {
        sum += (int)(Math.random() * 6) + 1;
    }
    return sum;
}


public static void main (String [] args){
    Dice dice = new Dice(5);

    System.out.println(dice.tossAndSum());

}

}
