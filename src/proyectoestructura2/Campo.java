/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructura2;

/**
 *
 * @author emily
 */
public class Campo {

    String nombre;
    int longitud;
    String tipodedato;
    boolean llaveprimaria;
    boolean llavesecundaria;

    public Campo(String nombre, int longitud, String tipodedato, boolean llaveprimaria, boolean llavesecundaria) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.tipodedato = tipodedato;
        this.llaveprimaria = llaveprimaria;
        this.llavesecundaria = llavesecundaria;
    }

    public Campo(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getTipodedato() {
        return tipodedato;
    }

    public void setTipodedato(String tipodedato) {
        this.tipodedato = tipodedato;
    }

    public boolean isLlaveprimaria() {
        return llaveprimaria;
    }

    public void setLlaveprimaria(boolean llaveprimaria) {
        this.llaveprimaria = llaveprimaria;
    }

    public boolean isLlavesecundaria() {
        return llavesecundaria;
    }

    public void setLlavesecundaria(boolean llavesecundaria) {
        this.llavesecundaria = llavesecundaria;
    }

    @Override
    public String toString() {

        if (llaveprimaria) {
            return nombre + " - " + longitud + " - " + tipodedato + " - Es llave";
        } else if (llavesecundaria) {
            return nombre + " - " + longitud + " - " + tipodedato + " - LLave secundaria";
        } else {
            return nombre + " - " + longitud + " - " + tipodedato + " - No es llave";
        }

    }

}
