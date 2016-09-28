
package copybytestexto;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Julián
 */
public class Copybytestexto {

    public static void main(String[] args) throws IOException {

        //Archivos y rutas
        File doc1 = new File("/home/oracle/Documents/texto1.txt");
        File doc2 = new File("/home/oracle/Documents/texto2.txt");

        doc2.createNewFile();

        FileInputStream entrada = new FileInputStream(doc1);
        FileOutputStream salida = new FileOutputStream(doc2);

        int Ent = 0;

        while ((Ent = entrada.read()) != -1) {
            salida.write(Ent);

        }

        entrada.close();
        salida.close();

    }

}
