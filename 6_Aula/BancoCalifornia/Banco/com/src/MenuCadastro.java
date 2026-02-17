package BancoCalifornia.Banco.com.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MenuCadastro {
    
    public static void main(String []args) throws IOException {

    


    BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("****************************************************");
            System.out.println("*********** Banco Daniel Central *******************");
            System.out.println("****************************************************");

            System.out.println("1 - Já tem conta");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(br.readLine());

            switch (opcao) {

                case 1:
                    System.out.println("Seja Bem-Vindo!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = br.readLine();

                    System.out.print("Sobrenome: ");
                    String sobrenome = br.readLine();

                    System.out.print("Número: ");
                    Long numero = Long.parseLong(br.readLine());

                    System.out.print("CPF: ");
                    Long cpf = Long.parseLong(br.readLine());

                    CadastroMenu cadastro = new CadastroMenu(nome, sobrenome, numero, cpf);
                    cadastro.exibirCad();
                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
