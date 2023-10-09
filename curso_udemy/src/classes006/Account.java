package classes006;

public class Account {

    private int conta;
    private String dono;
    private double value;

    
    public Account (int conta, String dono) {
        this.conta = conta;
        this.dono = dono;
    }

    public Account (int conta, String dono, double initialDeposit) {
        this.conta = conta;
        this.dono = dono;
        addMoney(initialDeposit);
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getValue() {
        return value;
    }

    public void addMoney(double value) {
        this.value += value;
    }

    public void removeMoney(double value) {
        this.value -= value;
        this.value -= 5;
    }

    public String toString() {
        return "Number: "+ conta+", Holder: "+ dono+ ", Balance: " + value;
    }
}