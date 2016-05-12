package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Product {

    private int id;
    private String name;
    private String fk_measure;
    private int price;
    private String desc;
    private int size;
    private int fk_typeProd;

    public Product(){

    }

    public Product(String desc, String fk_measure, int fk_typeProd, int id, String name, int price, int size) {
        this.desc = desc;
        this.fk_measure = fk_measure;
        this.fk_typeProd = fk_typeProd;
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFk_measure() {
        return fk_measure;
    }

    public void setFk_measure(String fk_measure) {
        this.fk_measure = fk_measure;
    }

    public int getFk_typeProd() {
        return fk_typeProd;
    }

    public void setFk_typeProd(int fk_typeProd) {
        this.fk_typeProd = fk_typeProd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "desc='" + desc + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", fk_measure='" + fk_measure + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", fk_typeProd=" + fk_typeProd +
                '}';
    }
}
