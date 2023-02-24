import java.util.Scanner;

public class JogoImparPar {

	public static void main(String[] args) {
		
		
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int pontos = 1;
        int escolherNumeros[] = new int[2];
        
        String resultado;
        String jogadores[] = new String[2];
        String escolherParImpar[] = new String[2];

        System.out.println("-----------------------------------------------");
        System.out.printf("          |");
        System.out.printf("|");
        System.out.println(" JOGO PAR OU ÍMPAR ||");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < jogadores.length;) {
            System.out.printf("Digite o nome do %1dº Jogador?\n", i + 1);
            jogadores[i] = ler.nextLine();
            System.out.println("-----------------------------------------------");

            i++;
        }
        
        for (int j = 0; j < 5; j++) {
            
            System.out.println("///////////////////////////////////////////////");
            System.out.println("-----------------------------------------------");
            System.out.printf("%1dº Partida\n", j + 1);
            System.out.println("-----------------------------------------------");
            for (int i = 0; i < escolherParImpar.length; i++) {
                System.out.println(jogadores[i] + ", escolha entre Par ou Impar?");
                escolherParImpar[i] = ler.next();
                System.out.println("-----------------------------------------------");
            }

            
            for (int k = 0; k < escolherNumeros.length; k++) {
                System.out.println(jogadores[k] + ", escolha um número entre 0 e 5?");
                escolherNumeros[k] = ler.nextInt();
                System.out.println("-----------------------------------------------");
                System.out.println("///////////////////////////////////////////////");

                soma += escolherNumeros[k];
            }

            if (soma % 2 == 0) {
                resultado = "Par";
            } else {
                resultado = "Impar";
            }

            System.out.println("-----------------------------------------------");
            System.out.printf("%1dº Partida\n", j + 1);
            System.out.println("-----------------------------------------------");
            
            for (int l = 0; l < escolherParImpar.length; l++) {
                if (resultado.equals(escolherParImpar[l])) {
                    System.out.println("A soma deu: " + soma + ", " + resultado + "!");
                    System.out.println("Essa partida quem ganhou foi " + jogadores[l] + "! Parabéns!!!");
                }
            }
            
            for (int m = 0; m < 2; m++) {
                System.out.println(jogadores[m] + ", escolheu " + escolherParImpar[m] + ".");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("///////////////////////////////////////////////");
            soma = 0;
        }
    }
}

	
