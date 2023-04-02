package num04.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import num04.model.Paralelepipedo;

public class ParalelepipedoControle{

    public static void main(String...args){

        Scanner ler = new Scanner(System.in);
        List<Float> arestas = new ArrayList<Float>();

        while(true){

            for(int i = 0; i < 3; i++){
                System.out.printf("Informe a %d° aresta do paralelepipedo.\n", i + 1);
                arestas.add(ler.nextFloat());
            }

            Paralelepipedo paralelepipedo = new Paralelepipedo(arestas.get(0),arestas.get(1), arestas.get(2));

            System.out.println(paralelepipedo.calculaDiagonal());

            System.out.println("Deseja sair ?\n1 - Sim\n2 - Não");
            if(ler.nextInt() == 1)
                break;
        }
        
        ler.close();
    }
}