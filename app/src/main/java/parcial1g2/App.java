
package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int numeroDeVehiculos =0;
        String decada ="" ;
        int avaluo = 0;    
        int Impuestos = 0;

         System.out.println("cuantos vehiculos desea evaluar");
                numeroDeVehiculos = sc.nextInt() ;
             sc.nextLine();

            for (int i=1; i <= numeroDeVehiculos ; i ++){
                System.out.println("decada del vehiculo 90, 00, 10 o 20");
                decada= sc.nextLine();
                System.out.println("precio del avaluo");
                avaluo= sc.nextInt();
                sc.nextLine();

            Impuestos = calcularTotalImpuestos(decada,avaluo);

                System.out.println(avaluo+"COP\n"+decada+"\n"+Impuestos + "COP");

        }

    

        

    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------



    public static int calcularTotalImpuestos (String decada, int avaluo) {
try {
    double impuestorodamiento=0;
    double seguro = 0;
    int total= 0 ;
switch (decada) {
    case "90":
         impuestorodamiento= (avaluo * 0.4009);
         seguro = (avaluo *0.00816);
         total = (int)impuestorodamiento+(int) seguro;
        return total;
        
    case "00":
         impuestorodamiento = (avaluo * 0.0434);
         seguro = (avaluo *0.00798);
         total = (int)impuestorodamiento+(int) seguro;
        return total;
    case "10":
         impuestorodamiento = (avaluo * 0.0493);
         seguro = (avaluo *0.00712);
         total = ((int)impuestorodamiento+(int) seguro);
        return total;
    case"20":
         impuestorodamiento = (avaluo * 0.0568);
         seguro = (avaluo *0.00699);
         total = (int)impuestorodamiento+(int) seguro;
        return total;
        
    default:
     return-1;
      
}

    
} catch (Exception e) {
    return -1 ;
}


}
}
