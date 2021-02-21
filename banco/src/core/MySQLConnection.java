package core;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection 
{
    protected Connection connection;
    private String serverName;
    private String database;
    private String username; 
    private String password;


    public MySQLConnection (String serverName, String database, String username, String password)
    {
        this.serverName = serverName;
        this.database = database;
        this.username = username;
        this.password = password;
    }
    

    public void openConnection()
    {
        try
        {
            String url = "jdbc:mysql://" + this.serverName + "/" + this.database;
            this.connection = DriverManager.getConnection(url, this.username, this.password);

            if(this.connection != null) 
            {
                System.out.println("Conexão com o banco de dados realizada com sucesso.");
            }else 
            {
                System.err.println("Não foi possível conectar com o banco de dados.");
            }
        }catch (SQLException e)
        {
            System.err.println("Não foi possível conectar com o banco de dados.");
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



/*
    public void getValores(String query)
    {
        try{

            openConnection();
        
            Statement stmt = this.connection.createStatement();
            ResultSet results = stmt.executeQuery(query);

            while(results.next()) 
            {

                System.out.print(results.getInt(1));
                System.out.print(": ");
                System.out.println(results.getString(2));
            }

            closeConnection();
            
        }catch (SQLException e)
        {
            System.out.println("Falha ao buscar os dados");
        }
    }


    public boolean update(String query)
    {
        try{
            if(this.connected == false)
            {
                openConnection();
            }

            Statement stmt = this.connection.createStatement();
            

            if(query.split(" ")[0].equals("SELECT"))
            {
                //PreparedStatement pst =  this.connection.prepareStatement(query);
                //ResultSet rs = pst.executeQuery();
                System.out.println("select");
                ResultSet results = stmt.executeQuery(query);
                
                System.out.println(results);

                while (results.next()) {

                    System.out.print(results.getInt(1));
                    System.out.print(": ");
                    System.out.println(results.getString(2));
                }

                closeConnection();
                return true;
            }

            closeConnection();
            return true;
            
        }catch (SQLException e)
        {
            System.out.println("Falha ao inserir os dados");
            return false;
        }
    }
*/
