package classes005;

public class NotaEstudante {

    public String name;
    public double nota1, nota2, nota3;

    public double notaTotal() {
        return (nota1 + nota2 + nota3);
    }


    public double aprovado() {
        if (notaTotal() > 60) {
            return 0;
        } else {
            return 60 - notaTotal();
        }
    }
}

