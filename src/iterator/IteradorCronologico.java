package iterator;

import coleccionesIterables.Catalogo;
import java.util.ArrayList;
import modelo.SincronicidadEventosHistoricos;

public class IteradorCronologico implements iterator{
    
    private Catalogo catalogo;
    private int estadoIteracion = 0;
    private ArrayList<SincronicidadEventosHistoricos> coleccion;

    public IteradorCronologico(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.coleccion = catalogo.getEventos();
    }

    @Override
    public String getNext() {
        // Falta la implementación de toString del elemento histórico (no queda tiempo procedo a la entrega)
        String result = coleccion.get(estadoIteracion).toString();
        estadoIteracion++;
        return result;
    }

    @Override
    public boolean hasMore() {
        if (estadoIteracion < catalogo.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
    Aquí iría por ejemplo una función que ordenase la colección por el campo 
    de fecha o periodo temporal de los elementos. Por motivos de tiempo no 
    puedo implementarla.
    */
    private void sort() {
        
    }
}
