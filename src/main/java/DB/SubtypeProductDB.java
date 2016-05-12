package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class SubtypeProductDB {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public SubtypeProductDB(String url, String login, String password) {
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
            preparedStatement = connection.prepareStatement("CREATE TABLE  if NOT EXISTS SubtypeProduct(id_subtypeProduct INT PRIMARY KEY AUTO_INCREMENT,name_subtypeProduct VARCHAR (55))");
            preparedStatement.execute();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
}
