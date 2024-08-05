
//importando as classes

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //criando o scanner e implementando a conveção americana (não achei a brasileira)

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);



        //recebendo dados do cliente

        
    
        System.out.println ("Olá querido cliente, seja bem vindo! Digite seu primeiro nome, por favor.");
        String primeiroNome = scanner.next();



        System.out.println ("Digite seu sobrenome:");
        String segundoNome = scanner.next();



        System.out.println ("Digite sua agência :");
        String agencia = scanner.next();



        System.out.println ("Digite o número da sua conta: (Apenas números)");
        int numeroConta = scanner.nextInt();



        System.out.println ("Digite seu saldo:");
        double saldo = scanner.nextDouble();



        //imprimindo a mensagem

        System.out.println ("Olá " + primeiroNome + " " + segundoNome +  ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", de número " + numeroConta + ".");
        System.out.println ("E seu saldo de R$" + saldo + " já está disponível para saque.");



    }
}
