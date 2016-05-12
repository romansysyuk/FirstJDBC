package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class ProductDB {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public ProductDB(String url, String login, String password){
        try {
            this.connection = DriverManager.getConnection(url, login, password);
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            connection.close();
        }catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
    public void createTable(){
        try {
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS Product (id_product INT PRIMARY KEY AUTO_INCREMENT,name_product VARCHAR (255), price DOUBLE ,description VARCHAR(1000) ,size_product DOUBLE, id_measure INT,id_typeProduct INT)");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    public void addMeasure(){
        try{
            preparedStatement = connection.prepareStatement("Alter TABLE Product ADD CONSTRAINT FK_Product_Measure FOREIGN KEY (id_measure) REFERENCES Measure(id_measure)");
            //preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }
    public void addTypeProduct(){
        try{
            preparedStatement = connection.prepareStatement("Alter TABLE Product ADD CONSTRAINT FK_Product_TypeProduct FOREIGN KEY (id_typeProduct) REFERENCES TypeProduct(id_typeProduct)");
            //preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }

    }
}
