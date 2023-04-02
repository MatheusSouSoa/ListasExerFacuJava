package num03.model;

import java.util.ArrayList;
import java.util.List;

public class Amostra {
    
    private int codAmostra;
    private int conteudoCarbono;
    private int durezaRockwell;
    private int resistenciaTracao;

    
    public Amostra(int codAmostra, int conteudoCarbono, int durezaRockwell, int resistenciaTracao) {
        this.codAmostra = codAmostra;
        this.conteudoCarbono = conteudoCarbono;
        this.durezaRockwell = durezaRockwell;
        this.resistenciaTracao = resistenciaTracao;
    }

    public int informaGrau(){

        List<Integer> testes = new ArrayList<Integer>();
        int pontos [] = {7,8,9,10};
        int retorno = 7;
        
        if(this.conteudoCarbono < 7){
            testes.add(1);
        }
        if(this.getDurezaRockwell() > 50){
            testes.add(2);
        }
        if(this.resistenciaTracao > 80000){
            testes.add(3);
        }

        for(int i = 1; i < 4; i++){
            if(testes.contains(i)){
                retorno = pontos[i];
            }
        }

        return retorno;
    }


    public int getCodAmostra() {
        return codAmostra;
    }
    public void setCodAmostra(int codAmostra) {
        this.codAmostra = codAmostra;
    }
    public int getConteudoCarbono() {
        return conteudoCarbono;
    }
    public void setConteudoCarbono(int conteudoCarbono) {
        this.conteudoCarbono = conteudoCarbono;
    }
    public int getDurezaRockwell() {
        return durezaRockwell;
    }
    public void setDurezaRockwell(int durezaRockwell) {
        this.durezaRockwell = durezaRockwell;
    }
    public int getResistenciaTracao() {
        return resistenciaTracao;
    }
    public void setResistenciaTracao(int resistenciaTracao) {
        this.resistenciaTracao = resistenciaTracao;
    }



}
