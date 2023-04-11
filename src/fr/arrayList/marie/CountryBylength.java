package fr.arrayList.marie;
import java.util.Comparator;
public class CountryBylength implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        return c1.getName().length() - c2.getName().length();
    }
}