/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.Image;
import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
/**
 *
 * @author Elektro
 */
public class Cliente implements Serializable{
    private String nombre;
    private String fechainscripcion;
    private int membresia;
    private String entrenador;
    private boolean profesional;
    private genero genero;
    private Icon foto;

    
    
    public Cliente(String n, String fi, int mem, boolean pro, genero g, Icon f){
        this(n,fi,mem,null,pro,g,f);
        if(entrenador==null||entrenador==""){
            entrenador="--No tiene entrenador--";
        }


    }
    public Cliente(String n, String fi, int mem, String e, boolean pro, genero g, Icon f){
        nombre=n;
        fechainscripcion=fi;
        membresia=mem;
        entrenador=e;
        profesional=pro;
        genero=g;
        foto=f;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public String getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(String fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public boolean isProfesional() {
        return profesional;
    }

    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public genero getGenero() {
        return genero;
    }

    public void setGenero(genero genero) {
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fechainscripcion;
    }

    public int getMembresia() {
        return membresia;
    }

    public String getEntrenador() {
        return entrenador;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
