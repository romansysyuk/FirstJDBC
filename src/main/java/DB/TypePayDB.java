package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class TypePayDB {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public TypePayDB(String url, String login, String password){
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
        try {
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS TypePay (id_typePay INT PRIMARY KEY AUTO_INCREMENT, name_typePay VARCHAR (55))");
            preparedStatement.execute();
        }catch (SQLException exc){
            exc.printStackTrace();
        }

    }
}
