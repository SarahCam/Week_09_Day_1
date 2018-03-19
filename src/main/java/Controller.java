import models.Randomiser;
import spark.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {

        get("/one", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            String result = randomiser.get1Name();
            return result;
        });

        get("/two", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> result = randomiser.get2Names();
            return result;
        });

    }

}
