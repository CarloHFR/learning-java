public class FichaCliente 
{
    protected Cliente cli;
    protected Compra[] compras;
    
    
    public FichaCliente(Cliente cli, Compra[] compras)
    {
        this.setCli(cli);
        this.setCompras(compras);
    }


    public void setCli(Cliente cliente)
    {
        this.cli = cliente;
    }


    public void setCompras(Compra[] compras)
    {
        this.compras = compras;
    }


    public Cliente getCli()
    {
        return this.cli;
    }


    public Compra[] getCompras()
    {
        return this.compras;
    }

}
