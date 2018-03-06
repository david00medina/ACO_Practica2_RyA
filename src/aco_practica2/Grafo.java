package aco_practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grafo {

    private int nNodos;
    private ArrayList<Arista> aristas;
    private int nivelInicio;
    private int nivelFinal;

    public Grafo(Path path) {
        aristas = new ArrayList<>();
        try {
            BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"));
            String line;
            line = br.readLine();
            nNodos = Integer.parseInt(line);
            line = br.readLine();
            nivelInicio = Integer.parseInt(line);
            line = br.readLine();
            nivelFinal = Integer.parseInt(line);
            
            while ((line = br.readLine()) != null) {
                String param[] = line.split(" ");/*0 1 1 1*/
                int nivelActual = Integer.parseInt(param[0]);
                int nodoInicial = Integer.parseInt(param[1]);
                int nodoFinal = Integer.parseInt(param[2]);
                int peso = Integer.parseInt(param[3]);
                aristas.add(new Arista(nivelActual, nodoInicial, nodoFinal, peso));
            }
        } catch (IOException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarGrafo();
    }

    public Grafo(int nNodos) {
        this.nNodos  = nNodos;
        aristas = new ArrayList<>();
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void mostrarGrafo() {
        System.out.println("MOSTRAR GRAFO");
        System.out.println("Nivel inicio: " + nivelInicio + " \nNivel final: " + nivelFinal);
        for (Arista arista : aristas) {
            System.out.println(arista.toString());
            
        }
        System.out.println("\n");
    }

    public int getnNodos() {
        return nNodos;
    }
    
    
    public int getNivelInicio() {
        return nivelInicio;
    }

    public int getNivelFinal() {
        return nivelFinal;
    }
    
    public void setAristas(int nivel, int a, int b, int peso) {
        aristas.add(new Arista(nivel, a, b, peso));
    }
}
