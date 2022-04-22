package probavizsgakonzolos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Festmeny {

    private Path eleresiUt;

    public Festmeny(String eleresiUt) throws IOException {
        this.eleresiUt = Paths.get(eleresiUt);
        if(!(eleresiUt.isEmpty())){
            megjelenit();
        }else{
            System.out.println("Nem lehet megjeleníteni");
        }
    }
    
    public void megjelenit(){
        System.out.println("Megjelenítés folyamatban");
    }

}
