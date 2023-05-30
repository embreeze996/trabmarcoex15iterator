package IteratorMethodTest;

import IteratorMethod.ContadorVisita;
import IteratorMethod.PerfilInstagram;
import IteratorMethod.Seguidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContadorVisitaTest {

    @Test
    void deveContarAlunosAtivosCurso() {
       PerfilInstagram perfilInstagram = new PerfilInstagram(
                new Seguidor("Lucas", true),
                new Seguidor("Gabi", true),
                new Seguidor("Bernardo", false),
                new Seguidor("João", true)
        );
        assertEquals(3, ContadorVisita.contarSeguidoresPerfil(perfilInstagram));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        PerfilInstagram perfilInstagram = new PerfilInstagram(
                new Seguidor("Lucas", true),
                new Seguidor("Gabi", true),
                new Seguidor("Bernardo", false),
                new Seguidor("João", true)
        );
        assertEquals(4, ContadorVisita.contarTotalSeguidor(perfilInstagram));
    }

}