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

        int n1;
        int n2;
        System.out.print("Informe o primeiro número (deve ser menor que o segundo): ");
        n1 = Integer.parseInt(sc.next());
        System.out.print("Informe o segundo número (deve ser maior que o primeiro): ");
        n2 = Integer.parseInt(sc.next());
    }
}
