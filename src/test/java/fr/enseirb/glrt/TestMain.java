package fr.enseirb.glrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.enseirb.glrt.buisness.Workshopsviews;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TestMain {
    
    
    
    @Test
    public void testaddateliers() {
        
        new Main();
        
    
           
            URL google = new URL ("http://localhost:4567/account/1000/create");
            try{
            URLConnection yc = google.openConnection();
            yc.
            
            
            //StringBuffer bf = new StringBuffer();
           /* BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                bf.append(inputLine + "\n");
            }
            in.close();*/
            assertEquals("Hello World\n", bf.toString());
        } catch (Exception e) {
            fail();
        }

    }
    
}
