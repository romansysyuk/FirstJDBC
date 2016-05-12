package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private String login;
    private int fkCity;

    public Client() {
    }

    public Client(int id, String firstName, String lastName, String eMail, String password, String login, int fkCity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;
        this.login = login;
        this.fkCity = fkCity;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getFkCity() {
        return fkCity;
    }

    public void setFkCity(int fkCity) {
        this.fkCity = fkCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "eMail='" + eMail + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", fkCity=" + fkCity +
                '}';
    }
}
