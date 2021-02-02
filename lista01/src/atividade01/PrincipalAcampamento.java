package atividade01;


import java.util.Scanner;


public class PrincipalAcampamento 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("\n--------------------------------------");

        System.out.printf("Digite o seu nome: ");
        nome = input.nextLine();

        System.out.printf("Digite o sua idade: ");
        idade = input.nextInt();

        System.out.println("--------------------------------------");
        
        Acampamento acampamento = new Acampamento(nome, idade);
        
        acampamento.imprimir();
        acampamento.separar_grupo();
        acampamento.imprimir();
    }
    
}
