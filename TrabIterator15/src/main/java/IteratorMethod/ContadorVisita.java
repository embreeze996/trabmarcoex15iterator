package IteratorMethod;

import java.util.Iterator;

public class ContadorVisita {

    public static Integer contarSeguidoresPerfil(PerfilInstagram perfilInstagram) {
        int quantidade = 0;
        for (Seguidor seguidor : perfilInstagram) {
            if (seguidor.isSeguindo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalSeguidor(PerfilInstagram perfilInstagram) {
        int quantidade = 0;
        for (Iterator a = perfilInstagram.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}