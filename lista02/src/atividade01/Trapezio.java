package atividade01;


public class Trapezio 
{
    private Double baseMaior;
    private Double baseMenor;
    private Double altura;


    public void setBaseMaior(Double baseMaior)
    {
        this.baseMaior = baseMaior;
    }


    public void setBaseMenor(Double baseMenor)
    {
        this.baseMenor = baseMenor;
    }


    public void setAltura(Double altura)
    {
        this.altura = altura;
    }


    public Double getBaseMaior()
    {
        return this.baseMaior;
    }


    public Double getBaseMenor()
    {
        return this.baseMenor;
    }


    public Double getAltura()
    {
        return this.altura;
    }


    public Double calcularArea()
    {
        return ((this.baseMenor + this.baseMaior) * altura) / 2;
    }
    
}
