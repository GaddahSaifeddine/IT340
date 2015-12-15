
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.enseirb.glrt.buisness;

import fr.enseirb.glrt.dao.models.Crud;
import fr.enseirb.glrt.dao.models.Workshops;

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
public class Workshopsviews {

   
public ModelAndView getView(Request req,Response res){
    Map map=new HashMap();
    map.put("pageTitle","add a workshop");
    map.put("action", "add");
    map.put("submit", "add");
String labid=req.params(":labid");
map.put("labid", labid);
return new ModelAndView(map, "ateliers.html");
}
public ModelAndView createWorkshops (Request req, Response res){
    Workshops workshoptosave =new Workshops();
    Map map=new HashMap();
    String labid = req.params(":labid");
    //Date date =req.queryParamsValues("date");
    //String theme = req.queryParams("theme");
     workshoptosave.setTitle(req.queryParams("title"));
     workshoptosave.setTheme(req.queryParams("theme"));
     workshoptosave.setDescription(req.queryParams("description"));
     workshoptosave.setAnimateur(req.queryParams("Animateur"));
     workshoptosave.setDate();
     workshoptosave.setHours((Integer.parseInt(req.queryParams("Hours"))));
     workshoptosave.setCapacity(Integer.parseInt((req.queryParams("Capacity"))));
     workshoptosave.setWid(UUID.fromString(req.queryParams("wid")));
     workshoptosave.setResa(Boolean.parseBoolean(req.queryParams("Reservation")));
     
    //String description = req.queryParams("description");
    //UUID wid = req.queryParams("wid");
    //String place =req.queryParams("place");
    map.put("formAction", "/account/"+labid+"create");
    Crud crus = new Crud();
    workshoptosave.setDate();
    crus.addatelier(workshoptosave);
    res.redirect("/account/");
    
    return new ModelAndView (map,"workshop.html");
    
}
}
