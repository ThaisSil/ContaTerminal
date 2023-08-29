import java.util.Scanner;

public class ContaTerminal  {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo(a)! \nPor favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome completo.");
        String primeiroNome= scanner.nextLine();
        String segundoNome = scanner.nextLine();
        String nomeCompleto = primeiroNome.concat(" ").concat(segundoNome);

        System.out.println("Por favor, digite o saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCompleto + "!" + "\nObrigado por criar uma conta em nosso banco, sua agência é: " + agencia+", conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque." );
    }


    }

