package com.example.alumno;


import java.util.Scanner;


public class alumno {// Se realiza la clase


    public static void main(String[] args){
        String Alumno; //Se crea el string con el nombre deseado en esta ocasion Alumno
        Scanner Nombre = new Scanner(System.in); //Se crea el integrador de datos
        System.out.print("Escribe tu nombre: "+ "\n"); // Se solicita el nombre del alumno
        Alumno = Nombre.nextLine(); //Se hace una separacion de linea para definir la solicitud y el nombre del alumno


        Scanner Calificacion = new Scanner(System.in);//Se vuelve a crear el integrador
        System.out.print("Escriba sus Cinco Calificaciones: " + "\n");//Se solicitan las calificaciones
        double[] array = new double[5];//Se crea el array especificando los rangos que tendra, se utiliza double ya que las calificaciones podrian llegar a tener decimales
        for(int i = 0; i<array.length; i++){
            array[i] = Calificacion.nextDouble();//Se agregan los datos al array
            if (array[i] >=10){//Si los datos  son entre 10 a 100 sigue corriendo el programa

            }else {
             System.out.print("El valor que agregaste no es el correcto tiene que ser un valor entre 10 a 100");
            return;
            }//Si los datos no son entre 10 a 100 se cierra el programa explicando el por que
        }

        System.out.print("Nombre del Estudiante: " + Alumno + "\n");
        System.out.print("Calificacion 1: "+ array[0]+ "\n");
        System.out.print("Calificacion 2: "+ array[1]+ "\n");
        System.out.print("Calificacion 3: "+ array[2]+ "\n");
        System.out.print("Calificacion 4: "+ array[3]+ "\n");
        System.out.print("Calificacion 5: "+ array[4]+ "\n");
       //Se imprime el nombre escrito y las calificaciones en sus respectivos lugares
        double promedio;

        promedio = (array[0] + array[1] + array[2] + array[3] + array[4])/5;
        int Prom = (int)promedio;
        System.out.print("Promedio: "+ Prom + "\n");//Se imprime el calculo de la suma y division de las calificaciones para saber el promedio total

        if (promedio <= 50 ){
            System.out.print("Calificacion: "+ "F");
        }
        else if (promedio >= 51 && promedio <= 61 ){
            System.out.print("Calificacion: "+ "E");
        }else if (promedio >= 61 && promedio <= 70 ){
            System.out.print("Calificacion: "+ "D");
        }else if (promedio >= 71 && promedio <= 80 ){
            System.out.print("Calificacion: "+ "C");
        }else if (promedio >= 81 && promedio <= 90 ){
            System.out.print("Calificacion: "+ "B");
        }else if (promedio >= 91 && promedio <= 100 ){
            System.out.print("Calificacion: "+ "A");
        }
//Se asigna la calificacion final respecto al promedio que se obtuvo realizando un simple if y else if especificando sus condiciones
       return;
    }

}
