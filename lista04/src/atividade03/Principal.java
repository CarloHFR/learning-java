package atividade03;


import atividade02.Pessoa;
import atividade02.Fornecedor;
import atividade02.Empregado;
import atividade02.Administrador;
import atividade02.Operario;
import atividade02.Vendedor;


public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.printf("\n--------------------------------------------------------");

        Fornecedor fornecedor = new Fornecedor("joão", "1234-4321", "rua laranjeira - 142", 8000.0, 2000.0);

        System.out.println("\nNome fornecedor: " + fornecedor.getNome());
        System.out.println("Telefone fornecedor: " + fornecedor.getTelefone());
        System.out.println("Endereco fornecedor: " + fornecedor.getEndereco());
        System.out.println("Credito fornecedor: " + fornecedor.getValorCredito());
        System.out.println("Divida fornecedor: " + fornecedor.getValorDivida());
        System.out.println("Saldo fornecedor: " + fornecedor.obterSaldo());
        
        System.out.printf("--------------------------------------------------------");

        Administrador administrador = new Administrador("joão", "1234-4321", "rua laranjeira - 142", 10, 8000.0, 10.0, 1000.0);

        System.out.println("\nNome administrador: " + administrador.getNome());
        System.out.println("Telefone administrador: " + administrador.getTelefone());
        System.out.println("Endereco administrador: " + administrador.getEndereco());
        System.out.println("Codigo setor administrador: " + administrador.getCodigoSetor());
        System.out.println("Salario base administrador: " + administrador.getSalarioBase());
        System.out.println("Imposto administrador: " + administrador.getImposto());
        System.out.println("Ajuda de custo administrador: " + administrador.getAjudaDeCusto());
        System.out.println("Salario administrador: " + administrador.calcularSalario());
        
        System.out.printf("--------------------------------------------------------");

        Operario operario = new Operario("joão", "1234-4321", "rua laranjeira - 142", 10, 2000.0, 10.0, 1000.0, 5.0);

        System.out.println("\nNome operario: " + operario.getNome());
        System.out.println("Telefone operario: " + operario.getTelefone());
        System.out.println("Endereco operario: " + operario.getEndereco());
        System.out.println("Codigo setor operario: " + operario.getCodigoSetor());
        System.out.println("Salario base operario: " + operario.getSalarioBase());
        System.out.println("Imposto operario: " + operario.getImposto());
        System.out.println("Valor da producao operario: " + operario.getValorProducao());
        System.out.println("Comissão operario: " + operario.getComissao());
        System.out.println("Salario operario: " + operario.calcularSalario());
        
        System.out.printf("--------------------------------------------------------");

        Vendedor vendedor = new Vendedor("joão", "1234-4321", "rua laranjeira - 142", 10, 3000.0, 10.0, 1000.0, 2.0);

        System.out.println("\nNome vendedor: " + vendedor.getNome());
        System.out.println("Telefone vendedor: " + vendedor.getTelefone());
        System.out.println("Endereco vendedor: " + vendedor.getEndereco());
        System.out.println("Codigo setor vendedor: " + vendedor.getCodigoSetor());
        System.out.println("Salario base vendedor: " + vendedor.getSalarioBase());
        System.out.println("Imposto vendedor: " + vendedor.getImposto());
        System.out.println("Valor de vendas vendedor: " + vendedor.getValorVendas());
        System.out.println("Comissão vendedor: " + vendedor.getComissao());
        System.out.println("Salario vendedor: " + vendedor.calcularSalario());
        
        System.out.printf("--------------------------------------------------------");
    }
}
