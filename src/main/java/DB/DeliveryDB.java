package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class DeliveryDB {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DeliveryDB(String url, String login, String password) {
        try {
            this.connection = DriverManager.getConnection(url, login, password);
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            connection.close();
        }catch(SQLException exc){
            exc.printStackTrace();
        }
    }

    public void creatTable(){
        try{
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS Delivery (id_delivery INT PRIMARY KEY AUTO_INCREMENT,date_delivery DATE, id_city INT ,id_typeDelivery INT, id_placeDelivery INT )");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addCity(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE Delivery ADD CONSTRAINT FK_Delivery_City FOREIGN KEY (id_city) REFERENCES City(id_city)");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addTypeDelivery(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE Delivery ADD CONSTRAINT FK_DELIVERY_TYPEDELIVERY FOREIGN KEY (id_typeDelivery) REFERENCES TypeDelivery(id_typeDelivery)");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addPlaceDelivery(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE Delivery ADD CONSTRAINT FK_DELIVERY_PLACEDELIVERY FOREIGN KEY (id_placeDelivery) REFERENCES PlaceDelivery(id_placeDelivery)");
           preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }
}
