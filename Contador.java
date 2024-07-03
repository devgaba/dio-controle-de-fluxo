import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroDois, parametroUm);
            if (parametroDois < parametroUm) {
                throw new ParametrosInvalidosException();

            } else {
                for (int i = 0; i < contar(parametroDois, parametroUm); i++) {
                    System.err.println("Imprimindo o número " + (i + 1));
                }
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("" + e.getMessage());
        } finally {
            terminal.close();
        }

    }

    public static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static int contar(int parametroDois, int parametroUm) {
        return parametroDois - parametroUm;
    }
}