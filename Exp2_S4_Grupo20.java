/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s4_grupo20;

/**
 *
 * @author k-9_o
 */
import java .util.Scanner;
public class Exp2_S4_Grupo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        int condicion= 1;
        String opcion, zona, asiento;
        int precioReal, precioDescuento, edad, descuento;
        System.out.println("Bienvenido a Teatro Moro");
        System.out.println("****************************************");
        for(int i = 0; i<condicion; i++){
            System.out.println("Menú Principal");
            System.out.println("");
            System.out.println("(1) Comprar Entrada");
            System.out.println("(2) Salir");
            System.out.println("");
            System.out.println("Ingrese su opcion:");
            opcion = scanner.nextLine();
            while (!opcion.equals("1") && !opcion.equals("2")){
                System.out.println("****************************************");
                System.out.println("Ingrese una opción válida.");
                System.out.println("");
                System.out.println("(1) Comprar Entrada");
                System.out.println("(2) Salir");
                System.out.println("");
                System.out.println("Ingrese su opcion:");
                opcion = scanner.nextLine();
            }
            if(opcion.equals("1")){
                System.out.println("****************************************");
                System.out.println("Distribución Zonas Teatro Moro");
                System.out.println("-------|------A------|-------");
                System.out.println("|-------------B--------------|");
                System.out.println("-------|------C------|-------");
                System.out.println("Zona A: $10.000");
                System.out.println("Zona B: $7.000");
                System.out.println("Zona C: $5.000");
                System.out.println("Ingrese la zona: ");
                zona = scanner.nextLine().toLowerCase();
                while (!zona.equals("a") && !zona.equals("b") && !zona.equals("c")){
                    System.out.println("Ingrese una zona válida");
                    System.out.println("****************************************");
                    System.out.println("Distribución Zonas Teatro Moro");
                    System.out.println("-------|------A------|-------");
                    System.out.println("|-------------B--------------|");
                    System.out.println("-------|------C------|-------");
                    System.out.println("Zona A: $10.000");
                    System.out.println("Zona B: $7.000");
                    System.out.println("Zona C: $5.000");
                    System.out.println("Ingrese la zona: ");
                    zona = scanner.nextLine().toLowerCase();
                    System.out.println("****************************************");
                }
                System.out.println("Ingrese la edad del cliente: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Ingrese una edad valida númerica");
                    scanner.nextLine();
                }
                edad = scanner.nextInt();
                System.out.println("****************************************");
                if (zona.equals("a")){
                    precioReal = 10000;
                    System.out.println("Asientos disponibles: 5");
                    asiento = scanner.nextLine();
                    while(!asiento.equals("5")){
                        System.out.println("Ingrese un asiento disponible");
                        System.out.println("Asientos disponibles: 5");
                        asiento = scanner.nextLine();
                    }
                    if(edad <= 18){
                        precioDescuento = (precioReal/100)*90;
                        descuento = 10;
                    }else if( edad >= 65 ){
                        precioDescuento = (precioReal/100)*85;
                        descuento = 15;
                    }else{
                        descuento = 0;
                        precioDescuento = precioReal;
                    }
                }else if(zona.equals("b")){
                    precioReal = 7000;
                    System.out.println("Asientos disponibles: 20 y 18");
                    asiento = scanner.nextLine();
                    while(!asiento.equals("20") && !asiento.equals("18")){
                        System.out.println("Ingrese un asiento disponible");
                        System.out.println("Asientos disponibles: 20 y 18");
                        asiento = scanner.nextLine();
                    }
                    if(edad <= 18){
                        precioDescuento = (precioReal/100)*90;
                        descuento = 10;
                    }else if( edad >= 65 ){
                        precioDescuento = (precioReal/100)*85;
                        descuento = 15;
                    }else{
                        descuento = 0;
                        precioDescuento = precioReal;
                    }
                    
                }else{
                    precioReal = 5000;
                    System.out.println("Asientos disponibles: 50, 51 y 52 ");
                    asiento = scanner.nextLine();
                    while(!asiento.equals("50") && !asiento.equals("51") && !asiento.equals("52")){
                        System.out.println("Ingrese un asiento disponible");
                        System.out.println("Asientos disponibles: 50, 51 y 52");
                        asiento = scanner.nextLine();
                    }
                    if(edad <= 18){
                        precioDescuento = (precioReal/100)*90;
                        descuento = 10;
                    }else if( edad >= 65 ){
                        precioDescuento = (precioReal/100)*85;
                        descuento = 15;
                    }else{
                        descuento = 0;
                        precioDescuento = precioReal;
                    }
                }
   
                
                
                condicion++;
                System.out.println("****************************************");
                System.out.println("Zona Elegida: "+ zona);
                System.out.println("Precio base: "+ precioReal);
                System.out.println("Descuento aplicado: "+ descuento);
                System.out.println("Precio total: "+ precioDescuento);
                System.out.println("Gracias por su compra");
                System.out.println("****************************************");
            }
            System.out.println("****************************************");
            System.out.println("Gracias por usar el sistema de Teatro Moro.");

        }
    }
    
}
