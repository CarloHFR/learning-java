public class Pedido 
{
    protected Produto[] produtos;
    private int tamProdutos = 0;


    public void iniciar()
    {
        produtos = new Produto[20];
    }


    public void adicionarProduto(Produto produto)
    {
        if(tamProdutos < 20)
        {
            produtos[tamProdutos] = produto;
            tamProdutos++;
        }
    }
    

    public double calcularValor()
    {
        int index = 0;
        double total = 0;

        while(produtos[index] != null)
        {
            Produto produto = produtos[index];
            total += produto.getPreco();
            index++;
        }

        return total;
    }

}
