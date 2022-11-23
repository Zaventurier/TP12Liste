package tp12list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();

        //Ajout à la liste
        liste.add("Java");
        liste.add("Javascript");
        liste.add("C#");
        liste.add("PHP");
        liste.add("Python");
        liste.add("Basic");
        liste.add("Cobol");
        liste.add("C");
        liste.add("C++");
        liste.add("Pascal");
        liste.add("Fortran");

        System.out.println(liste.size());
        System.out.println(liste.get(10));
        System.out.println(liste.get(0));
        liste.set(0, "Ada");
        System.out.println(liste.get(0));

        System.out.println(liste.toString());


        /*for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for (String unLanguage:liste) {
            System.out.println(unLanguage);
        }

        Collections.sort(liste);
        liste.toString();

        liste.remove("Cobol");*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un language :");
        String lang = sc.next();
        if(liste.contains(lang)){
            System.out.println("Le language " + lang + " est présent dans la liste !");
        }else{
            System.out.println("Le language " + lang + " est absent de la liste !");
        }

        System.out.println("Méthode indexOf");

        System.out.println("Saisissez un language :");
        String lang2 = sc.next();

        if(liste.indexOf(lang2) != -1){
            System.out.println("Le language " + lang2 + " est présent dans la liste !");
        }else{
            System.out.println("Le language " + lang2 + " est absent de la liste !");
        }

        //Boucle for

        System.out.println("Saisissez un language :");
        String lang3 = sc.next();
        boolean index;

        for(int i = 0; i<liste.size();i++){
            if(liste.get(i) == lang3){
                index = true;
            }
        }
        if(index = true){
            System.out.println("Le language est présent dans la liste !");
        }else if(index = false){
            System.out.println("Le language est absent de la liste !");
        }


    }
}
