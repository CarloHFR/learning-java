package atividade01;


import java.util.Scanner;


public class TrapezioPrincipal 
{
    public static void main(String[] args) throws Exception 
    {
        Double baseMaior;
        Double baseMenor;
        Double altura;
        Double area;

        Scanner input = new Scanner(System.in);
        Trapezio trapezio = new Trapezio();

        System.out.println("\n--------------------------------------");

        System.out.printf("Digite a base maior: ");
        baseMaior = input.nextDouble();

        System.out.printf("Digite a base menor: ");
        baseMenor = input.nextDouble();
        
        System.out.printf("Digite a altura: ");
        altura = input.nextDouble();

        System.out.println("--------------------------------------");

        trapezio.setBaseMaior(baseMaior);
        trapezio.setBaseMenor(baseMenor);
        trapezio.setAltura(altura);

        area = trapezio.calcularArea();

        System.out.println("Area do trapezio: " + area);

        System.out.println("--------------------------------------");
    }
    
}
