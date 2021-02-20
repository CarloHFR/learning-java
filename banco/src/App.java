import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application 
{

    /*
    public static void connect()
    {
        String serverName = "localhost";    //caminho do servidor do BD
        String mydatabase = "bancojava";        //nome do seu banco de dados
        String username = "root";        //nome de um usuário de seu BD
        String password = "";      //sua senha de acesso

        MySQLConnection mysqlConnection = new MySQLConnection(serverName, mydatabase, username, password);

        mysqlConnection.update("SELECT * FROM teste");
    }
    */
    

    @Override
    public void start(Stage stage) 
    {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch();
    }

}