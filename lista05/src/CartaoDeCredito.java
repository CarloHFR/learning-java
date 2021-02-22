public class CartaoDeCredito implements TipoPagamento
{
    public int getDiasFaturamento()
    {
        return 1;
    }

    public Double getPorcentagemFinanceira()
    {
        return 0.1;
    }
    
}
