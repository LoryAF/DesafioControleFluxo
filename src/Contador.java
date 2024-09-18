import ParametrosInvalidosException.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parametrosValidos = false;

        while (!parametrosValidos) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);

                break;
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        }
        scanner.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro! Por favor, tente novamente! \n");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}