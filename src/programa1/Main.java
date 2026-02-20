

package programa1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        
//       Declaracíon y uso de variables
   

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Es estudiante? (true/false): ");
        boolean estudiante = sc.nextBoolean();

        System.out.println("/nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estudiante: " + estudiante);

        //Operaciones matemáticas
        System.out.println("\nOperaciones Matemáticas");

        System.out.print("Número 1: ");
        int num1 = sc.nextInt();

        System.out.print("Número 2: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2!= 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        //Operaciones lógicas
        System.out.println("\n Operaciones Lógicas");

        System.out.print("Número A: ");
        int a = sc.nextInt();

        System.out.print("Número B: ");
        int b = sc.nextInt();

        System.out.println("A > B: " + (a > b));
        System.out.println("A < B: " + (a < b));
        System.out.println("A == B: " + (a == b));

        System.out.println("(A > 0 && B > 0): " + (a > 0 && b > 0));
        System.out.println("(A > 0 || B > 0): " + (a > 0 || b > 0));

        // Clasificación de edad
        System.out.println("\nClasificación de Edad");

        System.out.print("Ingrese edad: ");
        int edadPersona = sc.nextInt();

        if (edadPersona < 12) {
            System.out.println("Niño");
        } else if (edadPersona <= 17) {
            System.out.println("Adolescente");
        } else if (edadPersona <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        // Día de la semana
        System.out.println("\n Día de la Semana");

        System.out.print("Número (1-7): ");
        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miércoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número incorrecto");
        }

        // Verificación de acceso
        System.out.println("\n Verificación de Acceso");

        sc.nextLine(); 

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String clave = sc.nextLine();

        if (usuario.equals("gigi") && clave.equals("1234")) {
            System.out.println("Acceso concedido");
        } else if (usuario.equals("gigi")) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario no registrado");
        }
        System.out.println("Gracias por usar este programagra");

        sc.close();
    }
}