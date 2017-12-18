/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcostreport;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JTextArea;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Burcu
 */
public class jsonSave {
     List<jsonModel> veriler;
   
       
    jsonSave(List<jsonModel> veriler, List<String> sonuc) throws JSONException {
        //throw new UnsupportedOperationException("Not supported yet.");
       
            JSONObject kok = new JSONObject();
            JSONArray list = new JSONArray();
            int i = 0;
            for(jsonModel veri : veriler){
                JSONObject obj = new JSONObject();
                obj.put("Proje Grupları", veri.getP_gruplari());
                obj.put("Proje Süresi", veri.getP_suresi());
                obj.put("Proje Devamlılığı", veri.getP_devamlilik());
                obj.put("Proje Platformu", veri.getP_platform());
                obj.put("Sonuc", sonuc.get(i));
                i++;
                System.out.println(obj);
                list.put(obj);
            }
            kok.put("Veriler", list);
            System.out.println(list);
            System.out.println(kok);
            try (FileWriter file = new FileWriter("C:\\Users\\Burcu\\Desktop\\test.json")) {
                file.write(kok.toString());
                file.flush();

            } catch (IOException e) {
            }
            
      
        
    }
 //To change body of generated methods, choose Tools | Templates.

    jsonSave(JTextArea sonuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
