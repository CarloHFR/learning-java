package atividade01;


import java.util.Scanner;


public class Principal 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int raio;
        int altura;


        System.out.printf("\n--------------------------------------------------------\n");

        System.out.printf("Digite um valor para X: ");
        x = input.nextInt();

        System.out.printf("Digite um valor para Y: ");
        y = input.nextInt();

        System.out.printf("Digite um valor para o raio: ");
        raio = input.nextInt();

        System.out.printf("Digite um valor para a altura: ");
        altura = input.nextInt();

        System.out.printf("--------------------------------------------------------");

        Ponto ponto = new Ponto(x, y);

        System.out.printf("\nO valor de x: " + ponto.getX());
        System.out.printf("\nO valor de y: " + ponto.getY());

        System.out.printf("\n--------------------------------------------------------");

        Circulo circulo = new Circulo(x, y, raio);

        System.out.printf("\nO valor do raio: " + circulo.getRaio());
        System.out.printf("\nO valor da area do circulo: " + circulo.getArea());

        System.out.printf("\n--------------------------------------------------------");

        Cilindro cilindro = new Cilindro(x, y, raio, altura);

        System.out.printf("\nO valor da altura do cilindro: " + cilindro.getAltura());
        System.out.printf("\nO valor da area do cilindro: " + cilindro.getArea());
        System.out.printf("\nO valor do volume do cilindro: " + cilindro.getVolume());

        System.out.println("\n--------------------------------------------------------");
    }
    
}
