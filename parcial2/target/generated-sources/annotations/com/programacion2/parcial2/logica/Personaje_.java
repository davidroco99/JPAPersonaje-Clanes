package com.programacion2.parcial2.logica;

import com.programacion2.parcial2.logica.Clan;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-24T17:17:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Personaje.class)
public class Personaje_ { 

    public static volatile SingularAttribute<Personaje, Integer> poderDeAtaque;
    public static volatile SingularAttribute<Personaje, Integer> idPersonaje;
    public static volatile SingularAttribute<Personaje, Clan> clan;
    public static volatile SingularAttribute<Personaje, String> armadura;
    public static volatile SingularAttribute<Personaje, String> nombre;
    public static volatile SingularAttribute<Personaje, Integer> puntosDeVida;

}