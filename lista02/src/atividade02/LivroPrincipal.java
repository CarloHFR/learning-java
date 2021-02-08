package atividade02;


import java.util.Scanner;


public class LivroPrincipal 
{
    public static void main(String[] args) throws Exception 
    {
        String nome;
        String pais;
        String sexo;
        String titulo;
        int ano;

        Scanner input = new Scanner(System.in);
        Livro livro = new Livro();
        Autor autor = new Autor();

        System.out.println("\n--------------------------------------");

        System.out.printf("Digite o nome do autor: ");
        nome = input.nextLine();

        System.out.printf("Digite o pais do autor: ");
        pais = input.nextLine();

        System.out.printf("Digite o sexo do autor: ");
        sexo = input.nextLine();

        System.out.println("\n--------------------------------------");

        System.out.printf("Digite o titulo do livro: ");
        titulo = input.nextLine();

        System.out.printf("Digite o ano do livro: ");
        ano = input.nextInt();

        System.out.println("--------------------------------------");

        autor.setNome(nome);
        autor.setPais(pais);
        autor.setSexo(sexo);

        livro.setAutor(autor);
        livro.setTitulo(titulo);
        livro.setAno(ano);

        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Ano: " + livro.getAno());

        System.out.println("--------------------------------------");
    }
    
}
