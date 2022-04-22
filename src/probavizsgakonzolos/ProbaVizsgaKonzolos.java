package probavizsgakonzolos;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProbaVizsgaKonzolos {

    public static void main(String[] args) throws IOException {
        
        Galeria galeria = new Galeria(new KiallitasiTargy("Van Gogh", "Első kép") {});
        System.out.println(galeria);
        //Galeria galeria2 = new Galeria(new KiallitasiTargy(mai dátum, "Göthe", "Valami másik kép") {});
        //System.out.println(galeria2);
        //Galeria galeria3 = new Galeria(new KiallitasiTargy(hibás dátum, "Poolch", "Másik kép") {});
        //System.out.println(galeria3);
        Galeria galeria4 = new Galeria(new KiallitasiTargy("Leonardo", "Képek", new Festmeny("elérési_út1")) {});
        System.out.println(galeria4);
        //Galeria galeria5 = new Galeria(new KiallitasiTargy("Munkácsi", "Csak kép", , new Festmeny("elérési_út2"), mai dátum) {});
        //System.out.println(galeria5);
        
    }

}
