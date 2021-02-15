package atividade01;


public class Circulo extends Ponto
{
    protected int raio;


    public Circulo(int x, int y, int raio)
    {
        super(x, y);
        this.raio = raio;
    }


    public void setRaio(int raio)
    {
        this.raio = raio;
    }


    public int getRaio()
    {
        return this.raio;
    }


    public Double getArea()
    {
        return (3.14 * Math.pow(this.raio, 2));
    }
    
}
