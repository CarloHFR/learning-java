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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;


import model.Carro;


public class MainController implements Initializable
{
    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnSair;

    @FXML
    private TextField textModelo;

    @FXML
    private TextField textAnoFabricacao;

    @FXML
    private TextField textAnoModelo;

    @FXML
    private TextField textValor;

    @FXML
    private ToggleGroup cambio;

    @FXML
    private ComboBox<String> comboMarca;

    @FXML
    private CheckBox checkDirecaoHidraulica;

    @FXML
    private CheckBox checkBancoDeCouro;

    @FXML
    private CheckBox checkArCondicionado;

    @FXML
    private CheckBox checkSensorEstacionamento;

    @FXML
    private CheckBox checkTetoSolar;

    @FXML
    private TextArea textLog;
    private PrintStream ps;


    private Carro carro = new Carro();


    @FXML
    public void limpar() throws IOException
    {
        try
        {
            textValor.setText("");
            textModelo.setText("");
            textAnoModelo.setText("");
            textAnoFabricacao.setText("");

            cambio.selectToggle(null);

            checkDirecaoHidraulica.setSelected(false);
            checkBancoDeCouro.setSelected(false);
            checkArCondicionado.setSelected(false);
            checkSensorEstacionamento.setSelected(false);
            checkTetoSolar.setSelected(false);

        }catch(Exception e)
        {
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
            this.printToConsole("Erro ao efetuar ao limpar os campos");
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
        }
    }


    @FXML
    public void cadastrar() throws IOException
    {
        try
        {
            String marca = comboMarca.getSelectionModel().getSelectedItem();

            Double valor = Double.valueOf(textValor.getText());
            int anoModelo = Integer.valueOf(textAnoModelo.getText());
            int anoFabricacao = Integer.valueOf(textAnoFabricacao.getText());

            String modelo = textModelo.getText();

            RadioButton cambioBotao = (RadioButton) cambio.getSelectedToggle();
            String tipoCambio = cambioBotao.getText();

            String[] opcionais = new String[5];

            if(checkDirecaoHidraulica.isSelected()) opcionais[0] = "Direcao hidraulica";
            if(checkBancoDeCouro.isSelected()) opcionais[1] = "Bancos de couro";
            if(checkArCondicionado.isSelected()) opcionais[2] = "Ar condicionado";
            if(checkSensorEstacionamento.isSelected()) opcionais[3] = "Sensor de estacionamento";
            if(checkTetoSolar.isSelected()) opcionais[4] = "Teto solar";

            this.carro.setMarca(marca);
            this.carro.setModelo(modelo);
            this.carro.setAnoFab(anoFabricacao);
            this.carro.setAnoModelo(anoModelo);
            this.carro.setCambio(tipoCambio);
            this.carro.setOpcionais(opcionais);
            this.carro.setPreco(valor);

            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
            this.printToConsole("Carro cadastrado com sucesso");
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");

        }catch(Exception e)
        {
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
            this.printToConsole("Erro ao cadastrar o carro");
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
        }
    }


    @FXML
    public void mostrar() throws IOException
    {
        try
        {
            String opcionais = "";

            for(String opcional : this.carro.getOpcionais())
            {
                if(opcional != null)
                {
                    opcionais = opcionais + " " + opcional;
                }
                
            }

            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
            this.printToConsole("Marca: " + this.carro.getMarca());
            this.printToConsole("Modelo: " + this.carro.getModelo());
            this.printToConsole("Ano de fabricacao: " + this.carro.getAnoFab());
            this.printToConsole("Ano do modelo: " + this.carro.getAnoModelo());
            this.printToConsole("Tipo do cambio: " + this.carro.getCambio());
            this.printToConsole("Opcionais: " + opcionais);
            this.printToConsole("Valor: " + this.carro.getPreco());
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");

        }catch(Exception e)
        {
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
            this.printToConsole("Erro ao mostrar o carro");
            this.printToConsole("---------------------------------------------------------------------------------------------------------------------------");
        }

    }


    @FXML
    public void sair() throws IOException
    {
        System.exit(0);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        ps = new PrintStream(new Console(textLog)) ;
        comboMarca.getItems().removeAll(comboMarca.getItems());
        comboMarca.getItems().addAll("Volkswagen", "Chevrolet", "Fiat", "Ford", "Mercedes", "Audi");
        comboMarca.getSelectionModel().select("Volkswagen");
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
