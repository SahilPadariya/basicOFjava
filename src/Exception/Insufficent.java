package Exception;

public class Insufficent extends Exception {
    private double amount;

    @Override
    public String toString(){
        return "What do you want ? you don't have money";
    }
    public Insufficent(double amount){
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
}
