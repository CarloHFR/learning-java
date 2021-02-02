package atividade03;


public class ContaCorrente 
{
    private String nome_cliente;
    private String agencia;
    private String conta;
    private Double saldo = 0.0;


    public void set_nome_cliente(String nome_cliente)
    {
        this.nome_cliente = nome_cliente;
    }


    public void set_agencia(String agencia)
    {
        this.agencia = agencia;
    }


    public void set_conta(String conta)
    {
        this.conta = conta;
    }


    public int sacar(Double valor)
    {
        if(valor <= this.saldo)
        {
            this.saldo -= valor;
            return 1;
        }else
        {
            return 0;
        }
    }


    public void depositar(Double valor)
    {
        this.saldo += valor;
    }


    public void imprimir()
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Nome: " + this.nome_cliente);
        System.out.println("Conta: " + this.conta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("--------------------------------------");
    } 

}
