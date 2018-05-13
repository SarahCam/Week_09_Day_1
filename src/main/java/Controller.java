import models.Randomiser;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("public");

        get("/names/:number", (req, res) -> {
            int amount = Integer.parseInt(req.params(":number"));
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(amount);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "names.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/one", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> names = randomiser.getNames(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "names.vtl");
            return new ModelAndView(model, "layout.vtl");
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

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });
    }

}
