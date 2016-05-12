package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class TypeProductDB {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public TypeProductDB(String url, String login, String password) {
        try {
            this.connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException exc) {
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
    public void createTable() {
        try {
            preparedStatement = connection.prepareStatement("CREATE TABLE  if NOT EXISTS TypeProduct(id_typeProduct INT PRIMARY KEY AUTO_INCREMENT,name_typeProduct VARCHAR (55),id_subtypeProduct INT )");
            preparedStatement.execute();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

    public void addSubtypeProduct(){
        try {
            preparedStatement = connection.prepareStatement("ALTER TABLE TypeProduct ADD CONSTRAINT FK_TypeProduct_SubtypeProduct FOREIGN KEY (id_subtypeProduct) REFERENCES SubtypeProduct(id_subtypeProduct)");
            //preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }
}
