
package com.programacion2.parcial2.logica;


public class DTOPersonaje {
    private String idPersonaje;
    private String nombre;
    private String armadura;
    private String puntosDeVida;
    private String poderDeAtaque;
    private String nombreClan;

    public DTOPersonaje() {
    }

    public DTOPersonaje(String idPersonaje, String nombre, String armadura, String puntosDeVida, String poderDeAtaque, String nombreClan) {
        this.idPersonaje = idPersonaje;
        this.nombre = nombre;
        this.armadura = armadura;
        this.puntosDeVida = puntosDeVida;
        this.poderDeAtaque = poderDeAtaque;
        this.nombreClan = nombreClan;
    }

    public String getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(String idPersonaje) {
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

    public String getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(String puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(String poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public String getNombreClan() {
        return nombreClan;
    }

    public void setNombreClan(String nombreClan) {
        this.nombreClan = nombreClan;
    }

    @Override
    public String toString() {
        return "DTOPersonaje{" + "idPersonaje=" + idPersonaje + ", nombre=" + nombre + ", armadura=" + armadura + ", puntosDeVida=" + puntosDeVida + ", poderDeAtaque=" + poderDeAtaque + ", nombreClan=" + nombreClan + '}';
    }
    
        
}
