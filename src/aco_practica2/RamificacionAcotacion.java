package aco_practica2;

import java.util.ArrayList;



public class RamificacionAcotacion {
    private Grafo grafo;
    private ArrayList<Arista> solucionTemporal;
    private ArrayList<Arista> solucion;
    private ArrayList<Arista> expansion;
    
    public RamificacionAcotacion(Grafo gr) {
    
        grafo = gr;
        solucionTemporal = new ArrayList<>();
        solucion = new ArrayList<>();
        expansion = new ArrayList<>();
    }
    
    public void execRyA(){
        
        
        // Tomar el nodo raiz
        int nivelActivo = grafo.getNivelInicio();
        // Ver sus nodos hijos (Nodos activos)
        // Escoger el de menor peso (Nodos activos)
        int i = 0;
        Arista menor = grafo.getAristas().get(0);
        
        
        while(nivelActivo == grafo.getAristas().get(i).getNivelActual()){
            expansion.add(grafo.getAristas().get(i));
            System.out.println(grafo.getAristas().get(i));
            if(menor.getPeso() > grafo.getAristas().get(i).getPeso()){
                menor = grafo.getAristas().get(i);
            }
            i++;
        }
        solucionTemporal.add(menor);
        System.out.println("La menor raiz es " + menor);
        // Repetir hasta llegar al último nodo (Nodo activo final)
        
        // Guardar la suma de pesos del camino
        
        // Repetir todo lo anterior
        
        // Comparar suma de peso de iteración i-ésima con 
        // la iteración con menor peso
        
        // Quedarse con el camino de menor peso
        
        // Devolver camino de menor peso
    }
    
}
