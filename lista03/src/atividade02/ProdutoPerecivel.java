package atividade02;


public class ProdutoPerecivel extends Produto
{
    protected Data dataValidade;


    public ProdutoPerecivel(String nome, int quantidade, Double valorUnitario,  Data dataValidade)
    {
        super(nome, quantidade, valorUnitario);
        this.dataValidade = dataValidade;
    }


    public void setDataValidade(Data dataValidade)
    {
        this.dataValidade = dataValidade;
    }


    public Data getDataValidade()
    {
        return this.dataValidade;
    }


    // Aqui não possui o @Override pois como são dois parâmetros ele consegue diferenciar as duas funções retirar()
    // Acontece então uma sobrecarga
    public void retirar(int quantidade, Data dataRetirada)
    {
        if((dataRetirada.getMes() - this.dataValidade.getMes()) > 2)
        {
            this.quantidade = 0;
            System.out.println("\nProduto fora do prazo de validade, estoque zerado");
        }else
        {
            this.retirar(quantidade);
        }
    }


    @Override
    public void adicionar(int quantidade)
    {
        if(this.quantidade == 0)
        {
            super.adicionar(quantidade);
        }else
        {
            System.out.println("\nProduto possui quantidade em estoque");
        }
    }
    
}
