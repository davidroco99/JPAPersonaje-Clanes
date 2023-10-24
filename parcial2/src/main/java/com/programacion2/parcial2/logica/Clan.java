
package com.programacion2.parcial2.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idClan;
    @Basic
    private String nombreClan;
    private String rankingClanes;

    public Clan() {
    }

    public Clan(int idClan, String nombreClan, String rankingClanes) {
        this.idClan = idClan;
        this.nombreClan = nombreClan;
        this.rankingClanes = rankingClanes;
    }

    public int getIdClan() {
        return idClan;
    }

    public void setIdClan(int idClan) {
        this.idClan = idClan;
    }

    public String getNombreClan() {
        return nombreClan;
    }

    public void setNombreClan(String nombreClan) {
        this.nombreClan = nombreClan;
    }

    public String getRankingClanes() {
        return rankingClanes;
    }

    public void setRankingClanes(String rankingClanes) {
        this.rankingClanes = rankingClanes;
    }

    @Override
    public String toString() {
        return "Clan{" + "idClan=" + idClan + ", nombreClan=" + nombreClan + ", rankingClanes=" + rankingClanes + '}';
    }
    
    
}
