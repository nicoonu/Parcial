package fabricas;

import elementos.AmplificadorMarshall;
import elementos.AmplificadorVox;

public class FabricaDeAmplificador extends FabricaInstrumentosMusicales{
    
     @Override
    public void crearInstrumento(String opcion) {
        if(opcion.equalsIgnoreCase("Marshall")){
            amplificador = new AmplificadorMarshall();
            amplificador.informacion();
        }
        
        if(opcion.equalsIgnoreCase("Vox")){
            amplificador = new AmplificadorVox();
            amplificador.informacion();
        }
    }
}