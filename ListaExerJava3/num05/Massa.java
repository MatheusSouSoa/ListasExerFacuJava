package num05;

public class Massa {
    
    private float massaInicial;
    private float massaFinal;
    private int tempo;

    public Massa(float massaInicial) {
        this.massaInicial = massaInicial;
        this.massaFinal = massaInicial;
        this.tempo = 0;
    }

    public void calculaTempo(){

        while(massaFinal >= 0.5){
            massaFinal /= 2;
            this.tempo += 50;
        }

    }

    public float getMassaInicial() {
        return massaInicial;
    }
    public void setMassaInicial(float massaInicial) {
        this.massaInicial = massaInicial;
    }
    public float getMassaFinal() {
        return massaFinal;
    }
    public void setMassaFinal(float massaFinal) {
        this.massaFinal = massaFinal;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


}
