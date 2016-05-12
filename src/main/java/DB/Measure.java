package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Measure {
    private int id;
    private int name;

    public Measure() {
    }

    public Measure(int id, int name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
