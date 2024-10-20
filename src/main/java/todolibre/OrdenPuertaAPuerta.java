package todolibre;

public class OrdenPuertaAPuerta extends OrdenDeCompra {

    private boolean esGratuito;

    public OrdenPuertaAPuerta(double monto, int numeroOrden, Usuario usuarioComprador, Usuario usuarioVendedor, boolean esGratuito) {
        super(monto, numeroOrden, usuarioComprador, usuarioVendedor);
        this.esGratuito = esGratuito;
    }

    public boolean isEsGratuito() {
        return esGratuito;
    }
}
