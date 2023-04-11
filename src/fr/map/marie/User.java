package fr.map.marie;
import java.lang.Enum;

public class User {
    String nom;
    Region région;
    public enum Region {
        FRANCE("+33"),
        SUISSE("+41"),
        POLYNESIE("+689"),
        MARTINIQUE("+596"),
        INDONESIE("+62");

        private  String indicatif;

        private Region(String indicatif) {
            this.indicatif = indicatif;
        }

        public String getIndicatif() {
            return indicatif;
        }
    }

    public User(String nom, Region region) {
        this.nom = nom;
        this.région = region;
    }

    public String getName() {
        return nom;
    }

    public Region getRegion() {
        return région;
    }

    public String getIndicatif() {
        return région.getIndicatif();
    }

}
