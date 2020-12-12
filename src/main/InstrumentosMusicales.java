package main;

import fabricas.FabricaDeAmplificador;
import fabricas.FabricaDeGuitarra;
import fabricas.FabricaDeMicrofono;
import fabricas.FabricaInstrumentosMusicales;
import java.util.Scanner;

public class InstrumentosMusicales {

    static FabricaInstrumentosMusicales fInstrumentos = null;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String opcionGuitarra, opcionAmpli, opcionMic;
        
        System.out.println("Ingrese la guitarra que desea para su combo: ");
        opcionGuitarra = scanner.next();
        
        System.out.println("Ingrese el amplificador que desea para su combo: ");
        opcionAmpli = scanner.next();
        
        System.out.println("Ingrese el micrófono que desea para su combo: ");
        opcionMic = scanner.next();
        
        //Se crea un combo de instrumentos/elementos según las opciones ingresadas.
        crearCombo(opcionGuitarra, opcionAmpli, opcionMic);
    }   
    
    public static void crearCombo(String opcionG, String opcionA, String opcionM){
        fInstrumentos = new FabricaDeGuitarra();
        fInstrumentos.crearInstrumento(opcionG);
        
        fInstrumentos = new FabricaDeAmplificador();
        fInstrumentos.crearInstrumento(opcionA);
        
        fInstrumentos = new FabricaDeMicrofono();
        fInstrumentos.crearInstrumento(opcionM);
        
        System.out.println("Su combo está formado por: " + "Guitarra " + opcionG + " / " + "Amplificador " + opcionA + " / " + "Micrófono " + opcionM);
    }
}