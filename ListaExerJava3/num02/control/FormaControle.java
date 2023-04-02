package num02.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import num02.model.Forma;

public class FormaControle {
    
    public static void main(String... ars){

        try (Scanner ler = new Scanner(System.in)) {
            while(true){
                
                List<Float> lados = new ArrayList<Float>();
    
                for(int i  = 0; i < 3; i++){
                    System.out.printf("Informe o %d° lado do triangulo:\n", i + 1);
                    lados.add(ler.nextFloat());
                }
    
                Forma forma = new Forma(lados.get(0), lados.get(1), lados.get(2));
    
                System.out.println(forma.verificaForma());

                System.out.println("Deseja verificar mais algum triangulo?\n1 - Sim\n2 - Não");
                if(ler.nextInt() == 2)
                    break;

            }
        }

    }

}
