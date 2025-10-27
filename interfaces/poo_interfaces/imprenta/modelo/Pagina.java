package interfaces.poo_interfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible {

    public Pagina(String contenido) {
        super(contenido);
    }
    @Override
    public String imprimir() {
        return "Contenido de la página: " + this.contenido;
    }

}
