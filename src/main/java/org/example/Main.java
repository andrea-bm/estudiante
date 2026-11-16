package org.example;

import com.github.lalyos.jfiglet.FigletFont;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main (String[] args) {
            Estudiante est= new Estudiante();
            est.setNombre("andrea");
            est.setEdad(18);
            System.out.println(est);

            String estudianteAscii = FigletFont.convertOneLine(est.toString());
            System.out.println(estudianteAscii);
        }

}
