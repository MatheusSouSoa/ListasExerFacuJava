package num01.model;

import java.util.ArrayList;
import java.util.List;

public class Pagamento{

    private int codigo;
    private int qtd;
    private Double precoUni;
    private int formaPag;


    public Pagamento(int codigo, int qtd, Double precoUni, int formaPag) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.precoUni = precoUni;
        this.formaPag = formaPag;
    }


    public List<Double> calculaDesconto(){
        List<Double> valores =  new ArrayList<Double>(); 
        Double valorFinal;
        Double valorDesc;
        
        switch(formaPag){
            case 1:
            valorDesc = (this.qtd * this.precoUni) * 0.1;
            valorFinal = (this.qtd * this.precoUni) - valorDesc;
            valores.add(valorFinal);
            valores.add(valorDesc);
            break;
            case 2:
                valorDesc = (this.qtd * this.precoUni) * 0.02;
                valorFinal = (this.qtd * this.precoUni) - valorDesc;
                valores.add(valorFinal);
                valores.add(valorDesc);
            break;
            case 3:
                valorDesc = (this.qtd * this.precoUni) * 0.05;
                valorFinal = (this.qtd * this.precoUni) - valorDesc;
                valores.add(valorFinal);
                valores.add(valorDesc);
            break;
            case 4:
                valorDesc = (this.qtd * this.precoUni) * 0.05;
                valorFinal = (this.qtd * this.precoUni) - valorDesc;
                valores.add(valorFinal);
                valores.add(valorDesc);
            break;
            
        }
        return valores;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Double getPrecoUni() {
        return precoUni;
    }
    public void setPrecoUni(Double precoUni) {
        this.precoUni = precoUni;
    }
    public int getFormaPag() {
        return formaPag;
    }
    public void setFormaPag(int formaPag) {
        this.formaPag = formaPag;
    }

}