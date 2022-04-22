package probavizsgakonzolos;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

abstract public class KiallitasiTargy {

    private Date[] letrahozasi_datum;
    private String kesztio;
    private String cim;
    private Festmeny festmeny;


    public KiallitasiTargy(Date[] letrahozasi_datum, String kesztio, String cim) {
        this.letrahozasi_datum = letrahozasi_datum;
        this.kesztio = kesztio;
        this.cim = cim;
    }

    public KiallitasiTargy(String kesztio, String cim) {
        this.kesztio = kesztio;
        this.cim = cim;
        maiNap();
    }

    public KiallitasiTargy(Date[] letrahozasi_datum, String kesztio, String cim, Festmeny festmeny) {
        this.letrahozasi_datum = letrahozasi_datum;
        this.kesztio = kesztio;
        this.cim = cim;
        this.festmeny = festmeny;
    }

    public KiallitasiTargy(String kesztio, String cim, Festmeny festmeny) {
        this.kesztio = kesztio;
        this.cim = cim;
        this.festmeny = festmeny;
        maiNap();
    }
    
    

    public void maiNap() {
        SimpleDateFormat dnt = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        System.out.println("Mai napi dátum: " + dnt.format(date));
    }

    public Date[] getLetrahozasi_datum() {
        return letrahozasi_datum;
    }

    public String getCim() {
        return cim;
    }
    
}


class Cimszerint implements Comparator<KiallitasiTargy>{

    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
        Collator col = Collator.getInstance();
        return col.compare(o1.getCim(), o2.getCim());
    }

}