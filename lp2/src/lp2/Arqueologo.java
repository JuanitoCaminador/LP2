/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
class Arqueologo {
    //constantes
    static final int PLATAINICIAL = 12000;
    static final int TIEMPOINICIAL = 100;
    static final int PUNTOSINICIAL = 0;
    
    //variables
    private String nombre;
    private double plata;
    private double tiempo;
    private int puntos;
    private int civi;
    public ArrayList<Cubo> cubos;
    public ArrayList<MiembroEquipo> miembros;
    public ArrayList<Herramienta> herramientas;

    //Getters y setters
    public ArrayList<Cubo> getCubos() {
        return cubos;
    }

    public void setCubos(ArrayList<Cubo> cubos) {
        this.cubos = cubos;
    }

    public ArrayList<MiembroEquipo> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<MiembroEquipo> miembros) {
        this.miembros = miembros;
    }

    public ArrayList<Herramienta> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCivi() {
        return civi;
    }

    public void setCivi(int civi) {
        this.civi = civi;
    }

    Arqueologo(){
        cubos = new ArrayList<>();
        miembros = new ArrayList<>();
        herramientas = new ArrayList<>();
    }
    
    public void addMiembro(MiembroEquipo m){
        miembros.add(m);
    }
    
    public void addHerramienta(Herramienta h){
        herramientas.add(h);
    }
    
    public void addCubo(Cubo c){
        cubos.add(c);
    }
    
    public void inicializar(){
        plata = PLATAINICIAL;
        tiempo = TIEMPOINICIAL;
        puntos = PUNTOSINICIAL;
    }
    
    public int numObreros(){
        int num = 0;
        for (MiembroEquipo m : miembros){
            if (m instanceof Obrero){
                num++;
            }
        }
        return num;
    }
    
    public int numEg(){
        int num = 0;
        for (MiembroEquipo m : miembros){
            if (m instanceof EstudianteGenerales){
                num++;
            }
        }
        return num;    
    }
    
    public int numEf(){
        int num = 0;
        for (MiembroEquipo m : miembros){
            if (m instanceof EstudianteFacultad){
                num++;
            }
        }
        return num;        
    }
    
    public int numBadi(){
        int num = 0;
        for (Herramienta h : herramientas){
            if (h instanceof Badilejo){
                num++;
            }
        }
        return num;        
        
    }
    
    public int numBroc(){
        int num = 0;
        for (Herramienta h : herramientas){
            if (h instanceof Brocha){
                num++;
            }
        }
        return num;          
    }
}
