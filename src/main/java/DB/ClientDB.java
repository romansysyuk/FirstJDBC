package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kobeb on 09.05.2016.
 */
public class ClientDB {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public ClientDB(String url,String login, String password){
        try{
            this.connection = DriverManager.getConnection(url,login,password);
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

    public void createTable() {
        try {
            preparedStatement = connection.prepareStatement("CREATE TABLE if NOT EXISTS Client(id_client INT PRIMARY KEY AUTO_INCREMENT,firstName VARCHAR(55),lastName VARCHAR (55),dateBirth DATE, tel int, eMail VARCHAR(255), password VARCHAR (55), login VARCHAR (55),id_city INT )");
            preparedStatement.execute();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

        public void addCity(){
            try {
                preparedStatement = connection.prepareStatement("ALTER TABLE Client ADD CONSTRAINT FK_Client_City FOREIGN KEY (id_city) REFERENCES City(id_city)");
               // preparedStatement.execute();
            }catch (SQLException exc) {
                exc.printStackTrace();
            }

    }

    }




