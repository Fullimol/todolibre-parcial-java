package todolibre;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<OrdenDeCompra> ordenes = new ArrayList<OrdenDeCompra>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Domicilio domicilio1 = new Domicilio("mitre", 175, 1875);
        Domicilio domicilio2 = new Domicilio("sarmiento", 175, 999999);

        Usuario comprador = new Usuario(0, domicilio1, "Pepe", "Argento", "pepito123@gmail.com");
        Usuario vendedor = new Usuario(1, domicilio2, "Moni", "Argento", "pepito123@gmail.com");

        OrdenDeCompra ordenPuertaAPuerta1 = new OrdenPuertaAPuerta(6788, 1, comprador, vendedor, true);
        OrdenDeCompra ordenRetiroEnPersona1 = new OrdenRetiroEnPersona(6788, 1, comprador, vendedor, comprador.getDomicilio());

        ordenes.add(ordenPuertaAPuerta1);
        ordenes.add(ordenRetiroEnPersona1);

        usuarios.add(comprador);
        usuarios.add(vendedor);

        TodoLibre todoLibre = new TodoLibre(usuarios, ordenes);
        todoLibre.calcularOrdenPuertaAPuerta();
        todoLibre.porcentajeMismasComunas();

    }

}
