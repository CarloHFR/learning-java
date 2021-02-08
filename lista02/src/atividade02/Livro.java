package atividade02;


public class Livro 
{
    private Autor autor;
    private String titulo;
    private int ano;


    public void setAutor(Autor autor)
    {
        this.autor = autor;
    }


    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }


    public void setAno(int ano)
    {
        this.ano = ano;
    }


    public String getAutor()
    {
        return this.autor.getNome();
    }


    public String getTitulo()
    {
        return this.titulo;
    }


    public int getAno()
    {
        return this.ano;
    }


    public void imprimir()
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Autor: " + this.autor.getNome());
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano: " + this.ano);
        System.out.println("--------------------------------------");
    }
    
}
