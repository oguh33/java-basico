import java.util.Scanner;

public class ContaTerminal {



    public static void main(String[] args) {
         double saldo = 25; //15;

        double valorSolicitado = 18; //22;

        if( saldo < valorSolicitado ) {
            System.out.println("Saldo insuficiente");
        }

        if( saldo > valorSolicitado ) {
            saldo = saldo - valorSolicitado;
            System.out.println("O saldo atual é " + saldo);
        }
    }
}