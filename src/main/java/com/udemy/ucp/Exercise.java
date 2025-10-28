package com.udemy.ucp;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String detalleFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto: ");
        double precioUno = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        double precioDos = scanner.nextDouble();
        double subtotal = precioUno + precioDos;
        double impuesto = 0.19 * subtotal;
        double total = subtotal + impuesto;
        System.out.println("Detalle de la factura: " + detalleFactura +
                           " Subtotal: " + subtotal +
                           " Impuesto (19%): " + impuesto +
                           " Total a pagar: " + total);
    }
}
