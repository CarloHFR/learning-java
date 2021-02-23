package models;


import config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection extends Config
{
    protected Connection connection;
    

    public boolean openConnection()
    {
        try
        {
            String url = "jdbc:mysql://" + this.serverName + "/" + this.database;
            this.connection = DriverManager.getConnection(url, this.username, this.password);

            if(this.connection != null) 
            {
                return true;
            }else 
            {
                return false;
            }
        }catch (SQLException e)
        {
            return false;
        }
    }


    public boolean closeConnection()
    {
        try
        {
            this.connection.close();
            return true;
        }catch (SQLException e)
        {
            return false;
        }
    }
}
