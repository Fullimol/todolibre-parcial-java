package todolibre;

import java.util.ArrayList;

public class TodoLibre {

    private ArrayList<Usuario> usuarios;
    private ArrayList<OrdenDeCompra> ordenes;

    public TodoLibre(ArrayList<Usuario> usuarios, ArrayList<OrdenDeCompra> ordenes) {

        this.usuarios = usuarios;
        this.ordenes = ordenes;
    }

    public double porcentajeMismasComunas() {

        int cant = 0;
        double porcentaje = 0;
        for (OrdenDeCompra ordenDeCompra : ordenes) {

            if (ordenDeCompra.validarMismaComuna()) {
                cant++;
            }
        }
        porcentaje = cant * 100 / ordenes.size();

        System.out.println("El porcetaje es: " + porcentaje);
        return porcentaje;

    }

    public int calcularOrdenPuertaAPuerta() {
        int cant = 0;
        for (OrdenDeCompra orden : ordenes) {
            if (orden instanceof OrdenPuertaAPuerta) {
                if (((OrdenPuertaAPuerta) orden).isEsGratuito()) {
                    cant++;
                }
            }
        }

        System.out.println("La cantidad de ordenes es: " + cant);
        return cant;
    }

}
