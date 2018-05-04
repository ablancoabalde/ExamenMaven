package com.mycompany.examenmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author ablancoabalde
 */
public class Logica {

    static Document doc;
    static String title;
    static Element temp;
    static Element estado;

    /**
     * Metodo que permite conectarse a un pagina web.
     */
    public static void Conectarse() {

        try {
            doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();

        } catch (IOException e) {

            System.out.println("La página no existe, o no tienes conexión a internet.");

        }

    }

    /**
     * Metodo que va a recoger los datos que queramos y los va a almacenar en
     * una variables para luego utilizarlos.
     */
    public static void recogerDatos() {
        try {
            title=doc.title();
            temp=doc.select("div.today_nowcard-temp").first();
            estado=doc.select("div.today_nowcard-phrase").first();
        } catch (Exception e) {
            System.out.println("No conecta");
        }

    }

    /**
     * Metodo para poder tomar la temperatura desde la clase grafica
     *
     * @return temp
     */
    public static Element devolverTemp() {

        return temp;

    }

    /**
     * Metodo para poder tomar el estado del tiempo desde la clase grafica
     *
     * @return estado
     */
    public static Element devolverEstado() {

        return estado;

    }

}
