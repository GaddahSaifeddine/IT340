/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.enseirb.glrt.buisness;

import fr.enseirb.glrt.dao.models.Crud;
import fr.enseirb.glrt.dao.models.Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import spark.Request;
import spark.Response;
import spark.ModelAndView;




/**
 *
 * @author USER
 */
public class Labviews {
    public ModelAndView getView(Request req,Response res){

    Map map=new HashMap();

    map.put("pageTitle","add a ");

    map.put("action", "add");

    map.put("submit", "add");

String name=req.params(":name");

map.put("name", name);

return new ModelAndView(map, "labo.html");

}

public ModelAndView createlabs (Request req, Response res){

    Lab Labtosave =new Lab();

    Map map=new HashMap();

     Labtosave.setName(req.queryParams("Name"));

     Labtosave.setEmail(req.queryParams("Email"));

     Labtosave.setPassword(req.queryParams("Password"));

     Labtosave.setLabid(UUID.fromString(req.queryParams("Labid")));

     Labtosave.setConnexiontime();







     

    //String description = req.queryParams("description");




    Crud crus = new Crud();

    crus.addLab(Labtosave);

    res.redirect("/account/");

    

    return new ModelAndView (map,"lab.html");
    
}
}
