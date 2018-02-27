package aco_practica2;

public class Arista {
    
    private int nivelActual;
    private int nodoInicial;
    private int nodoSiguiente;
    private int peso;

    public Arista(int nivelActual, int nodoInicial, int nodoSiguiente, int peso) {
        this.nivelActual = nivelActual;
        this.nodoInicial = nodoInicial;
        this.nodoSiguiente = nodoSiguiente;
        this.peso = peso;
    }

    public int getNodoInicial() {
        return nodoInicial;
    }

    public int getNodoSiguiente() {
        return nodoSiguiente;
    }

    public int getPeso() {
        return peso;
    }

    public void setNodoInicial(int nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void setNodoSiguiente(int nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    public String toString(){
        String temp = "";
        temp += "Nodo(" + nivelActual + " , " + nodoInicial  + ") --- " + peso 
                + " --> Nodo(" + (nivelActual+1) + " , " + nodoSiguiente + ")";
        return temp;
    }
}
