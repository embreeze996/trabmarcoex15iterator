package IteratorMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PerfilInstagram implements Iterable<Seguidor>{

    private List<Seguidor> seguidores = new ArrayList<Seguidor>();

    public  PerfilInstagram(Seguidor... seguidores) {
        this.seguidores = Arrays.asList(seguidores);
    }

    @Override
    public Iterator<Seguidor> iterator() {
        return seguidores.iterator();
    }

}
