
package com.programacion2.parcial2.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Personaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPersonaje;
    @Basic
    private String nombre;
    private String armadura;
    private int puntosDeVida;
    private int poderDeAtaque;
    @ManyToOne
    private Clan clan;

    public Personaje() {
    }

    public Personaje(int idPersonaje, String nombre, String armadura, int puntosDeVida, int poderDeAtaque, Clan clan) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.armadura = armadura;
        this.puntosDeVida = puntosDeVida;
        this.poderDeAtaque = poderDeAtaque;
        this.clan = clan;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @Override
    public String toString() {
        return "Personaje{" + "idPersonaje=" + idPersonaje + ", nombre=" + nombre + ", armadura=" + armadura + ", puntosDeVida=" + puntosDeVida + ", poderDeAtaque=" + poderDeAtaque + ", clan=" + clan + '}';
    }
    
       
    
}
