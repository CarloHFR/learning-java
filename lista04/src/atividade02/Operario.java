package atividade02;


public class Operario extends Empregado
{
    protected Double valorProducao;
    protected Double comissao;


    public Operario(String nome, String telefone, String endereco, int codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao)
    {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }


    public void setValorProducao(Double valorProducao)
    {
        this.valorProducao = valorProducao;
    }


    public void setComissao(Double comissao)
    {
        this.comissao = comissao;
    }


    public Double getValorProducao()
    {
        return this.valorProducao;
    }
    

    public Double getComissao()
    {
        return this.comissao;
    }


    @Override
    public Double calcularSalario()
    {
        Double salarioTotal = this.salarioBase + ((this.comissao / 100.0) * this.valorProducao);
        return salarioTotal - ((this.imposto / 100.0) * salarioTotal);
    }
}
