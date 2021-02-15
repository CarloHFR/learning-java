package atividade02;


public class Fornecedor extends Pessoa
{
    protected Double valorCredito;
    protected Double valorDivida;


    public Fornecedor(String nome, String telefone, String endereco, Double valorCredito, Double valorDivida)
    {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }


    public void setValorCredito(Double valorCredito)
    {
        this.valorCredito = valorCredito;
    }
    

    public void setValorDivida(Double valorDivida)
    {
        this.valorDivida = valorDivida;
    }


    public Double getValorCredito()
    {
        return this.valorCredito;
    }


    public Double getValorDivida()
    {
        return this.valorDivida;
    }


    public Double obterSaldo()
    {
        return this.valorCredito - this.valorDivida;
    }
}
