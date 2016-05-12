package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class OrderDB {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public OrderDB(String url, String login, String password){
        try {
            this.connection = DriverManager.getConnection(url, login, password);
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            connection.close();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void createTable(){
        try{
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS OrderDB(id_order INT PRIMARY KEY AUTO_INCREMENT,date_order DATE, time_order TIME , price_order DOUBLE ,id_typePay INT , id_delivery INT ,id_client INT , id_product INT )");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addClient(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE OrderDB ADD CONSTRAINT FK_ORDER_CLIENT FOREIGN KEY (id_client) REFERENCES Client(id_client)");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addTypePay(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE OrderDB ADD CONSTRAINT FK_ORDER_TypePay FOREIGN KEY (id_typePay) REFERENCES TypePay(id_typePay)");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addProduct(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE OrderDB ADD CONSTRAINT FK_ORDER_PRODUCT FOREIGN KEY (id_product) REFERENCES Product(id_product)");
          preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addDelivery(){
        try{
            preparedStatement = connection.prepareStatement("ALTER TABLE OrderDB ADD CONSTRAINT FK_ORDER_DELIVERY FOREIGN KEY (id_delivery) REFERENCES Delivery(id_delivery)");
            preparedStatement.execute();
        }catch(SQLException exc){
            exc.printStackTrace();
        }
    }
}
