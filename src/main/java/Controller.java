import models.Randomiser;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/one", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            return new ModelAndView(model, "names.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(2);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            return new ModelAndView(model, "names.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            return new ModelAndView(model, "names.vtl");
        }, velocityTemplateEngine);

        get("/four", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(4);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            return new ModelAndView(model, "names.vtl");
        }, velocityTemplateEngine);

        get("/twenty", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(20);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            return new ModelAndView(model, "names.vtl");
        }, velocityTemplateEngine);

    }

}
