/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.enseirb.glrt.dao.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.UUID;


/**
 *
 * @author USER
 */
public class Crud {
    Connection con;
    
    public Crud(){
  this.con=Connexion.getconnexion();
    }
    public List<Workshops> getateliersfromlabo (UUID labid ){
        ResultSet rs; 
       try { 
             String getAteliers = "SELECT * FROM ATELIER WHERE ID_LABORATOIRE = ?"; 
 
 
            PreparedStatement preparedStatement = con.prepareStatement(getAteliers); 
             preparedStatement.setObject(1,labid ); 
 
 
             rs = preparedStatement.executeQuery(); 
             
             List<Workshops> returnvalue = new ArrayList<>();
             Workshops w =new Workshops();
             while (rs.next()) {
                 w.setWid(UUID.fromString(rs.getString("ID")));
                 w.setLabid(UUID.fromString(rs.getString("LABID")));
                 w.setTitle(rs.getString("TITLE"));
                 w.setTheme(rs.getString("THEME"));
                 returnvalue.add(w);                 
                 
             }
             return returnvalue;
             
         } catch (SQLException e) { 
             System.out.println(e.getMessage()); 
             return null;
         }
    }
    public List<Workshops> getatelier (UUID wid){
         ResultSet rs; 
       try { 
             String getAtelier = "SELECT * FROM ATELIER WHERE ID = ?"; 
 
 
            PreparedStatement preparedStatement = con.prepareStatement(getAtelier); 
             preparedStatement.setObject(1,wid); 
              rs = preparedStatement.executeQuery(); 
             
             List<Workshops> returnvalueun = new ArrayList<>();
             Workshops w =new Workshops();
             while (rs.next()) {
                 w.setWid(UUID.fromString(rs.getString("ID")));
                 w.setLabid(UUID.fromString(rs.getString("LABID")));
                 w.setTitle(rs.getString("TITLE"));
                 w.setTheme(rs.getString("THEME"));
                 returnvalueun.add(w);                 
                 
             }
             return returnvalueun;
             
         } catch (SQLException e) { 
             System.out.println(e.getMessage()); 
             return null;
         }
 
        
    }
     public List<Workshops> getateliers (){
         ResultSet rs; 
       try { 
             String getAtelierss = "SELECT * FROM ATELIER = "; 
 
 
            PreparedStatement preparedStatement = con.prepareStatement(getAtelierss); 
            // preparedStatement.setObject(1,wid); 
              rs = preparedStatement.executeQuery(); 
             
             List<Workshops> returnvaluedeux = new ArrayList<>();
             Workshops w =new Workshops();
             while (rs.next()) {
                 w.setWid(UUID.fromString(rs.getString("ID")));
                 w.setLabid(UUID.fromString(rs.getString("LABID")));
                 w.setTitle(rs.getString("TITLE"));
                 w.setTheme(rs.getString("THEME"));
                 returnvaluedeux.add(w);                 
                 
             }
             return returnvaluedeux;
             
         } catch (SQLException e) { 
             System.out.println(e.getMessage()); 
             return null;
         }
     }
     public void addatelier (Workshops atelier ){
         
       
       try { 
             String addAtelier = "INSERT INTO Atelier (wid,theme,title,date,labid,place,description,animateur,hours,capacity,resa )"+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)"; 
 
 
            PreparedStatement preparedStatement = con.prepareStatement(addAtelier); 
             preparedStatement.setObject(1,atelier.getWid().toString()); 
             preparedStatement.setObject(2,atelier.getTheme()); 
             preparedStatement.setObject(3,atelier.getTitle()); 
             preparedStatement.setObject(4,atelier.getDate());
             preparedStatement.setObject(5,atelier.getLabid().toString());
             preparedStatement.setObject(6,atelier.getPlace());
             preparedStatement.setObject(7,atelier.getDescription());
             preparedStatement.setObject(8,atelier.getAnimateur());
             preparedStatement.setObject(9,atelier.getHours());
             preparedStatement.setObject(10,atelier.getCapacity());
             preparedStatement.setObject(11,atelier.getResa()); 
              preparedStatement.execute(); 
                       
         } catch (SQLException e) { 
             System.out.println(e.getMessage()); 
            
         }
     }
     public List<Lab> getLab (){

      

ResultSet rs; 

       try { 

             String getLab = "SELECT * FROM LABORATOIRE = "; 

 

 

            PreparedStatement preparedStatement = con.prepareStatement(getLab); 

            // preparedStatement.setObject(1,wid); 

              rs = preparedStatement.executeQuery(); 

             

             List<Lab> returnvaluetrois = new ArrayList<>();

             Lab l =new Lab();

             while (rs.next()) {

                 l.setLabid((UUID.fromString(rs.getString("ID"))));

                 l.setName((rs.getString("LabName")));

                 l.setEmail(rs.getString("Email"));

                 l.setPassword(rs.getString("Password"));

                 l.setConnexiontime();

                 returnvaluetrois.add(l);                 

                 

             }

             return returnvaluetrois;

             

       } catch (SQLException e){

             System.out.println(e.getMessage()); 

             return null;

         }

}

public void addLab (Lab Labo ){

        

      

      try { 

            String addLab = "INSERT INTO Labo (name,email,,password,connexiontime,labid)"+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)"; 

 

 

            PreparedStatement preparedStatement = con.prepareStatement(addLab); 

            preparedStatement.setObject(1,Labo.getName().toString()); 

            preparedStatement.setObject(2,Labo.getEmail()); 

            preparedStatement.setObject(3,Labo.getPassword()); 

            preparedStatement.setObject(4,Labo.getConnexiontime());

            preparedStatement.setObject(5,Labo.getLabid()); 

             preparedStatement.execute(); 

                      

        } catch (SQLException e) { 

            System.out.println(e.getMessage()); 

           

        }

}

}
    
    

                
