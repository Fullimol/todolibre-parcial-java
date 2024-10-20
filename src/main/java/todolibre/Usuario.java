package todolibre;

public class Usuario {

    private int id;
    private Domicilio domicilio;
    private String nombre;
    private String apellido;
    private String mail;

    public Usuario(int id, Domicilio domicilio, String nombre, String apellido, String mail) {

        this.apellido = apellido;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.mail = mail;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

}
