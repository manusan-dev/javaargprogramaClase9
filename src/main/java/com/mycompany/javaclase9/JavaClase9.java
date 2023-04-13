package com.mycompany.javaclase9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaClase9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        boolean agregarpersona = true;
        while (agregarpersona) {
            System.out.println("¿Quieres agregar una persona? (si/no)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("si")) {
                Persona persona = new Persona();
                System.out.println("Ingrese el nombre de la persona:");
                persona.setNombre(scanner.next());
                System.out.println("Ingrese el apellido de la persona:");
                persona.setApellido(scanner.next());
                System.out.println("Ingrese la fecha de nacimiento de la persona (formato dd/mm/yyyy):");
                persona.setFechaNacimiento(scanner.next());
                personas.add(persona);
            } else {
                agregarpersona = false;
            }
        }

        System.out.println("Lista de personas:");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
