package coleccionesIterables;

import iterator.IteradorCronologico;
import iterator.iterator;
import java.util.ArrayList;
import modelo.SincronicidadEventosHistoricos;

public class CatalogoCulturales implements Catalogo{
    
    private ArrayList<SincronicidadEventosHistoricos> eventos;
    iterator iterador;

    public CatalogoCulturales() {
        this.eventos = new ArrayList<>();
    }

    @Override
    public void crearIterador(String tipo) {
        switch (tipo) {
            case "cronologico" :
                iterador = new IteradorCronologico(this);
        }
    }

    @Override
    public void agregarEvento(SincronicidadEventosHistoricos evento) {
        this.eventos.add(evento);
    }

    @Override
    public void mostrarTrayectoria() {
        
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
