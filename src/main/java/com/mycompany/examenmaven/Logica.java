
package com.mycompany.examenmaven;

import static com.mycompany.examenmaven.Main.*;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author ablancoabalde
 */
public class Logica {
    
    Document doc ;
    String title;
    String temp;
    String estado;
    
    public void Conectarse() {
        
        try{
             doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
             title= doc.title();
             
             
             Etiqueta.setText(title);
             
        }catch(Exception e){
            
        }
        
    }
    
    
}
