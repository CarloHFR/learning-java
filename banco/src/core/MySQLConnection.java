package core;


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
                System.out.println("Conexão com o banco de dados realizada com sucesso.");
                return true;
            }else 
            {
                System.err.println("Não foi possível conectar com o banco de dados.");
                return false;
            }
        }catch (SQLException e)
        {
            System.err.println("Não foi possível conectar com o banco de dados.");
            return false;
        }
    }


    public void closeConnection()
    {
        try
        {
            this.connection.close();
            System.out.println("A conexão com o banco de dados foi finalizada.");
        }catch (SQLException e)
        {
            System.err.println("Não foi possível fechar a conexão com o banco de dados.");
        }
    }
}
