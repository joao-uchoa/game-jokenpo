import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String escolhaDoPlayer1;
        String escolhaDoPlayer2;
        int contadorDeRodadas = 0;
        int contadorDeVitoriasPlayer1 = 0;
        int contadorDeVitoriasPlayer2 = 0;
        int contadorDeEmpate = 0;
        char jogarNovamente;
        String resultado;
        final String VERDE = "\u001B[32m";
        final String AMARELO = "\u001B[33m";
        final String AZUL = "\u001B[34m";
        final String VERMELHO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        do {

            do {

                System.out.println("----------Tabela de Jogadas----------");
                System.out.println(VERDE +"1 - PEDRA\n2 - PAPEL\n3 - TESOURA" + RESET);
                System.out.println(AMARELO +"Jogador número 1" + RESET);
                System.out.println("Escolha a sua jogada de acordo com a tabela de jogadas.");
                System.out.print("Jogada número: ");
                escolhaDoPlayer1 = sc.next();

                if (escolhaDoPlayer1.equals("1") || escolhaDoPlayer1.equals("2") || escolhaDoPlayer1.equals("3")) {
                    break;
                }

                System.out.println(VERMELHO + "Você escolheu uma jogada inexistente. Tente novamente." + RESET);

            } while (true);

            do {

                System.out.println("----------Tabela de Jogadas----------");
                System.out.println(VERDE +"1 - PEDRA\n2 - PAPEL\n3 - TESOURA" + RESET);
                System.out.println(AMARELO +"Jogador número 2" + RESET);
                System.out.println("Escolha a sua jogada de acordo com a tabela de jogadas.");
                System.out.print("Jogada número: ");
                escolhaDoPlayer2 = sc.next();

                if (escolhaDoPlayer2.equals("1") || escolhaDoPlayer2.equals("2") || escolhaDoPlayer2.equals("3")) {
                    break;
                }

                System.out.println(VERMELHO + "Você escolheu uma jogada inexistente. Tente novamente." + RESET);

            } while (true);


            if (escolhaDoPlayer1.equals(escolhaDoPlayer2)) {
                resultado = "Empate";
                contadorDeEmpate++;
            } else if (escolhaDoPlayer1.equals("1") && escolhaDoPlayer2.equals("3")) {
                resultado = "Vencedor é o jogador número 1";
                contadorDeVitoriasPlayer1++;
            } else if (escolhaDoPlayer1.equals("2") && escolhaDoPlayer2.equals("1")) {
                resultado = "Vencedor é o jogador número 1";
                contadorDeVitoriasPlayer1++;
            } else if (escolhaDoPlayer1.equals("3") && escolhaDoPlayer2.equals("2")) {
                resultado = "Vencedor é o jogador número 1";
                contadorDeVitoriasPlayer1++;
            } else {
                resultado = "Vencedor é o jogador número 2";
                contadorDeVitoriasPlayer2++;
            }

            contadorDeRodadas++;
            System.out.printf("Na %dª rodada o %s\n", contadorDeRodadas, VERDE + resultado + RESET);

            do {

                System.out.println("Você deseja jogar novamente " + VERDE + "[S]" + RESET + "/" + VERMELHO + "[N]" + RESET + "?");
                System.out.println(VERDE + "[S] - sim" + RESET + " e " + VERMELHO + "[N] - não" + RESET);
                jogarNovamente = sc.next().charAt(0);
                jogarNovamente = Character.toUpperCase(jogarNovamente);

                if (jogarNovamente == 'S' || jogarNovamente == 'N'){
                    break;
                }

            } while(true);

            if (jogarNovamente == 'N') {
                break;
            }

        }while (true);

        System.out.printf(AZUL + "O número de rodadas jogadas foram: %d" + RESET + "\n", contadorDeRodadas);
        System.out.printf(AZUL + "O número de vitórias do jogador número 1 foram: %d" + RESET + "\n", contadorDeVitoriasPlayer1);
        System.out.printf(AZUL + "O número de vitórias do jogador número 2 foram: %d" + RESET + "\n", contadorDeVitoriasPlayer2);
        System.out.printf(AZUL + "O número de empates foram: %d" + RESET + "\n", contadorDeEmpate);

        sc.close();
    }
}
