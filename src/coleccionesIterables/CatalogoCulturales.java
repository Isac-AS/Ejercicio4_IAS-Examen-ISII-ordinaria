package coleccionesIterables;

import iterator.IteradorCronologico;
import iterator.iterator;
import java.util.ArrayList;
import modelo.SincronicidadEventosHistoricos;

public class CatalogoCulturales implements Catalogo{
    
    private ArrayList<SincronicidadEventosHistoricos> eventos;

    public CatalogoCulturales() {
        this.eventos = new ArrayList<>();
    }

    @Override
    public iterator crearIterador(String tipo) {
        switch (tipo) {
            case "cronologico" :
                return new IteradorCronologico(this);
        }
        return null;
    }

    @Override
    public void agregarEvento(SincronicidadEventosHistoricos evento) {
        this.eventos.add(evento);
    }

    @Override
    public void mostrarTrayectoria(String tipo) {
        iterator iterador = this.crearIterador(tipo);
        while (iterador.hasMore()) {
            System.out.println(iterador.getNext());
        }
    }

    @Override
    public int size() {
        return eventos.size();
    }

    @Override
    public ArrayList<SincronicidadEventosHistoricos> getEventos() {
        return eventos;
    }
    
    
    
}
