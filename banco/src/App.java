import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import models.ContaCorrenteDAO;
import models.ContaCorrente;


public class App extends Application 
{
    public static void teste()
    {
        //ContaCorrente conta = new ContaCorrente(1, 1, "eu", 10.0, "senha");
        //ContaCorrenteDAO dao = new ContaCorrenteDAO();
        //dao.salvarConta(conta);

        //ContaCorrenteDAO dao = new ContaCorrenteDAO();
        //ContaCorrente conta = dao.buscarConta(3);

        //System.out.println("Senha cliente: " + conta.getSenha());


        //ContaCorrente conta = new ContaCorrente(3, 1, "Carlo", 100.0, "outra senha");
        //ContaCorrenteDAO dao = new ContaCorrenteDAO();
        //dao.atualizarConta(conta);

        //ContaCorrenteDAO dao = new ContaCorrenteDAO();
        //dao.deletarConta(1);

        
    }
    
    

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
        teste();
        launch();
    }

}