package num01.control;

import java.util.List;
import java.util.Scanner;

import num01.model.Pagamento;

public class ControlePagamentos {
    
    public static void main(String[] args){

        try (Scanner ler = new Scanner(System.in)) {
            Boolean flag = true;

            while(flag){
                System.out.println("Informe a forma de pagamento.");
                System.out.println("1 - Dinheiro\n2 - Cheque\n3 - Cartão débito\n4 - Cartão crédito\n0 - Sair\n");
                int pag = ler.nextInt();

                if(pag == 0){
                    flag = false;
                    continue;
                }

                System.out.println("Informe o codigo:");
                int cod = ler.nextInt();

                System.out.println("Informe o preço unitario:");
                Double precoUni = ler.nextDouble();
                
                System.out.println("Informe a quantidade comprada:");
                int qtd = ler.nextInt();

                Pagamento pagamento = new Pagamento(cod, qtd, precoUni, pag);

                List<Double> valoresFinais = pagamento.calculaDesconto();

                System.out.printf("O valor final a ser pago é: R$%.2f\nO desconto foi de: R$%.2f\n",valoresFinais.get(0), valoresFinais.get(1));
                System.out.println(valoresFinais);
                

            }
        }

    }
}
