package num05.controle;

import java.util.Scanner;

import num05.Massa;

public class ControleMassa {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
    
        while(true){

            System.out.println("Informe a massa inicial do material:");
            Massa massa = new Massa(ler.nextFloat());

            massa.calculaTempo();
            System.out.println("A massa inicial era de: "+ massa.getMassaInicial());
            System.out.println("A massa final foi de: "+ massa.getMassaFinal());
            System.out.println("O tempo necessario foi de: "+ massa.getTempo() + " segundos");
    
            System.out.println("Deseja sair ?\n1 - Sim\n2 - Não");
            if(ler.nextInt() == 1)
                break;
        }

        ler.close();
    
    }

    
}
