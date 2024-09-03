package Banco.dominio;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {


        ContaPessoa conta = new ContaPessoa();
        ImprimirDados imprimi = new ImprimirDados();
        ValidaçãoDados validacao = new ValidaçãoDados();

        Scanner input = new Scanner(System.in);
        String apresentação = "\n--------Seja Bem Vindo-------- \n" +
                " \nBANCO OURO\n\n" +
                "Escolha 1 Opção abaixo\n" +
                "1- Cadastro  \n" +
                "2- Login \n" +
                "5- Sair do programa\n" +
                "Digite a Opção: ";

//        System.out.println(apresentação);

        int op = 0;

        while (op != 3) {
            System.out.println(apresentação);
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Opção Cadastro ");

                    System.out.println("Numero da Conta");
                    conta.numeroConta = input.nextInt();

                    System.out.println("Nome Completo");
                    conta.pessoa = input.next();

                    System.out.println("Senha Cadastrada");
                    conta.senha = input.nextInt();

                    System.out.println("Cadastro Realizado" + conta.senha);
                    break;

                case 2:
                    System.out.println("Opção Login");
                    int numeroConta = input.nextInt();
                    String pessoa = input.next();
                    int senha = input.nextInt();

                    if (validacao.nome(conta).equals(pessoa) && validacao.numeroConta(conta) == numeroConta && validacao.senha(conta) == senha) {
                        System.out.println("Acesso Permitido");

                    } else {
                        imprimi.imprimir(conta);
                        System.out.println("Acesso Negado");
                        System.out.println(validacao.nome(conta));
                        System.out.println(pessoa);
                    }

                    break;

                case 3:
                    System.out.println("Saindo... \n obrigado por usar");
                    break;

                default:
                    System.out.println("Insira uma opção valida");
                    break;
            }
        }
    }
}

