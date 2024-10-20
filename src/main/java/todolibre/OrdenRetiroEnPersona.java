package todolibre;

public class OrdenRetiroEnPersona extends OrdenDeCompra {

    private Domicilio domicilioSucursal;

    public OrdenRetiroEnPersona(double monto, int numeroOrden, Usuario usuarioComprador, Usuario usuarioVendedor, Domicilio domicilioSucursal) {
        super(monto, numeroOrden, usuarioComprador, usuarioVendedor);
        this.domicilioSucursal = domicilioSucursal;
    }

}
