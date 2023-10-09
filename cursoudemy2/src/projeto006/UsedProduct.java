package projeto006;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UsedProduct extends Product{

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return getName() + " (used) $ " +getPrice()+"(Manufacture date: "+formato.format(manufactureDate)+")";
    }
}
