package coleccionesIterables;

import iterator.iterator;
import java.util.ArrayList;
import modelo.SincronicidadEventosHistoricos;

public interface Catalogo {
    void crearIterador(String tipo);
    void agregarEvento(SincronicidadEventosHistoricos evento);
    void mostrarTrayectoria();
    public int size();
    ArrayList<SincronicidadEventosHistoricos> getEventos();
}
