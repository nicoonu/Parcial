package fabricas;

import elementos.MicrofonoSamson;
import elementos.MicrofonoShure;

public class FabricaDeMicrofono extends FabricaInstrumentosMusicales {

     @Override
    public void crearInstrumento(String opcion) {
        if(opcion.equalsIgnoreCase("Shure")){
            microfono = new MicrofonoShure();
            microfono.informacion();
        }
        
        if(opcion.equalsIgnoreCase("Samson")){
            microfono = new MicrofonoSamson();
            microfono.informacion();
        }
    }
}