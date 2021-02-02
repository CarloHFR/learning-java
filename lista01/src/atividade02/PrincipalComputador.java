//Busquei ao máximo manter o código limpo, e bem organizado, por isso criei varias funções e um outro tipo de dados.
//No entanto esse código não segue todos os princípios dos SOLID.


package atividade02;


import java.util.Scanner;


public class PrincipalComputador 
{
    public static ValoresEntrada ler_valores()
    {
        Scanner input = new Scanner(System.in);

        String cor;
        double preco;
        String marca;
        String modelo;
        int numero_serie;

        System.out.println("\n--------------------------------------");

        System.out.printf("Informe o modelo: ");
        modelo = input.nextLine();

        System.out.printf("Informe a marca: ");
        marca = input.nextLine();

        System.out.printf("Informe a cor: ");
        cor = input.nextLine();

        System.out.printf("Informe o numero de serie: ");
        numero_serie = input.nextInt();
        
        System.out.printf("Informe o preço: ");
        preco = input.nextDouble();

        System.out.println("--------------------------------------");
        
        return new ValoresEntrada(cor, preco, marca, modelo, numero_serie);
    }


    public static void mostrar_retorno(int retorno)
    {
        if(retorno == 1)
        {
            System.out.println("Alterado");
        }else
        {
            System.out.println("Não Alterado");
        }

    }


    public static Computador criar_setar_computador(ValoresEntrada valores_computador)
    {
        Computador computador = new Computador();
        
        computador.set_modelo(valores_computador.modelo);
        computador.set_marca(valores_computador.marca);
        computador.set_cor(valores_computador.cor);
        computador.set_numero_serie(valores_computador.numero_serie);

        return computador;
    }


    public static void main(String[] args) throws Exception 
    {
        ValoresEntrada valores_computador_01 = ler_valores();
        Computador computador_01 = criar_setar_computador(valores_computador_01);
        
        computador_01.imprimir();
        computador_01.alterar_valor(valores_computador_01.preco);
        computador_01.imprimir();


        ValoresEntrada valores_computador_02 = ler_valores();
        Computador computador_02 = criar_setar_computador(valores_computador_02);

        computador_02.calcular_valor();
        computador_02.imprimir();

        int retorno_positivo = computador_02.alterar_valor(2000.0);
        mostrar_retorno(retorno_positivo);

        int retorno_negativo = computador_02.alterar_valor(-2000.0);
        mostrar_retorno(retorno_negativo);

        computador_02.imprimir();
    }
    
}
