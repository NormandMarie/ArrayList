package fr.Set.marie;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>(Arrays.asList("Rouge", "Cyan", "Bleu", "Vert"));
        System.out.println(colors);
        colors.remove("Rouge");
        System.out.println(colors);
        Set<String> other = new HashSet<>(Arrays.asList("jaune", "magenta"));
        colors.addAll(other);
        System.out.println(colors);
        System.out.println(colors.contains("Vert"));
        if (colors.contains("Vert")){
            colors.remove("Vert");
            System.out.println(colors);
        }
        System.out.println(colors.contains("Vert"));
        colors.removeAll(other);
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }

}
