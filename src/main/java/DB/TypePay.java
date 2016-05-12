package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class TypePay {

    private int id;
    private String name;

    public TypePay() {
    }

    public TypePay(int id, String name) {
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
        return "TypePay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
