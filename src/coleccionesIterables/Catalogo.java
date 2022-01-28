package coleccionesIterables;

import iterator.iterator;
import java.util.ArrayList;
import modelo.SincronicidadEventosHistoricos;

public interface Catalogo {
    iterator crearIterador(String tipo);
    void agregarEvento(SincronicidadEventosHistoricos evento);
    void mostrarTrayectoria(String tipo);
    public int size();
    ArrayList<SincronicidadEventosHistoricos> getEventos();
}
