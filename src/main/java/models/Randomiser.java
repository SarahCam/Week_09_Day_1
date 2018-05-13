package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomiser {

    public static List<String> getNames(int amount) {
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

        if (amount > names.size() || amount < 0){
            return names;
           // return names.subList(0, names.size());
        }
        return names.subList(0,amount);
    }

}
