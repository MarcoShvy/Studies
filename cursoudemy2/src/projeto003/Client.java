package projeto003;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name +", ");
        sb.append(sdf.format(birthDate) +" - ");
        sb.append(email);
        return sb.toString();
    }
}
