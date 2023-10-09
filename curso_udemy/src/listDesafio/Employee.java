package listDesafio;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        this.salary += salary*percentage/100;
    }

    @Override
    public String toString() {
        return id + ", " + name +", " + salary;
    }
}
