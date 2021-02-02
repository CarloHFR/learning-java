package atividade03;


import java.util.Scanner;


public class PrincipalContaCorrente 
{
    public static void cadastrar(ContaCorrente conta_corrente)
    {
        Scanner input = new Scanner(System.in);

        String nome_cliente;
        String agencia;
        String conta;

        System.out.println("\n--------------------------------------");

        System.out.printf("Informe o nome do cliente: ");
        nome_cliente = input.nextLine();

        System.out.printf("Informe o numero da agencia: ");
        agencia = input.nextLine();

        System.out.printf("Informe o numero da conta: ");
        conta = input.nextLine();

        System.out.println("--------------------------------------");

        conta_corrente.set_nome_cliente(nome_cliente);
        conta_corrente.set_agencia(agencia);
        conta_corrente.set_conta(conta);
    }


    public static void depositar(ContaCorrente conta_corrente)
    {
        Scanner input = new Scanner(System.in);

        Double valor;

        System.out.println("\n--------------------------------------");

        System.out.printf("Informe o valor do deposito: ");
        valor = input.nextDouble();

        System.out.println("--------------------------------------");

        conta_corrente.depositar(valor);
    }


    public static void consultar(ContaCorrente conta_corrente)
    {
        conta_corrente.imprimir();
    }


    public static void sacar(ContaCorrente conta_corrente)
    {
        Scanner input = new Scanner(System.in);

        Double valor;

        System.out.println("\n--------------------------------------");

        System.out.printf("Informe o valor do saque: ");
        valor = input.nextDouble();

        System.out.println("--------------------------------------");

        int status = conta_corrente.sacar(valor);

        System.out.println("\n--------------------------------------");
        
        if(status == 1)
        {
            System.out.printf("Saque realizado");
        }else
        {
            System.out.printf("Saque não realizado");
        }

        System.out.println("\n--------------------------------------");
    }


    public static void main(String[] args) throws Exception 
    {
        ContaCorrente conta_corrente = new ContaCorrente();

        Scanner input = new Scanner(System.in);

        char opcao;

        while(true)
        {
            System.out.println("\n--------------------------------------");
            System.out.println("Banco Digital");
            System.out.println("--------------------------------------");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Consultar");
            System.out.println("[4] - Sacar");
            System.out.println("[5] - Sair");

            System.out.printf("> ");
            opcao = input.next().charAt(0);

            switch (opcao)
            {
                case '1': cadastrar(conta_corrente); break;
                case '2': depositar(conta_corrente); break;
                case '3': consultar(conta_corrente); break;
                case '4': sacar(conta_corrente); break;
                case '5': System.exit(0); break;
            }
        }
    }
    
}
