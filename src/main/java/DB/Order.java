package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Order {
    private int id;
    private int date;
    private int time;
    private int id_typePay;
    private int id_delivery;
    private int id_client;
    private int id_product;

    public Order() {
    }

    public Order(int date, int id, int id_client, int id_delivery, int id_product, int id_typePay, int time) {
        this.date = date;
        this.id = id;
        this.id_client = id_client;
        this.id_delivery = id_delivery;
        this.id_product = id_product;
        this.id_typePay = id_typePay;
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_delivery() {
        return id_delivery;
    }

    public void setId_delivery(int id_delivery) {
        this.id_delivery = id_delivery;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_typePay() {
        return id_typePay;
    }

    public void setId_typePay(int id_typePay) {
        this.id_typePay = id_typePay;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", id=" + id +
                ", time=" + time +
                ", id_typePay=" + id_typePay +
                ", id_delivery=" + id_delivery +
                ", id_client=" + id_client +
                ", id_product=" + id_product +
                '}';
    }
}
