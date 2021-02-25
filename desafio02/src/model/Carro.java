package model;


public class Carro 
{
    private String marca;
    private String modelo;
    private int anoFab;
    private int anoModelo;
    private String cambio;
    private String[] opcionais;
    private Double preco;


    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }


    public void setAnoFab(int anoFab)
    {
        this.anoFab = anoFab;
    }


    public void setAnoModelo(int anoModelo)
    {
        this.anoModelo = anoModelo;
    }


    public void setCambio(String cambio)
    {
        this.cambio = cambio;
    }


    public void setOpcionais(String[] opcionais)
    {
        this.opcionais = opcionais;
    }


    public void setPreco(Double preco)
    {
        this.preco = preco;
    }


    public String getMarca()
    {
        return this.marca;
    }

    
    public String getModelo()
    {
        return this.modelo;
    }


    public int getAnoFab()
    {
        return this.anoFab;
    }


    public int getAnoModelo()
    {
        return this.anoModelo;
    }


    public String getCambio()
    {
        return this.cambio;
    }


    public String[] getOpcionais()
    {
        return this.opcionais;
    }


    public Double getPreco()
    {
        return this.preco;
    }

}
