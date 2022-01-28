package ejercicio4_ias;

import coleccionesIterables.Catalogo;
import coleccionesIterables.CatalogoCulturales;
import modelo.SincronicidadEventosHistoricos;
import modelo.EventoHistorico;

public class Ejercicio4_IAS {

    public static void main(String[] args) {
        
        Catalogo catalogoEventosCulturales = new CatalogoCulturales();
        SincronicidadEventosHistoricos evento0 = new EventoHistorico("canarias", "nombre0", "d0", "1999-01-01", null);
        SincronicidadEventosHistoricos evento1 = new EventoHistorico("canarias", "nombre1", "d1", "1999-01-01", null);
        SincronicidadEventosHistoricos evento2 = new EventoHistorico("canarias", "nombre2", "d2", "1999-01-01", null);
        
        
    }
    
}
