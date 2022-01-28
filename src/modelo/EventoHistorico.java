package modelo;

public class EventoHistorico implements SincronicidadEventosHistoricos{
    private String localizacion;
    private String nombre;
    private String descripcion;
    private String fecha;
    private ContenidoAdicional elementoAdicional;

    public EventoHistorico(String localizacion, String nombre, String descripcion, String fecha, ContenidoAdicional elementoAdicional) {
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.elementoAdicional = elementoAdicional;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public ContenidoAdicional getElementoAdicional() {
        return elementoAdicional;
    }
}
