import exception.InvalidParameterException;

import java.util.Scanner;

public class DesafioControleFluxo {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        ESPECIFICAÇÃO DO DESAFIO:
        O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
        com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console
        dos números incrementados.

        Exemplos:

        Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números,
        exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

        Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar uma exceção customizada
        com a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro"
         */

        System.out.println("Insira dois números para iniciar a contagem");
        int n1;
        int n2;
        while(true) {
            System.out.print("Informe o primeiro número (deve ser menor que o segundo): ");
            n1 = Integer.parseInt(sc.next());
            System.out.print("Informe o segundo número (deve ser maior que o primeiro): ");
            n2 = Integer.parseInt(sc.next());
            try {
                validaParametros(n1, n2);
                int i;
                for (i = 1; i <= (n2 - n1); i++ ) {
                    System.out.println("Imprimindo o número - " + i);
                }
                break;
            } catch (InvalidParameterException ex){
                System.out.println("\n=====================================================");
                System.out.println("* " +ex.getMessage() + " *");
                System.out.println("=====================================================\n");
                System.out.println("Por favor, insira dois números válidos.");
                System.out.println("Por exemplo: 2 e 5, 4 e 8, 10 e 15, etc.\n");
            }
        }
    }

    private static void validaParametros(int n1, int n2) throws InvalidParameterException {
        if (n1 >= n2) throw new InvalidParameterException("O segundo número deve ser maior que o primeiro");
    }
}
