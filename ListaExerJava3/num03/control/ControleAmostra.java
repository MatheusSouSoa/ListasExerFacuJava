package num03.control;

import java.util.Scanner;

import num03.model.Amostra;

public class ControleAmostra {
    
    public static void main (String... args){
        try (Scanner ler = new Scanner(System.in)) {
            while(true){

                System.out.println("Informe o codigo da amostra:");
                int cod = ler.nextInt();

                System.out.println("Informe o nivel de carbono em porcentagem(Apenas numeros):");
                int carbono = ler.nextInt();

                System.out.println("Informe a dureza Rockwell:");
                int rockwell = ler.nextInt();

                System.out.println("Informe a resistencia psi:");
                int psi = ler.nextInt();
                
                Amostra amostra = new Amostra(cod, carbono, rockwell, psi);

                System.out.println(amostra.informaGrau());
                
                System.out.println("Deseja sair?\n1 - Sim\n2 - Não");
                if(ler.nextInt() == 1)
                    break;
            }
        }

    }
    
}
