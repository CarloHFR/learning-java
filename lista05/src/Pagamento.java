public class Pagamento 
{
    protected TipoPagamento pagamento;
    protected Double valor;


    public void setPagamento(TipoPagamento pagamento)
    {
        this.pagamento = pagamento;
    }


    public void setValor(Double valor)
    {
        this.valor = valor;
    }


    public TipoPagamento getPagamento()
    {
        return this.pagamento;
    }


    public Double getValor()
    {
        return this.valor;
    }
    
}
