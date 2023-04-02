package num02.model;

public class Forma {
    
    private Float ladoX;
    private Float ladoY;
    private Float ladoZ;

    public Forma(Float ladoX, Float ladoY, Float ladoZ) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
        this.ladoZ = ladoZ;
    }

    public String verificaForma(){
        if(ladoX + ladoY > ladoZ && ladoX + ladoZ > ladoY && ladoY + ladoZ > ladoX){
            if(ladoX.equals(ladoY) && ladoY.equals(ladoZ)){
                return "Triangulo equilatero.";
            }
            else if(ladoX.equals(ladoY) || ladoX.equals(ladoZ) || ladoY.equals(ladoZ)){
                return "Triangulo isosceles";
            }
            else{
                return "triangulo escaleno";
            }
        }
        else
            return "Não é um triangulo";
           

    }


    public Float getLadoX() {
        return ladoX;
    }

    public void setLadoX(Float ladoX) {
        this.ladoX = ladoX;
    }

    public Float getLadoY() {
        return ladoY;
    }

    public void setLadoY(Float ladoY) {
        this.ladoY = ladoY;
    }

    public Float getLadoZ() {
        return ladoZ;
    }

    public void setLadoZ(Float ladoZ) {
        this.ladoZ = ladoZ;
    }

}
