package model;


public class Celular 
{
    private String modelo = "";
    private String cor = "";
    private boolean carregador = false;
    private boolean pelicula = false;


    public Celular(String modelo, String cor, boolean carregador, boolean pelicula)
    {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setCarregador(carregador);
        this.setPelicula(pelicula);
    }


    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }


    public void setCor(String cor)
    {
        this.cor = cor;
    }


    public void setCarregador(boolean carregador)
    {
        this.carregador = carregador;
    }


    public void setPelicula(boolean pelicula)
    {
        this.pelicula = pelicula;
    }


    public String getModelo()
    {
        return this.modelo;
    }


    public String getCor()
    {
        return this.cor;
    }


    public boolean getCarregador()
    {
        return this.carregador;
    }


    public boolean getPelicula()
    {
        return this.pelicula;
    }
    
}
