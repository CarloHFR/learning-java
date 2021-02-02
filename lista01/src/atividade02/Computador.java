package atividade02;


public class Computador 
{
    private String cor;
    private double preco;
    private String marca;
    private String modelo;
    private int numero_serie;
    

    public void set_cor(String cor)
    {
        this.cor = cor;
    }


    public void set_marca(String marca)
    {
        this.marca = marca;
    }


    public void set_modelo(String modelo)
    {
        this.modelo = modelo;
    }


    public void set_numero_serie(int numero_serie)
    {
        this.numero_serie = numero_serie;
    }


    public int alterar_valor(Double valor)
    {
        if(valor > 0)
        {
            this.preco = valor;
            return 1;
        }else
        {
            return 0;
        }
    }


    public void calcular_valor()
    {
        double percentual; 

        if(this.marca == "HP")
        {
            percentual = 30.0 / 100.0; 
        }else if(this.marca == "IBM")
        {
            percentual = 50.0 / 100.0; 
        }else
        {
            return;
        }

        this.preco = this.preco + (percentual * this.preco);
    }


    public void imprimir()
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Numero de serie: " + this.numero_serie);
        System.out.println("Preço: " + this.preco);
        System.out.println("--------------------------------------");
    } 
}
