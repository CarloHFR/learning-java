package atividade02;


public class Vendedor extends Empregado
{
    protected Double valorVendas;
    protected Double comissao;


    public Vendedor(String nome, String telefone, String endereco, int codigoSetor, Double salarioBase, Double imposto, Double valorVendas, Double comissao)
    {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }


    public void setValorVendas(Double valorVendas)
    {
        this.valorVendas = valorVendas;
    }


    public void setComissao(Double comissao)
    {
        this.comissao = comissao;
    }


    public Double getValorVendas()
    {
        return this.valorVendas;
    }
    

    public Double getComissao()
    {
        return this.comissao;
    }


    @Override
    public Double calcularSalario()
    {
        Double salarioTotal = this.salarioBase + ((this.comissao / 100.0) * this.valorVendas);
        return salarioTotal - ((this.imposto / 100.0) * salarioTotal);
    }
    
}
