package fr.arrayList.marie;

import fr.arrayList.marie.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static fr.arrayList.marie.Country.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<Country>();

        countries.add(new Country("France"));
        countries.add(new Country("Espagne"));
        countries.add(new Country("Italie"));


        display(countries);
        reset(countries);

        display(countries);

        countries.add(new Country("Barbade"));
        countries.add(new Country("Canada"));
        countries.add(new Country("Danemark"));

        display(countries);

        Country.change(countries,"Barbade","Corée du sud");
        Country.display(countries);
        Collections.sort(countries, new CountryComparator(true));
        display(countries);
        Collections.sort(countries, new CountryBylength());
        display(countries);
        countries.add(new Country("Japon"));
        countries.add(new Country("Chine"));
        display(countries);
        Country.retiré(countries,5);
       //Country.supression(countries,5);

        display(countries);
        }


}

