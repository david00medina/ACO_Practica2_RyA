package aco_practica2;

import java.util.ArrayList;

public class RamificacionAcotacion {

    private Grafo grafo;
    private ArrayList<Arista> solucionTemporal;
    private ArrayList<Arista> solucion;
    private ArrayList<Arista> nodosActivos;

    public RamificacionAcotacion(Grafo gr) {

        grafo = gr;
        solucionTemporal = new ArrayList<>();
        solucion = new ArrayList<>();
        nodosActivos = new ArrayList<>();
    }

    public void execRyA() {

        // Tomar el nodo raiz
        int nivelActivo = grafo.getNivelInicio();
        // Ver sus nodos hijos (Nodos activos)
        // Escoger el de menor peso (Nodos activos)

        // Repetir hasta llegar al último nodo (Nodo activo final)
        Arista menor;
        while (nivelActivo < grafo.getNivelFinal()) {

            nodosActivos = grafo.expansion(nivelActivo);
            menor = nodosActivos.get(0);
            for (Arista it : nodosActivos) {
                //System.out.println(it);
                if (menor.getPeso() > it.getPeso()) {
                    menor = it;
                }
            }

            solucionTemporal.add(menor);
            nivelActivo++;
        }
        for (Arista it : solucionTemporal) {
            System.out.println(it);
        }
        // Guardar la suma de pesos del camino

        // Repetir todo lo anterior
        // Comparar suma de peso de iteración i-ésima con 
        // la iteración con menor peso
        // Quedarse con el camino de menor peso
        // Devolver camino de menor peso
    }

}
