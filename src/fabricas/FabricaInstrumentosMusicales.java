package fabricas;

import elementos.Amplificador;
import elementos.Guitarra;
import elementos.Microfono;

public abstract class FabricaInstrumentosMusicales {
    protected Guitarra guitarra;
    protected Amplificador amplificador;
    protected Microfono microfono;
    
    public abstract void crearInstrumento(String op);
}