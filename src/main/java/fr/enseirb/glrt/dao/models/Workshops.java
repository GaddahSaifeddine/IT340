/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.enseirb.glrt.dao.models;

import java.sql.Date;
import java.util.UUID;

/**
 *
 * @author USER
 */
public class Workshops {
     
    private String title;
    private String theme;
    private String animateur;
    private String description;
    private UUID labid;
    private Date date;
    private UUID wid;
    private String place;
    private int hours;
    private int capacity;
    private Boolean resa;
    
public String getDescription(){
return description;
}
public int getHours(){
return hours;
}
public int getCapacity(){
return capacity;
}
public String getAnimateur(){
return animateur;
}
public Boolean getResa(){
return resa;
}
public String getPlace(){
return place;
}
public String getTitle(){
return title;
}
public String getTheme(){
return theme;
}

public Date getDate(){
return date;
}
public UUID getWid(){
    return wid;
}
public UUID getLabid(){
    return labid;
}
public void setDescription(String description){
    this.description=description;
}
public void setPlace(String place){
    this.place=place;
}
public void setAnimateur(String animateur){
    this.animateur=animateur;
}
public void setTitle(String title){
    this.title=title;
}
public void setDate(){
    java.util.Date now =new java.util.Date();
    this.date=new Date(now.getTime());
}
public void setTheme(String theme){
    this.theme= theme;
}
public void setWid(UUID wid){
    this.wid= wid;
}
public void setHours(int hours){
    this.hours=hours;
}
public void setCapacity(int capacity){
    this.capacity=capacity;
}
public void setLabid(UUID labid ){
    this.labid=labid;
}
public void setResa(Boolean resa ){
    this.resa=resa;
}

    
    
    
}
