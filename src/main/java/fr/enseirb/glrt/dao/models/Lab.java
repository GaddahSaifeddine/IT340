/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.enseirb.glrt.dao.models;

import java.sql.Date;
import java.util.*;


/**
 *
 * @author USER
 */
public class Lab {
    public String name;
    private String email;
    private String password;
    private Date connexiontime;
    private UUID labid;
public String getName(){
return name;
}
public String getEmail(){
return email;
}
public String getPassword(){
return password;
}

public Date getConnexiontime(){
return connexiontime;
}
public UUID getLabid(){
    return labid;
}
public void setName(String name){
    this.name=name;
}
public void setEmail(String email){
    this.email=email;
}
public void setConnexiontime(){
    java.util.Date now =new java.util.Date();
    this.connexiontime=new Date(now.getTime());
}
public void setPassword(String password){
    this.password= password;
}
public void setLabid(UUID labid){
    this.labid= labid;
}



}