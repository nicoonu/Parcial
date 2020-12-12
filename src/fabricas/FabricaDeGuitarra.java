package fabricas;

import elementos.GuitarraFender;
import elementos.GuitarraGibson;

public class FabricaDeGuitarra extends FabricaInstrumentosMusicales{

    @Override
    public void crearInstrumento(String opcion) {
        if(opcion.equalsIgnoreCase("Fender")){
            guitarra = new GuitarraFender();
            guitarra.informacion();
        }
        
        if(opcion.equalsIgnoreCase("Gibson")){
            guitarra = new GuitarraGibson();
            guitarra.informacion();
        }
    }
}