package game1;



import java.util.Random;
import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {
        String nome;
        int resposta, mult = 1;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Insira seu nome");
        nome = teclado.next();
        System.out.println("Deseja começar o jogo de advinhação?(1) para sim e (2) para não");
        resposta = teclado.nextInt();

        if (resposta == 1) {
            System.out.println("Insira sua aposta");
            int aposta;
            aposta = teclado.nextInt();
            int tentativas = 0, soma = 0, tentAcerto = 0;
            boolean acertou = false;

            System.out.println("Bem-vindo ao jogo de adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");

            while (soma < 10000) {

                while (resposta == 1) {

                    while (!acertou) {
                        int numeroSecreto = random.nextInt(100) + 1;
                        System.out.println(numeroSecreto);
                        System.out.print("Digite sua tentativa: ");
                        int palpite = teclado.nextInt();
                        tentativas++;

                        if (palpite < numeroSecreto) {
                            System.out.println("O número é maior!");
                        } else if (palpite > numeroSecreto) {
                            System.out.println("O número é menor!");
                        } else {
                            acertou = true;
                            tentAcerto += 1;
                            soma = mult * (tentAcerto * aposta);
                            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas." + "Seu prêmio é de " + soma + " reais");

                        }

                    }
                    System.out.println("Deseja continuar?(1) para sim");
                    resposta = teclado.nextInt();
                    mult += 2;
                    if (resposta == 1) {
                        acertou = false;
                    }

                }
                System.out.println("Bye");
                return;

            }

        }
    }
}
