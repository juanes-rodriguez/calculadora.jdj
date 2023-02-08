
package calculadora.jdj;

import java.io.IOException;
import java.util.Scanner;



public class CalculadoraJdj {

    public static void main(String[] args) throws IOException {
        
        Operations objeto1 = new Operations();
        Scanner objeto2 = new Scanner (System.in); 
        int operations, basics, trigonometry;
        int num, power;
        float num1, num2;
        float valor, iva; 
        double num3;

        System.out.println("\t\tBIENVENIDOS AL PROGRAMA DE\n\n\t\tJuan Esteban Betancourt\n\t\tDavid Andrés "
                + "Rodríguez Buitrago\n\t\tJuan Esteban Rodríguez Romero\n\n");
        
        do {
            System.out.println("¿Qué operacion desea realizar?");
            System.out.println("\t1. Operaciones básicas\n\t2. Funciones trigonométricas\n\t3. Raíz enésima\n\t"
                    + "4. Potencia enésima\n\t5. Porcentaje de iva\n\t0. Terminar programa");
            operations = objeto2.nextInt();
     
            switch (operations){
                case 1:
                    System.out.println("\t1. suma\n\t2. resta\n\t3. multiplicación"
                            + "\n\t4. División\n\n");
                    basics = objeto2.nextInt();
                    
                    switch (basics){
                        
                        case 1:
                            System.out.println("Ingrese los números:");
                            num1 = objeto2.nextFloat();
                            num2 = objeto2.nextFloat();
                            System.out.println("El resultado de la suma es: " +objeto1.sum(num1, num2)+ "\n\n");
                            break;

                        case 2:
                            System.out.println("Ingrese los números:");
                            num1 = objeto2.nextFloat();
                            num2 = objeto2.nextFloat();
                            System.out.println("El resultado de la resta es: " +objeto1.rest(num1, num2)+ "\n\n");

                            break;
                        case 3:
                            System.out.println("Ingrese los números:");
                            num1 = objeto2.nextFloat();
                            num2 = objeto2.nextFloat();
                            System.out.println("El resultado de la multiplicaión es: " +objeto1.product(num1, num2)+ "\n\n");
                            break;
                        case 4: 
                            System.out.println("Ingrese los números:");
                            num1 = objeto2.nextFloat();
                            num2 = objeto2.nextFloat();
                            System.out.println("El resultado de la división es: " +objeto1.divided (num1, num2)+ "\n\n");
                            break; 
                        default:
                            System.out.println("\n\n\t\tEl valor ingresado es incorrecto\n\n");
                    }
                    break;
                case 2: 
                    System.out.println("\t1. seno\n\t2. coseno\n\t3. tangente");
                    trigonometry = objeto2.nextInt();
                    
                    System.out.println("Ingrese el ángulo");
                    num3 = objeto2.nextDouble();
                    
                    switch (trigonometry){
                         case 1: 
                             System.out.println("El seno del angúlo " + num3 + " es: " + objeto1.sin(num3));
                             break; 
                         case 2: 
                             System.out.println("El coseno del angúlo " + num3 + " es: " + objeto1.cos(num3));
                             break;
                         case 3: 
                             System.out.println("La tangente del angúlo " + num3 + " es: " + objeto1.tan(num3));
                             break;    
                     }
                    break; 
                case 3: 
                    System.out.println("Ingrese la raíz que quiere hallar: ");
                    power = objeto2.nextInt();
                    System.out.println("Ingrese el número al cual desea aplicar la raíz:");
                    num = objeto2.nextInt();
                    System.out.println("El valor de la raíz " + power + " de " + num + " es: " + 
                            objeto1.root(num , power) + "\n\n");
                    break;
                case 4: 
                    System.out.println("Ingrese la potencia que desea hallar: ");
                    power = objeto2.nextInt();
                    System.out.println("Ingrese el número al cual desea aplicar la potencia:");
                    num = objeto2.nextInt();
                    System.out.println("El valor de la potencia " + power + " de " + num + " es: " + 
                            objeto1.power(num , power) + "\n\n");
                    break;
                case 5: 
                    System.out.println("Ingrese el valor incial: ");
                    valor = objeto2.nextFloat();
                    System.out.println("Ingrese el iva que quiere hallar: ");
                    iva = objeto2.nextFloat();
                    
                    System.out.println("El valor del " + iva + "% de iva, para " + valor + " es: " 
                            + objeto1.iva(valor, iva));
                    break;
                default: 
                   if (operations > 5 || operations < 0) {
                        System.out.println("\tEl número ingresado es incorrecto, intente nuevamente.\n\n");
                    }
            }
        } while (operations != 0);
    }
    
}
