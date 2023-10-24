package com.programacion2.parcial2.persitencia;

import com.programacion2.parcial2.logica.Clan;
import com.programacion2.parcial2.persitencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    private static ControladoraPersistencia instance = null;
     ClanJpaController clanJPA = new ClanJpaController();
     
    public ControladoraPersistencia() {
    }
    public static ControladoraPersistencia getInstance() {
        if (instance == null) {
            instance = new ControladoraPersistencia();
        }
        return instance;
    }

    public void guardarClan(Clan clan) {
        clanJPA.create(clan);
    }

    public List<Clan> buscarClanes() {
        List<Clan> listaClan = clanJPA.findClanEntities();
        return listaClan;
    }

    public void borrarClan(int idClan) {
        try {
            clanJPA.destroy(idClan);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Clan buscarClan(int idClan) {
        return clanJPA.findClan(idClan);
    }

    public void editar(Clan clan) {
        try {
            clanJPA.edit(clan);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
