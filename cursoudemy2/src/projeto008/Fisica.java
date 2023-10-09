package projeto008;

public class Fisica extends Pessoa{
    private Double health;

    public Fisica(){}

    public Fisica(String name, Double renda, Double health) {
        super(name, renda);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public Double tax() {
        Double tax = 0.0;
        if (getRenda() < 20000) {
            tax = getRenda() * 0.15;
        } else {
            tax = getRenda() * 0.25;
        }
        tax -= getHealth() * 0.5;
        return tax;
    }
}
