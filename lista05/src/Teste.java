public class Teste 
{
    public static void main(String[] args) throws Exception 
    {
        Produto cafe = new Produto();
        cafe.setPreco(15.50);
        cafe.setQuantidade(100);

        Produto bolacha = new Produto();
        bolacha.setPreco(8.30);
        bolacha.setQuantidade(40);

        Produto bala = new Produto();
        bala.setPreco(0.50);
        bala.setQuantidade(89);

        Pedido pedido = new Pedido();
        pedido.iniciar();
        pedido.adicionarProduto(cafe);
        pedido.adicionarProduto(bolacha);
        pedido.adicionarProduto(bala);

        Double valorTotal = pedido.calcularValor();

        System.out.println("Valor do pedido: " + valorTotal);

        CartaoDeCredito cartao = new CartaoDeCredito();

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(valorTotal);
        pagamento.setPagamento(cartao);

        Compra compra = new Compra();
        compra.setPed(pedido);
        compra.setPag(pagamento);
        compra.setValorTotal(valorTotal);

        Compra[] listaCompras;
        listaCompras = new Compra[20];
        listaCompras[0] = compra;

        Cliente cliente = new Cliente();
        cliente.setId(50);

        FichaCliente ficha = new FichaCliente(cliente, listaCompras);

        System.out.println("Cliente: " + ficha.getCli().getId());

    }
}
