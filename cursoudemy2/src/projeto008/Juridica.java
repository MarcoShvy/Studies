package projeto008;

public class Juridica extends Pessoa{
    private int empregados;

    public Juridica(){}

    public Juridica(String name, Double renda, int empregados) {
        super(name, renda);
        this.empregados = empregados;
    }

    public int getEmpregados() {
        return empregados;
    }

    public void setEmpregados(int empregados) {
        this.empregados = empregados;
    }

    @Override
    public Double tax() {
        Double tax;
        if(empregados > 10) {
            tax = getRenda() * 0.14;
        } else {
            tax = getRenda() * 0.16;
        }
        return tax;
    }
}
