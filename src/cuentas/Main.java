package cuentas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Introduce una cantidad");
    	float cantidad = scanner.nextFloat();
        
        operativa_cuenta(cantidad);
        
        scanner.close();
    
    }
    
    public static void operativa_cuenta(float cantidad) {
    	
    	CCuenta cuenta1;
        double saldoActual;
        
    	cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}