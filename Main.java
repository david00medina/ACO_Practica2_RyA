package aco_practica2;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
        System.out.println("===== CASO 1: GENERAL ======");
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        RamificacionAcotacion ramyac = new RamificacionAcotacion(g1);
        ramyac.execRyA();
    }
    
}
