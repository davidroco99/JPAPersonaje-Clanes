
package com.programacion2.parcial2.logica;

public class DTOClan {
    private String idClan;
    private String nombreClan;
    private String rankingClanes;

    public DTOClan() {
    }

    public DTOClan(String idClan, String nombreClan, String rankingClanes) {
        this.idClan = idClan;
        this.nombreClan = nombreClan;
        this.rankingClanes = rankingClanes;
    }

    public String getIdClan() {
        return idClan;
    }

    public void setIdClan(String idClan) {
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
        return "DTOClan{" + "idClan=" + idClan + ", nombreClan=" + nombreClan + ", rankingClanes=" + rankingClanes + '}';
    }
    
    
}
