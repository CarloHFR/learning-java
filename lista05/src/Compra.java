public class Compra 
{
    protected Pedido ped;
    protected Pagamento pag;
    protected Double valorTotal;


    public void setPed(Pedido ped)
    {
        this.ped = ped;
    }


    public void setPag(Pagamento pag)
    {
        this.pag = pag;
    }


    public void setValorTotal(Double valorTotal)
    {
        this.valorTotal = valorTotal;
    }


    public Pedido getPed()
    {
        return this.ped;
    }


    public Pagamento getPag()
    {
        return this.pag;
    }


    public Double getValorTotal()
    {
        return this.valorTotal;
    }
    
}
