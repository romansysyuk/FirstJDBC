package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Delivery {
    private int id;
    private int date;
    private int id_city;
    private int id_typeDelivery;
    private int id_placeDelivery;

    public Delivery() {
    }

    public Delivery(int date, int id, int id_city, int id_placeDelivery, int id_typeDelivery) {
        this.date = date;
        this.id = id;
        this.id_city = id_city;
        this.id_placeDelivery = id_placeDelivery;
        this.id_typeDelivery = id_typeDelivery;
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

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public int getId_placeDelivery() {
        return id_placeDelivery;
    }

    public void setId_placeDelivery(int id_placeDelivery) {
        this.id_placeDelivery = id_placeDelivery;
    }

    public int getId_typeDelivery() {
        return id_typeDelivery;
    }

    public void setId_typeDelivery(int id_typeDelivery) {
        this.id_typeDelivery = id_typeDelivery;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "date=" + date +
                ", id=" + id +
                ", id_city=" + id_city +
                ", id_typeDelivery=" + id_typeDelivery +
                ", id_placeDelivery=" + id_placeDelivery +
                '}';
    }
}
