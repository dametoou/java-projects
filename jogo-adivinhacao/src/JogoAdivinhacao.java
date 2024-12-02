import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String repetir;

        do {
            Random random = new Random();
            int aleatorio = random.nextInt(101);

            System.out.println("JOGO DA ADIVINHAÇÃO");
            System.out.println("O número sorteado está entre 0 e 100. \n");
            System.out.print("Digite sua tentativa: ");
            int numeroChute = read.nextInt();
            int tentativa = 1;

            do {
                if (numeroChute != aleatorio) {
                    System.out.println("Errou! Tente novamente.");
                    if (numeroChute < aleatorio) {
                        System.out.printf("O número %d é menor que o número escondido.%n", numeroChute);
                    } else {
                        System.out.printf("O número %d é maior que o número escondido.%n", numeroChute);
                    }
                    System.out.println("Tentativa: " + tentativa);
                    System.out.print("Digite uma nova tentativa: ");
                    numeroChute = read.nextInt();
                    tentativa++;
                    System.out.println();
                } else {
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("O número era " + aleatorio);
                    System.out.println("Total de tentativas: " + tentativa);
                    System.out.println();
                    break;
                }
            } while (tentativa <= 10);

            if (tentativa > 10) {
                System.out.println("Você perdeu!");
                System.out.println("O número era " + aleatorio);
            }

            System.out.print("Jogar novamente? [S/N]: ");
            repetir = read.next();
            System.out.println();
        } while (repetir.equalsIgnoreCase("s"));

        System.out.println("OBRIGADO POR JOGAR!");

        read.close();

    }
}