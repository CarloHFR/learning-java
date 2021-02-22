
// Mini CRUD para a tabela conta_corrente

package models;


import java.util.List;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class ContaCorrenteDAO extends MySQLConnection
{

    public ContaCorrente buscarConta(int numeroConta)
    {
        String query = "SELECT * FROM conta_corrente WHERE numero_conta = " + numeroConta;

        try
        {
            this.openConnection();

            PreparedStatement statement = this.connection.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            
            result.next();
        
            int numeroContaDB = result.getInt(1);
            int agencia = result.getInt(2);
            String nomeCliente = result.getString(3);
            Double saldo = result.getDouble(4);
            String senha = result.getString(5);
        
            ContaCorrente contaCorrente = new ContaCorrente(numeroContaDB, agencia, nomeCliente, saldo, senha);
        
            this.closeConnection();
            
            return contaCorrente;
            
        }catch(SQLException e)
        {
            System.err.println("Não foi possível buscar o registro no banco de dados.");
        }

        return null;
    }
    

    public boolean salvarConta(ContaCorrente contaCorrente)
    {
        String query = "INSERT INTO conta_corrente (agencia, nome_cliente, saldo, senha, status_conta) VALUES (?, ?, ?, ?, true)";

        try
        {
            this.openConnection();

            PreparedStatement statement = this.connection.prepareStatement(query);

            statement.setInt(1, contaCorrente.getAgencia());
            statement.setString(2, contaCorrente.getNomeCliente());
            statement.setDouble(3, contaCorrente.getSaldo());
            statement.setString(4, contaCorrente.getSenha());
            
            int rowsInserted = statement.executeUpdate();

            this.closeConnection();

            if(rowsInserted > 0) 
            {
                return true;
            }

        }catch(SQLException e)
        {
            System.err.println("Não foi possível inserir registro no banco de dados.");
        }

        return false;
    }


    public boolean atualizarConta(ContaCorrente contaCorrente)
    {
        String query = "UPDATE conta_corrente SET nome_cliente=?, saldo=?, senha=? WHERE numero_conta=?";

        try
        {
            this.openConnection();

            PreparedStatement statement = this.connection.prepareStatement(query);

            statement.setString(1, contaCorrente.getNomeCliente());
            statement.setDouble(2, contaCorrente.getSaldo());
            statement.setString(3, contaCorrente.getSenha());
            statement.setInt(4, contaCorrente.getConta());
            
            int rowsInserted = statement.executeUpdate();

            this.closeConnection();

            if(rowsInserted > 0) 
            {
                return true;
            }

        }catch(SQLException e)
        {
            System.err.println("Não foi possível atualizar o registro no banco de dados.");
        }

        return false;
    }


    public boolean deletarConta(int numeroConta)
    {
        String query = "UPDATE conta_corrente SET status_conta=false WHERE numero_conta=?";

        try
        {
            this.openConnection();

            PreparedStatement statement = this.connection.prepareStatement(query);

            statement.setInt(1, numeroConta);
            
            int rowsInserted = statement.executeUpdate();

            this.closeConnection();

            if(rowsInserted > 0) 
            {
                return true;
            }

        }catch(SQLException e)
        {
            System.err.println("Não foi possível deletar o registro no banco de dados.");
        }

        return false;
    }


    public List<ContaCorrente> listarContas()
    {
        List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        String query = "SELECT * FROM conta_corrente";

        try
        {
            this.openConnection();

            PreparedStatement statement = this.connection.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                int numeroContaDB = result.getInt(1);
                int agencia = result.getInt(2);
                String nomeCliente = result.getString(3);
                Double saldo = 0.0;
                String senha = " ";

                ContaCorrente contaCorrente = new ContaCorrente(numeroContaDB, agencia, nomeCliente, saldo, senha);
                contas.add(contaCorrente);
            }
        
            this.closeConnection();
            
            return contas;
            
        }catch(SQLException e)
        {
            System.err.println("Não foi possível buscar o registro no banco de dados.");
        }

        return null;
    }
}
