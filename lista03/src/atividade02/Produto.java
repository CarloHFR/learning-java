package atividade02;


public class Produto 
{
    protected String nome;
    protected int quantidade;
    protected Double valorUnitario;

    
    public Produto(String nome, int quantidade, Double valorUnitario)
    {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }


    public void setValorUnitario(Double valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }


    public String getNome()
    {
        return this.nome;
    }


    public int getQuantidade()
    {
        return this.quantidade;
    }


    public Double getValorUnitario()
    {
        return this.valorUnitario;
    }


    public void retirar(int quantidade)
    {
        if(quantidade <= this.quantidade)
        {
            this.quantidade -= quantidade;
            System.out.println("\nQuantidade retirada: " + quantidade);
            System.out.println("Quantidade disponivel: " + this.quantidade);
        }else
        {
            System.out.println("\nQuantidade indisponivel");
        }
    }


    public void adicionar(int quantidade)
    {
        this.quantidade += quantidade;
        System.out.println("\nQuantidade adicionada: " + quantidade);
        System.out.println("Quantidade disponivel: " + this.quantidade);
    }
    
}
