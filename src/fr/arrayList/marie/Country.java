package fr.arrayList.marie;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class Country {
        String name;

        public Country(String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void display(List<Country> countries){
      System.out.println("La collection créée contient "+ countries.size() +" pays ! ");
      for (Country country  :countries){
          System.out.println(country.name);
      };
  }
  public static void reset(List<Country> countries){
      countries.clear();
      System.out.println("\nListe vide\n");
  }

  public static void change (List<Country> countries,String oldname, String newname){
      for (Country country :countries){
          if (country.getName().equals(oldname)) {
              country.setName(newname);
          }
      }
  };
        public static void supression(List<Country> countries,int num){
            for (int i = 0; i < countries.size(); i++) {
                Country varcountry = countries.get(i);
                if (varcountry.getName().length() > num) {
                    countries.remove(i);
                    i--;
                }
            }
        }
        public static void retiré (List<Country> countries,int num){
            Iterator<Country> iterator = countries.iterator();
            while (iterator.hasNext()) {
                Country country = iterator.next();
                if (country.getName().length() > num) {
                    iterator.remove();
                }
            }



    }

}
