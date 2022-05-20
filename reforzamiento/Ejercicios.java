package reforzamiento;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {
    public static void mostrarcursoDia() {
        //Definir variable
        int diaSem;
        String mensaje;

        //Leer datos 
        Scanner leerT=new Scanner(System.in);
        System.out.println("ingrese un dia de la semana:\n1=Dom"+"\n2=Lun\n3=Mar\n4=Mie\n5=Juev\n6=Vie\n7=Sab");
        diaSem=leerT.nextInt();
        //Proceso
        if (diaSem==1) {
            mensaje="No hay clases";
        }else if (diaSem==2){
            mensaje="Matematica";
        }else if (diaSem==3){
            mensaje="Fundamentos de programación";
        }else if(diaSem==4){
            mensaje="Capacidades comunicativas";
        }else if(diaSem==5){
            mensaje="Formacion cristiana";
        }else if(diaSem==6){
            mensaje="Introducción a la ingeniería";
        }else if(diaSem==7){
            mensaje="No hay clases";
        }else {
            mensaje="El dia que coloco no existe";
        }
        //datos de salida
        if (diaSem==1 || diaSem==7) {
            System.out.println("Es fin de semana: " +mensaje);

        } else {
            System.out.println("Ese día toca el curso de: " +mensaje);
             
        }
        

    }

    public static void main(String[] args) {
        
        mostrarcursoDia();
    }
}