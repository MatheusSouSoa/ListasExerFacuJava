package num04.model;

public class Paralelepipedo {
    
    private float ladoA;
    private float ladoB;
    private float ladoC;

    
    public Paralelepipedo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float calculaDiagonal(){
        
        double L = Math.sqrt(Math.pow(ladoA, 2) + Math.pow( ladoB, 2));
        double diagonal = Math.sqrt(Math.pow(L, 2) +  Math.pow(ladoC, ladoC));

        return (float) diagonal;
    }


    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    public float getLadoC() {
        return ladoC;
    }
    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }


}
