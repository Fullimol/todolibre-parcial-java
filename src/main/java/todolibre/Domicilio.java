package todolibre;

public class Domicilio {

    private String calle;
    private int altura;
    private int numComuna;

    public Domicilio(String calle, int altura, int numComuna) {

        this.calle = calle;
        this.altura = altura;
        this.numComuna = numComuna;

    }

    public int getNumComuna() {
        return numComuna;
    }

}
