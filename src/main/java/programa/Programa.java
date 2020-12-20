package programa;

import entidade.Funcionario;
import entidade.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("entre com o numero de funcionarios: ");
        int n = ler.nextInt();

        List<Funcionario> listaFuncionario = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("O funcionario é terceirizado?");
            String letra = ler.next().toUpperCase();
            System.out.println("Funcionario " + (i+1));
            if (letra.equals("N")) {
                System.out.print("Nome funcionario: ");
                ler.nextLine();
                String nome = ler.nextLine();
                System.out.print("Horas trabalhadas: ");
                Integer horas = ler.nextInt();
                System.out.print("Valor por hora: ");
                Double valorPorHora = ler.nextDouble();

                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                listaFuncionario.add(funcionario);
            }else{
                System.out.print("Nome funcionario: ");
                ler.nextLine();
                String nome = ler.nextLine();
                System.out.print("Horas trabalhadas: ");
                Integer horas = ler.nextInt();
                System.out.print("Valor por hora: ");
                Double valorPorHora = ler.nextDouble();
                System.out.print("despesaAdicinal: ");
                Double despesaAdicinal = ler.nextDouble();
                FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicinal);
                listaFuncionario.add(funcionarioTerceirizado);
            }
        }

        System.out.println("Pagamento");
        for (Funcionario listFuncionario : listaFuncionario){
            System.out.println("Nome: " + listFuncionario.getNome() +" Salario total: " + listFuncionario.pagamento());
        }
    }
}
