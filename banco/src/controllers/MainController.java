package controllers;


import java.util.List;
import javafx.fxml.FXML;
import java.io.IOException;
import java.io.PrintStream;
import java.io.OutputStream;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


import models.Banco;
import models.ContaCorrente;


public class MainController 
{
    @FXML
    private Button btnSacar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnDeletar;

    @FXML
    private Button btnDepositar;

    @FXML
    private Button btnListar;

    @FXML
    private Button btnSair;

    @FXML
    private TextField textNumeroConta;

    @FXML
    private TextField textAgencia;

    @FXML
    private TextField textNomeCliente;

    @FXML
    private TextField textValor;

    @FXML
    private PasswordField textSenha;


    @FXML
    private TextArea textLog;
    private PrintStream ps;


    private Banco banco = new Banco();


    @FXML
    public void sacar() throws IOException
    {
        try
        {
            int conta = Integer.valueOf(textNumeroConta.getText());
            Double valor = Double.valueOf(textValor.getText());
            String senha = textSenha.getText();

            if(banco.sacar(conta, senha, valor))
            {
                this.printToConsole("Saque bem sucedido");
            }else
            {
                this.printToConsole("Nao foi possivel realizar o saque");
            }

        }catch(Exception e)
        {
            this.printToConsole("Erro ao efetuar o saque");
        }
    }


    @FXML
    public void cadastrar() throws IOException
    {
        try
        {
            int conta = Integer.valueOf(textNumeroConta.getText());
            int agencia = Integer.valueOf(textAgencia.getText());
            String nomeCliente = textNomeCliente.getText();
            Double valor = Double.valueOf(textValor.getText());
            String senha = textSenha.getText();

            ContaCorrente contaCorrente = new ContaCorrente(conta, agencia, nomeCliente, valor, senha);

            if(banco.criarConta(contaCorrente))
            {
                this.printToConsole("Conta criada com sucesso");
            }else
            {
                this.printToConsole("Nao foi possivel criar a conta");
            }

        }catch(Exception e)
        {
            this.printToConsole("Erro ao criar a conta");
        }
    }


    @FXML
    public void deletar() throws IOException
    {
        try
        {
            int conta = Integer.valueOf(textNumeroConta.getText());
            
            if(banco.deletarConta(conta))
            {
                this.printToConsole("Conta deletada com sucesso");
            }else
            {
                this.printToConsole("Nao foi possivel deletar a conta");
            }

        }catch(Exception e)
        {
            this.printToConsole("Erro ao deletar a conta");
        }

    }


    @FXML
    public void depositar() throws IOException
    {
        try
        {
            int conta = Integer.valueOf(textNumeroConta.getText());
            Double valor = Double.valueOf(textValor.getText());

            if(banco.depositar(conta, valor))
            {
                this.printToConsole("Deposito realizado com sucesso");
            }else
            {
                this.printToConsole("Nao foi possivel realizar o deposito");
            }

        }catch(Exception e)
        {
            this.printToConsole("Erro ao realizar o deposito");
        }
    }


    @FXML
    public void listar() throws IOException
    {
        try
        {
            List<ContaCorrente> contas = banco.listarContas();

            if(contas != null)
            {
                for(int i = 0 ; i < contas.size(); i++)
                {
                    ContaCorrente contaCorrente = contas.get(i);

                    this.printToConsole("-------------------------------------");
                    this.printToConsole("Conta: " + contaCorrente.getConta());
                    this.printToConsole("Agencia: " + contaCorrente.getAgencia());
                    this.printToConsole("Nome do cliente: " +contaCorrente.getNomeCliente());
                    this.printToConsole("-------------------------------------");
                }
                
            }else
            {
                this.printToConsole("Nao foi possivel listar as contas");
            }

        }catch(Exception e)
        {
            this.printToConsole("Erro ao listar as contas");
        }
    }


    @FXML
    public void sair() throws IOException
    {
        System.exit(0);
    }


    public void printToConsole(String term) throws IOException
    {
        System.setOut(ps);
        System.setErr(ps);
        System.out.println(term);
    }


    public void initialize() 
    {
        ps = new PrintStream(new Console(textLog)) ;
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
