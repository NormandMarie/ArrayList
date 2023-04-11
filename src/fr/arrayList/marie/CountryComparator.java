package fr.arrayList.marie;
import java.util.Comparator;



    public class CountryComparator implements Comparator<Country> {

        private boolean isAscendingOrder;

        public CountryComparator(boolean isAscendingOrder) {
            this.isAscendingOrder = isAscendingOrder;
        }

        @Override
        public int compare(Country c1, Country c2) {
            int result = c1.getName().compareTo(c2.getName());
            return isAscendingOrder ? result : -result;
        }
    }

