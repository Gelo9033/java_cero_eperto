package Java_Cero.DetalleFactura;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        String detalleFactura;
        double precioUno, precioDos;
        System.out.println("Ingrese la descripcion de la factura: ");
        Scanner scanner = new Scanner(System.in);
        detalleFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto: ");
        precioUno = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        precioDos = scanner.nextDouble();
        double subtotal = precioUno + precioDos;
        double impuesto = (0.19*(precioUno + precioDos))  ;
        double total = subtotal + impuesto;
        System.out.println("Detalle de la factura: " + detalleFactura+
                           
                           " Subtotal: " + subtotal +
                           " Impuesto (19%): " + impuesto +
                           " Total a pagar: " + total);



    }

}
