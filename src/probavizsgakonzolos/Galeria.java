package probavizsgakonzolos;

import java.util.Iterator;

public class Galeria implements Iterable<Galeria> {

    public KiallitasiTargy kiallitasiTargy;

    public Galeria(KiallitasiTargy kiallitasiTargy) {
        if (true) {
            try {
                throw new JovobeliDatumKivetelIO("Ez a festmény még nem készült el");
            } catch (Exception e) {
                System.err.println("Valami baj van");
            }
        } else {
            this.kiallitasiTargy = kiallitasiTargy;
        }
    }

    @Override
    public Iterator<Galeria> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
