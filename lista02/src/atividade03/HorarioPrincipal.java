package atividade03;


import java.util.Scanner;


public class HorarioPrincipal 
{
    public static void main(String[] args) throws Exception
    {
        int hora;
        int minuto;
        int segundo;

        Scanner input = new Scanner(System.in);

        System.out.println("\n--------------------------------------");

        System.out.printf("Digite as horas: ");
        hora = input.nextInt();

        System.out.printf("Digite os minutos: ");
        minuto = input.nextInt();

        System.out.printf("Digite os segundos: ");
        segundo = input.nextInt();

        System.out.println("\n--------------------------------------");

        Horario horario = new Horario(hora, minuto, segundo);

        horario.mostrarHorario();

        for (int i = 0; i < 4999; i++) 
        {
            Thread.sleep(1000);
            horario.incrementarHorario();
            horario.mostrarHorario();
        }
    }
}
