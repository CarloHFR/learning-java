package atividade02;


public class Pessoa 
{
    protected String nome;
    protected String telefone;
    protected String endereco;
    

    public Pessoa(String nome, String telefone, String endereco)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }


    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }


    public String getNome()
    {
        return this.nome;
    }


    public String getTelefone()
    {
        return this.telefone;
    }


    public String getEndereco()
    {
        return this.endereco;
    }

}
