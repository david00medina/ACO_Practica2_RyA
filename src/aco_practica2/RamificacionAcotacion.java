package aco_practica2;

import java.util.ArrayList;

public class RamificacionAcotacion {
    private Grafo grafo;
    private ArrayList<Arista> nodosVivos;
    private ArrayList<Arista> nodosVisitados;
    private int costeGlobal;

    public RamificacionAcotacion(Grafo gr) {
        grafo = gr;
        nodosVivos = new ArrayList<>();
        nodosVisitados = new ArrayList<>();
    }
    
    public ArrayList<Arista> execRyA() {
        ArrayList<Arista> pathParcial = new ArrayList<>(); // No sé si lo usaré
        ArrayList<Arista> path = new ArrayList<>();
        int costeParcial = 0, nivelActual = 0;
        int nodoActual = 1;
        costeGlobal = Integer.MAX_VALUE;
        nodosVivos = expansion(nivelActual, nodoActual);
        while(nodosVivos.size() > 0) {
            Arista menor = seleccion(nodosVivos, nivelActual, nodoActual);
            
            nodosVivos.remove(menor);
            nodosVisitados.add(menor);
            pathParcial.add(menor);
            
            nivelActual++;
            nodoActual = menor.getNodoSiguiente();
            
            nodosVivos.addAll(expansion(nivelActual, nodoActual));
            
            if(nivelActual == grafo.getNivelFinal()) {
                costeParcial = sumaCostes(pathParcial);
                if(costeParcial < costeGlobal) {
                    costeGlobal = costeParcial;
                    path = (ArrayList)pathParcial.clone();
                    for (Arista arista : path) {
                        System.out.println(arista);
                    }
                    System.out.println(costeGlobal);
                }
            }
            try{
            System.in.read();
            }catch(Exception e){};
        }
        
        return pathParcial;
    }
    
    private ArrayList<Arista> expansion (int nivel, int nodoPadre){
        ArrayList<Arista> expansion = new ArrayList<>();

        for (Arista arista : grafo.getAristas()) {
            if(nivel == arista.getNivelActual() 
                    && nodoPadre == arista.getNodoInicial()) {
                expansion.add(arista);
            }
        }
        return expansion;
    }

    private Arista seleccion(ArrayList<Arista> nodosVivos, int nivelActual, int nodoActual) {
        Arista menor = new Arista(0,0,0,Integer.MAX_VALUE);
        for (Arista nodo : nodosVivos) {
            if(nivelActual == nodo.getNivelActual() 
                && nodoActual == nodo.getNodoInicial()
                && menor.getPeso() > nodo.getPeso()) {
                menor = nodo;
            }
        }
        return menor;
    }
    
    private int sumaCostes(ArrayList<Arista> path){
        int temp = 0;
        for (Arista it : path) {
                temp += it.getPeso();
            }
            
        return temp;
    }
}
