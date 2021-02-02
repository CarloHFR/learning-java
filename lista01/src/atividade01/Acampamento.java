package atividade01;


public class Acampamento 
{
    private String nome;
    private char equipe;
    private int idade;


    public Acampamento(String nome, int idade) throws Exception
    {
        set_nome(nome);
        set_idade(idade);
    }


    public void set_nome(String nome)
    {
        this.nome = nome;
    }


    public void set_idade(int idade) throws Exception
    {
        if(idade < 6)
        {
            throw new Exception("A idade deve ser maior ou igual a 6 anos.");
        }else
        {
            this.idade = idade;
        }
    }


    public void separar_grupo()
    {
        if(this.idade >= 6 && this.idade <= 10)
        {
            this.equipe = 'A';
        }else if(this.idade >= 11 && this.idade <= 20)
        {
            this.equipe = 'B';
        }else if(this.idade >= 21)
        {
            this.equipe = 'C';
        }
    }


    public void imprimir()
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Equipe: " + this.equipe);
        System.out.println("--------------------------------------");
    } 
}
