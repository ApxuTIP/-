package JavaFarmProject;

public class Counter implements AutoCloseable{
    public int sum = 0;
    public void riseSum(){
        sum += 1;
    }
    public int getSum() {
        return sum;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}