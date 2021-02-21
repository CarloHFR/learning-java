package models;


public class ContaCorrente 
{
    private int conta;
    private int agencia;
    private String senha;
    private String nomeCliente;
    private Double saldo = 0.0;


    public ContaCorrente(int conta, int agencia, String nomeCliente, Double saldo,  String senha)
    {
        this.setConta(conta);
        this.setAgencia(agencia);
        this.setSenha(senha);
        this.setNomeCliente(nomeCliente);
        this.setSaldo(saldo);
    }
    

    public void setConta(int conta)
    {
        this.conta = conta;
    }


    public void setAgencia(int agencia)
    {
        this.agencia = agencia;
    }


    public void setSenha(String senha)
    {
        this.senha = senha;
    }


    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente = nomeCliente;
    }


    public void setSaldo(Double saldo)
    {
        this.saldo = saldo;
    }


    public int getConta()
    {
        return this.conta;
    }
    

    public int getAgencia()
    {
        return this.agencia;
    }


    public String getSenha()
    {
        return this.senha;
    }


    public String getNomeCliente()
    {
        return this.nomeCliente;
    }


    public Double getSaldo()
    {
        return this.saldo;
    }
}
