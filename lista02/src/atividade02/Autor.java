package atividade02;


public class Autor 
{
    private String nome;
    private String pais;
    private String sexo;


    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public void setPais(String pais)
    {
        this.pais = pais;
    }


    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }


    public String getNome()
    {
        return this.nome;
    }
    

    public String getPais()
    {
        return this.pais;
    }


    public String getSexo()
    {
        return this.sexo;
    }


    public void imprimir()
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Pais: " + this.pais);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("--------------------------------------");
    }
}
