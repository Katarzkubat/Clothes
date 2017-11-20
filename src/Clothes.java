import java.io.Serializable;

public class Clothes implements Serializable {
    private static final long serialVersionUID = 3812017177088226529L;

    private String type;
    private String brand;
    private String size;
    private int price;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Clothes(String type, String brand, String size, int price){
        setType(type);
        setBrand(brand);
        setSize(size);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

}
