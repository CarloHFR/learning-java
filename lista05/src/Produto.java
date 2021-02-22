public class Produto 
{
    protected Double preco;
    protected int quantidade;


    public void setPreco(Double preco)
    {
        this.preco = preco;
    }


    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }


    public Double getPreco()
    {
        return this.preco;
    }


    public int getQuantidade()
    {
        return this.quantidade;
    }


    public void imprimir()
    {
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
    
}
