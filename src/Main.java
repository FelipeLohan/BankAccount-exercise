import entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner teclado = new Scanner(System.in);
            int opcao = 0;
            List<Account> accounts = new ArrayList<>();
            do{
                System.out.println("-------SISTEMA BANCARIO-------");
                System.out.println("1 - NOVA CONTA");
                System.out.println("2 - DEPOSITAR");
                System.out.println("3 - SACAR");
                System.out.println("4 - SALDO DISPONIVEL");
                System.out.println("5 - SAIR");
                opcao = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcao){
                        case 1:
                            System.out.println("Digite o nome do conta: ");
                                String holder = teclado.nextLine();
                            System.out.println("Digite o numero da conta:");
                                int number = teclado.nextInt();
                                    teclado.nextLine();
                            System.out.println("Digite o limite de saque da conta");
                                double limit = teclado.nextDouble();
                                    teclado.nextLine();

                                Account account = new Account(number, limit, holder);
                                accounts.add(account);
                                break;
                        case 2:
                            System.out.println("Quanto deseja depositar? ");
                                double amount = teclado.nextDouble();
                                    teclado.nextLine();
                            for(Account a : accounts){
                                a.deposit(amount);
                            }
                            break;
                        case 3:
                            System.out.println("Quanto deseja sacar? ");
                                amount = teclado.nextDouble();
                                    teclado.nextLine();
                            for(Account a : accounts){
                                a.withdraw(amount);
                            }
                            break;
                        case 4:
                            for(Account a : accounts){
                                System.out.println(a.getBalance());
                            }
                            break;
                        case 5:
                            System.out.println("Obrigado por usar o sistema!");
                            break;
                        default:
                            System.out.println("Opcao invalida");
                            break;
                    }
            } while (opcao != 5);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}