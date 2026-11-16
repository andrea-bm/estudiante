package org.example;

import com.google.gson.Gson;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main (String[] args) {
            Estudiante est= new Estudiante();
            est.setNombre("Andrea");
            est.setEdad(18);
            System.out.println(est);

            String json = new Gson().toJson(est);
        }

}
