package fr.map.marie;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Map carnetDeContacts = new HashMap<String, User>();
        User Thibault = new User("Thibault", User.Region.FRANCE);
        User Arthur  = new User("Arthur", User.Region.SUISSE);
        User Boris = new User("Boris", User.Region.INDONESIE);
        User Estelle = new User("Estelle", User.Region.MARTINIQUE);
        carnetDeContacts.put("605000005", Thibault);
        carnetDeContacts.put("607070606", Arthur);
        carnetDeContacts.put("849999907", Boris);
        carnetDeContacts.put("700000700", Estelle);


        display1((HashMap<String, User>) carnetDeContacts);

        carnetDeContacts.remove("849999907");
        carnetDeContacts.put("799999907",Boris);


        display1((HashMap<String, User>) carnetDeContacts);
        display((HashMap<String, User>) carnetDeContacts,"Arthur");
    }


    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (map.get(entry).equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void display( HashMap<String, User>  carnetDeContacts,String recherché) {
        for (String key : carnetDeContacts.keySet()) {
            User user = carnetDeContacts.get(key);
            if (user.getName().equals(recherché)) {
                String numeroFormat = String.format("(0)%s.%s.%s.%s.%s",
                        key.substring(0, 2),
                        key.substring(2, 4),
                        key.substring(4, 6),
                        key.substring(6, 8),
                        key.substring(7)
                );
                System.out.println("Nom : " + user.getName() + " => Téléphone: " + user.getIndicatif() +  numeroFormat);

            }
            System.out.println(" \n");
        }
    }
    public static void display1( HashMap<String, User>  carnetDeContacts){
        for(String key :carnetDeContacts.keySet()) {
            User user = carnetDeContacts.get(key);
            if (user != null) {
                String numeroFormat = String.format("(0)%s.%s.%s.%s.%s",
                        key.substring(0, 2),
                        key.substring(2, 4),
                        key.substring(4, 6),
                        key.substring(6, 8),
                        key.substring(7)
                );
                System.out.println("Nom : " + user.getName() + " => Téléphone: " + user.getIndicatif() +  numeroFormat);

            }
        }
        System.out.println(" \n");
    }

}