package controller;


import java.net.URL;
import javafx.fxml.FXML;
import java.io.IOException;
import java.io.PrintStream;
import java.io.OutputStream;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;


import model.Celular;


public class MainController implements Initializable
{
    @FXML
    private ComboBox<String> comboNomeCelular;

    @FXML
    private ToggleGroup cor;

    @FXML
    private CheckBox carregadorSemFio;

    @FXML
    private CheckBox peliculaDeVidro;

    @FXML
    private Button btnMostrar;

    @FXML
    private TextArea textLog;
    private PrintStream ps;


    @FXML
    public void mostrar() throws IOException
    {
        try
        {
            String nomeCelular = comboNomeCelular.getSelectionModel().getSelectedItem();
        
            RadioButton corSelecionada = (RadioButton) cor.getSelectedToggle();
            String cor = corSelecionada.getText();

            boolean carregador = carregadorSemFio.isSelected();
            boolean pelicula = peliculaDeVidro.isSelected();
            
            Celular celular = new Celular(nomeCelular, cor, carregador, pelicula);

            printToConsole("--------------------------------------");
            printToConsole("Modelo: " + celular.getModelo());
            printToConsole("Cor: " + celular.getCor());
            printToConsole("Carregador sem fio: " + celular.getCarregador());
            printToConsole("Pelicula de vidro: " + celular.getPelicula());
            printToConsole("--------------------------------------");
        }catch(Exception e)
        {
            printToConsole("--------------------------------------");
            printToConsole("Faltam valores");
            printToConsole("--------------------------------------");

        }
        
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        ps = new PrintStream(new Console(textLog)) ;
        comboNomeCelular.getItems().removeAll(comboNomeCelular.getItems());
        comboNomeCelular.getItems().addAll("Samsung S20", "Iphone 11", "Pixel 2");
        comboNomeCelular.getSelectionModel().select("Samsung S20");
    }


    public void printToConsole(String term) throws IOException
    {
        System.setOut(ps);
        System.setErr(ps);
        System.out.println(term);
    }


    public class Console extends OutputStream 
    {
        private TextArea textLog;

        public Console(TextArea textLog) 
        {
            this.textLog = textLog;
        }

        public void appendText(String valueOf) 
        {
            Platform.runLater(() -> textLog.appendText(valueOf));
        }

        public void write(int b) throws IOException 
        {
            appendText(String.valueOf((char)b));
        }
    }
}
