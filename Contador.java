package fluxo;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            System.out.println("A diferença entre os parâmetros é: " + resultado(parametroUm, parametroDois));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int contador() {

        int contador = get.contagem();

        for (int i = 0; i <= contador; i++) {
            System.out.println("Nº " + i);
        }
        return contador;
    }

    public static int resultado(int parametroUm, int parametroDois) {

        int contagem = parametroUm - parametroDois;
        if (parametroDois < parametroUm) {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        return contagem;
    }

}
