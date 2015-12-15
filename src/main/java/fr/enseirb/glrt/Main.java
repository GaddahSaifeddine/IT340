/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.enseirb.glrt;

import fr.enseirb.glrt.buisness.Workshopsviews;
import static spark.Spark.*;
import spark.template.mustache.MustacheTemplateEngine;


/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        MustacheTemplateEngine mustacheTemplateEngine = new MustacheTemplateEngine();
        post("/account/:labid/create",(req,res) -> new Workshopsviews().createWorkshops(req, res),mustacheTemplateEngine);
        get("/account/:labid/create",(req,res)  -> new Workshopsviews().getView(req,res),mustacheTemplateEngine);
        awaitInitialization();
    }

    
}
