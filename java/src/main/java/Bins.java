
public class Bins {
int[] bins;
int min;

    public Bins(int min, int max) {
        this.min = min;
        bins = new int[max - min + 1];
    }
    public Integer getBin(int bin) {
        return bins[bin - min];
    }
    public void incrementBin(int bin) {
        bins[bin - min]++;
    }
}
