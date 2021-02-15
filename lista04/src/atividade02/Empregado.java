package atividade02;


public class Empregado extends Pessoa
{
    protected int codigoSetor;
    protected Double salarioBase;
    protected Double imposto;


    public Empregado(String nome, String telefone, String endereco, int codigoSetor, Double salarioBase, Double imposto)
    {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }


    public void setCodigoSetor(int codigoSetor)
    {
        this.codigoSetor = codigoSetor;
    }


    public void setSalarioBase(Double salarioBase)
    {
        this.salarioBase = salarioBase;
    }


    public void setImposto(Double imposto)
    {
        this.imposto = imposto;
    }


    public int getCodigoSetor()
    {
        return this.codigoSetor;
    }


    public Double getSalarioBase()
    {
        return this.salarioBase;
    }


    public Double getImposto()
    {
        return this.imposto;
    }
    

    public Double calcularSalario()
    {
        return this.salarioBase - ((this.imposto / 100.0) * this.salarioBase);
    }
}
