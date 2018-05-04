package com.mycompany.examenmaven;

import static com.mycompany.examenmaven.Logica.title;
import static com.mycompany.examenmaven.Main.*;

/**
 *
 * @author ablancoabalde
 */
public class Grafica {

    /**
     * Metodo para que muestre los datos obtenidos en pantalla
     */
    public static void verDatos() {
        Etiqueta.setText("Hoy está "+Logica.devolverEstado().text()+" y hace "+Logica.devolverTemp().text()+" grados. "+title);
        eti_Temp.setText(Logica.devolverTemp().text());
        eti_Estado.setText(Logica.devolverEstado().text());

    }

}
