package atividade01;


public class Cilindro extends Circulo 
{
    protected int altura;


    public Cilindro(int x, int y, int raio, int altura)
    {
        super(x, y, raio);
        this.altura = altura;
    }


    public void setAltura(int altura)
    {
        this.altura = altura;
    }


    public int getAltura()
    {
        return this.altura;
    }
    

    @Override
    public Double getArea()
    {
        Double areaBase = 2 * super.getArea();
        Double areaLateral = 2 * (3.14 * this.raio * this.altura);
        return areaBase + areaLateral;
    }


    public Double getVolume()
    {
        return (super.getArea() * this.altura);
    }
}
