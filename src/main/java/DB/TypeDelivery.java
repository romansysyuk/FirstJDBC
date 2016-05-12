package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class TypeDelivery {
    private int id;
    private String name;

    public TypeDelivery() {
    }

    public TypeDelivery(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "TypeDelivery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
