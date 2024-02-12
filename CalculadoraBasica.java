/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package proyectospractica;

/**
 *
 * @author Santiago Flores
 */

import java.util.Scanner;

public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        char operador;
        int num1,num2,result;
        
        System.out.println("Elige un operador: +,-,x o /");
        operador = scanner.next().charAt(0);
        
        System.out.println("Ingresa el preimer numero: ");
        num1= scanner.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        num2= scanner.nextInt();
        
        switch(operador){
            case '+':
                result = num1+num2;
                System.out.println("La suma de "+ num1 +"+"+num2+"="+ result);
             break;
            case '-':
                result = num1-num2;
                System.out.println("La resta de "+ num1 +"-"+num2+"="+ result);
             break;
            case 'x':
                result = num1*num2;
                System.out.println("La multiplicacion de "+ num1 +"x"+num2+"="+ result);
             break;
            case '/':
                result = num1/num2;
                System.out.println("La division de "+ num1 +"/"+num2+"="+ result);
             break;
        }
    }
}
