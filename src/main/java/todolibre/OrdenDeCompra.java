package todolibre;

public abstract class OrdenDeCompra {

    private double monto;
    private Usuario usuarioComprador;
    private Usuario usuarioVendedor;
    private int numeroOrden;

    public OrdenDeCompra(double monto, int numeroOrden, Usuario usuarioComprador, Usuario usuarioVendedor) {
        this.monto = monto;
        this.usuarioComprador = usuarioComprador;
        this.usuarioVendedor = usuarioVendedor;
        this.numeroOrden = numeroOrden;
    }

    public boolean validarMismaComuna() {
        return (this.usuarioComprador.getDomicilio().getNumComuna() == this.usuarioVendedor.getDomicilio().getNumComuna());
    }

}
