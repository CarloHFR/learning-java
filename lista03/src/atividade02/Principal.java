package atividade02;


import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String nome;
        int quantidade;
        Double valorUnitario;
        int quantidadeRetirada;
        int quantidadeAdicionada;
        

        System.out.printf("\n--------------------------------------------------------\n");

        System.out.printf("Digite o nome do produto: ");
        nome = input.nextLine();

        System.out.printf("Digite a quantidade do produto: ");
        quantidade = input.nextInt();

        System.out.printf("Digite um valor do produto: ");
        valorUnitario = input.nextDouble();

        System.out.printf("--------------------------------------------------------");

        Produto produto = new Produto(nome, quantidade, valorUnitario);

        System.out.printf("\nO nome do produto: " + produto.getNome());
        System.out.printf("\nA quantidade do produto: " + produto.getQuantidade());
        System.out.printf("\nO valor unitario do produto: " + produto.getValorUnitario());

        System.out.printf("\n--------------------------------------------------------");

        System.out.printf("\nDigite a quantidade para retirar: ");
        quantidadeRetirada = input.nextInt();

        System.out.printf("--------------------------------------------------------");

        produto.retirar(quantidadeRetirada);

        System.out.printf("--------------------------------------------------------");

        System.out.printf("\nDigite a quantidade para adicionar: ");
        quantidadeAdicionada = input.nextInt();

        System.out.printf("--------------------------------------------------------");

        produto.adicionar(quantidadeAdicionada);

        System.out.printf("--------------------------------------------------------");

        Data dataValidade = new Data(15, 8, 2021);
        Data dataRetirada = new Data(15, 2, 2021);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(nome, quantidade, valorUnitario, dataValidade);

        System.out.printf("\nO nome do produto: " + produtoPerecivel.getNome());
        System.out.printf("\nA quantidade do produto: " + produtoPerecivel.getQuantidade());
        System.out.printf("\nO valor unitario do produto: " + produtoPerecivel.getValorUnitario());
        System.out.printf("\nA data de validade do produto: " + produtoPerecivel.getDataValidade());

        System.out.printf("\n--------------------------------------------------------");

        System.out.printf("\nDigite a quantidade para adicionar: ");
        quantidadeAdicionada = input.nextInt();

        System.out.printf("--------------------------------------------------------");

        produtoPerecivel.adicionar(quantidadeAdicionada);
        
        System.out.printf("--------------------------------------------------------");

        System.out.printf("\nDigite a quantidade para retirar: ");
        quantidadeRetirada = input.nextInt();

        System.out.printf("--------------------------------------------------------");

        produtoPerecivel.retirar(quantidadeRetirada, dataRetirada);

        System.out.printf("--------------------------------------------------------");
    }
    
}
