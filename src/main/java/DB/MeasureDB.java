package DB;

import java.sql.*;

/**
 * Created by kobeb on 09.05.2016.
 */
public class MeasureDB {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public MeasureDB(String url,String login,String password){
        try{
            this.connection = DriverManager.getConnection(url,login,password);
        }catch(SQLException exc){
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
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS Measure (id_measure INT PRIMARY KEY AUTO_INCREMENT,name_measure VARCHAR (55))");
            preparedStatement.execute();
        }catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
}
