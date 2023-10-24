
package com.programacion2.parcial2.logica;

import com.programacion2.parcial2.persitencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class ControladoraLogica {
    private static ControladoraLogica instance = null;
        
    public ControladoraLogica() {
    }
    public static ControladoraLogica getInstance() {
        if (instance == null) {
            instance = new ControladoraLogica();
        }
        return instance;
    }

    public void agregarClan(DTOClan dtoClan) {
        Clan clan = new Clan();
        clan.setNombreClan(dtoClan.getNombreClan());
        clan.setRankingClanes(dtoClan.getRankingClanes());
       // System.out.println(dtoClan);
       // System.out.println(clan.toString());
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarClan(clan);
    }

    public List<DTOClan> traerClanes() {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        List <Clan> listaClanes = persistencia.buscarClanes();
        ArrayList <DTOClan> listaDTOClanes = new ArrayList<>();
        int index = 0;
        for (Clan clan: listaClanes){
            DTOClan dtoClan = new DTOClan();
            String idClan = String.valueOf(clan.getIdClan());
            dtoClan.setIdClan(idClan);
            String nombreClan = clan.getNombreClan();
            dtoClan.setNombreClan(nombreClan);
            String rankingClanes = clan.getRankingClanes();
            dtoClan.setRankingClanes(rankingClanes);
            
            listaDTOClanes.add(index, dtoClan);
            index += 1;
        }
        return listaDTOClanes;                    
    }

    public void borrarClan(int idClan) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarClan(idClan);
    }

    public void editarClan(DTOClan dtoClan) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        Clan clan = new Clan();
        
        clan.setIdClan(Integer.parseInt(dtoClan.getIdClan()));
        clan.setNombreClan(dtoClan.getNombreClan());
        clan.setRankingClanes(dtoClan.getRankingClanes());
        persistencia.editar(clan);
        
    }

    public DTOClan buscarClan(int idClan) {
         ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
         Clan clan = new Clan();
         DTOClan dtoClan = new DTOClan();
         
         clan = persistencia.buscarClan(idClan);
                  
         dtoClan.setIdClan(String.valueOf(clan.getIdClan()));
         dtoClan.setNombreClan(clan.getNombreClan());
         dtoClan.setRankingClanes(clan.getRankingClanes());
         
         return dtoClan;
    }
}
