package num06;

public class Ponto {
    
    private float pontoX1;
    private float pontoY1;
    private float pontoX2;
    private float pontoY2;
    
    public Ponto(float pontoX1, float pontoY1, float pontoX2, float pontoY2) {
        this.pontoX1 = pontoX1;
        this.pontoY1 = pontoY1;
        this.pontoX2 = pontoX2;
        this.pontoY2 = pontoY2;
    }

    public float calculaDistancia(){

        float distancia = ((pontoX2 - pontoX1) * (pontoX2 - pontoX1) + (pontoY2 - pontoY1) * (pontoY2 - pontoY1));

        return (float) Math.sqrt(distancia);
    }

    public float getPontoX1() {
        return pontoX1;
    }
    public void setPontoX1(float pontoX1) {
        this.pontoX1 = pontoX1;
    }
    public float getPontoY1() {
        return pontoY1;
    }
    public void setPontoY1(float pontoY1) {
        this.pontoY1 = pontoY1;
    }
    public float getPontoX2() {
        return pontoX2;
    }
    public void setPontoX2(float pontoX2) {
        this.pontoX2 = pontoX2;
    }
    public float getPontoY2() {
        return pontoY2;
    }
    public void setPontoY2(float pontoY2) {
        this.pontoY2 = pontoY2;
    }

}
