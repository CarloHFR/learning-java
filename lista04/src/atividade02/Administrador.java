package atividade02;


public class Administrador extends Empregado
{
    protected Double ajudaDeCusto;


    public Administrador(String nome, String telefone, String endereco, int codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto)
    {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public void setAjudaDeCusto(Double ajudaDeCusto)
    {
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public Double getAjudaDeCusto()
    {
        return this.ajudaDeCusto;
    }


    @Override
    public Double calcularSalario()
    {
        Double salarioTotal = this.salarioBase + this.ajudaDeCusto;
        return salarioTotal - ((this.imposto / 100.0) * salarioTotal);
    }
}
