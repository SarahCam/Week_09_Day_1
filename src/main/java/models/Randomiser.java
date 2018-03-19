package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomiser {

    public static String get1Name() {
        ArrayList<String> names = new ArrayList<String>();

        names.add ("Maisie");
        names.add ("Emily");
        names.add ("Archer");
        names.add ("James");
        names.add ("Jane");
        names.add ("Jamie");
        names.add ("Popeye");
        names.add ("Millie");
        names.add ("Robbie");

        Collections.shuffle(names);

        return names.get(0);
    }

    public static List<String> get2Names() {
        ArrayList<String> names = new ArrayList<String>();

        names.add ("Maisie");
        names.add ("Emily");
        names.add ("Archer");
        names.add ("James");
        names.add ("Jane");
        names.add ("Jamie");
        names.add ("Popeye");
        names.add ("Millie");
        names.add ("Robbie");

        Collections.shuffle(names);

        return names.subList(0,1);
    }

}
