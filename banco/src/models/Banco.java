package models;


import java.util.List;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


public class Banco 
{
    private ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();


    public List<ContaCorrente> listarContas()
    {
        return contaCorrenteDAO.listarContas();
    }


    public boolean criarConta(ContaCorrente contaCorrente)
    {
        String senhaCodificada = this.codificarSenha(contaCorrente.getSenha());

        if(senhaCodificada != null)
        {
            contaCorrente.setSenha(senhaCodificada);
            return contaCorrenteDAO.salvarConta(contaCorrente);
        }

        return false;
    }
    
    
    public ContaCorrente acessarConta(int conta, String senha)
    {
        ContaCorrente contaCorrente = contaCorrenteDAO.buscarConta(conta);

        if(contaCorrente != null)
        {
            String senhaCodificada = this.codificarSenha(senha);

            if((senhaCodificada != null) && (contaCorrente.getSenha().equals(senhaCodificada)))
            {
                return contaCorrente;
            }
        }

        return null;
    }


    public boolean sacar(int conta, String senha, Double valor)
    {
        ContaCorrente contaCorrente = this.acessarConta(conta, senha);

        if(contaCorrente != null)
        {
            Double valorConta = contaCorrente.getSaldo();

            if(valor <= valorConta)
            {
                valorConta -= valor;

                contaCorrente.setSaldo(valorConta);
                contaCorrenteDAO.atualizarConta(contaCorrente);

                return true;
            }
        }

        return false;
    }


    public boolean depositar(int conta, Double valor)
    {
        ContaCorrente contaCorrente = contaCorrenteDAO.buscarConta(conta);

        if(contaCorrente != null)
        {
            Double valorConta = contaCorrente.getSaldo();
            valorConta += valor;

            contaCorrente.setSaldo(valorConta);
            contaCorrenteDAO.atualizarConta(contaCorrente);

            return true;
        }

        return false;
    }


    public boolean deletarConta(int conta)
    {
        return contaCorrenteDAO.deletarConta(conta);
    }


    private String codificarSenha(String senha)
    {
        try
        {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for(byte b : messageDigest) 
            {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            
            String senhaHex = hexString.toString();
            return senhaHex;

        }catch(UnsupportedEncodingException e)
        {
            System.err.println("Erro ao codificar a senha");
            return null;
        }catch(NoSuchAlgorithmException e)
        {
            System.err.println("Erro ao codificar a senha");
            return null;
        }
    }
}
