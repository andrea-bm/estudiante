package org.example;

<<<<<<< HEAD
import com.google.gson.Gson;
=======
import com.github.lalyos.jfiglet.FigletFont;

>>>>>>> jfiglet
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main (String[] args) {
            Estudiante est= new Estudiante();
            est.setNombre("Andrea");
            est.setEdad(18);
            System.out.println(est);

<<<<<<< HEAD
            String json = new Gson().toJson(est);
=======
            String estudianteAscii = FigletFont.convertOneLine(est.toString());
            System.out.println(estudianteAscii);
>>>>>>> jfiglet
        }

}
