
// OBJETIVO FINAL - IMPRIMIR : "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

// importar Scanner

// Declarar variaveis e solicitar preenchimento por parte do usuario 

// Imprimir resultado final do codigo

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1 - Nome do cliente 

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        // 2 - Agencia 

        System.out.println("Digite a sua agencia bancaria");
        String agencia = scanner.next();
        
        // 3 - Numero 

        System.out.println("Digite o numero de sua conta");
        int numero = scanner.nextInt();

        // 4 - Saldo Aleatorio e limites

        Random saldo = new Random();

        // 4.1 - Limite minimo e maximo 

        double limiteInferior = 0 ;
        double limiteSuperior = 100000;

        // 4.2 - Gerar saldo com o valor aleatorio

        double saldoAleatorio = saldo.nextDouble(limiteSuperior - limiteInferior + 1) + limiteInferior;

        //4.3 - corrigir saldo para apenas 2 casas decimais

        BigDecimal saldoFinal = BigDecimal.valueOf(saldoAleatorio).setScale(2, RoundingMode.HALF_UP);
        
        // 5 - Impressao dos dados finais concatenados

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldoFinal + " já está disponível para saque");


    }
}