package num06.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import num06.Ponto;

public class PontoControle {
    
    public static void main(String...args){
        
        Scanner ler = new Scanner(System.in);
        List<Float> x = new ArrayList<Float>();
        List<Float> y = new ArrayList<Float>();

    
        while(true){

            for(int i = 0; i < 2; i++){
                System.out.printf("Informe o ponto X%d:\n",i + 1);
                x.add(ler.nextFloat());

                System.out.printf("Informe o ponto Y%d:\n",i + 1);
                y.add(ler.nextFloat());
            }

            Ponto ponto = new Ponto(x.get(0), y.get(0), x.get(1), y.get(1));

            System.out.println("A distancia entre os pontos é: "+ ponto.calculaDistancia());
    

            System.out.println("Deseja sair ?\n1 - Sim\n2 - Não");
            if(ler.nextInt() == 1)
                break;
        }

        ler.close();
    }


}
