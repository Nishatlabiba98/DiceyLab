public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    Bins bins;
    Dice dice;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        bins = new Bins(numberOfDice, numberOfDice * 6);
        dice = new Dice(numberOfDice);
    }


public void runSimulation() {
    for (int i = 0; i < numberOfTosses; i++) {
        bins.incrementBin(dice.tossAndSum());
    }
  }
public void printResults() {
    System.out.println("Simulation of " + numberOfTosses + " tosses of " + numberOfDice + " dice:");
    for (int i = bins.min; i < bins.bins.length + bins.min; i++) {
        System.out.println(i + ": " + bins.getBin(i));
    }
  }
public static void main(String[] args) {
    Simulation simulation = new Simulation(2, 1000);
    simulation.runSimulation();
    simulation.printResults();
}
}
