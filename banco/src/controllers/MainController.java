package controllers;


import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
//import javafx.application.Application;


public class MainController
{
    @FXML
    public void sacar() throws IOException
    {
        
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../views/sacar.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();

        
    }


    @FXML
    public void cadastrar() 
    {

    }


    @FXML
    public void deletar() 
    {

    }


    @FXML
    public void depositar() 
    {

    }


    @FXML
    public void listar() 
    {

    }


    @FXML
    public void sair() 
    {
        System.exit(0);
    }

}
