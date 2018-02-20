package aco_practica2;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
        System.out.println("===== CASO 1: GENERAL ======");
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        g1.mostrarGrafo();
        /*Kruskal kruskal = new Kruskal(g1);
        Grafo result = kruskal.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();*/
    }
    
}
