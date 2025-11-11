package org.lfgelo.factura;

import java.util.Scanner;

import org.lfgelo.factura.modelo.Cliente;
import org.lfgelo.factura.modelo.Factura;
import org.lfgelo.factura.modelo.ItemFactura;
import org.lfgelo.factura.modelo.Producto;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Cliente cliente= new Cliente("Luis Guaman", "Quito", "0987654321", "geelo@outlook.com");
        Factura factura= new Factura("Factura de compra", cliente);

        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        System.out.println();
        for (int i =0; i<2;i++){
            producto=new Producto();
            System.out.println("ingrese el nombre del producto:");
            nombre= scanner.nextLine();
            producto.setNombre(nombre);
            System.out.println("ingrese el precio del producto:");
            precio=scanner.nextDouble();
            producto.setPrecio(precio);
            System.out.println("ingrese la cantidad del producto:");
            cantidad=scanner.nextInt();
            scanner.nextLine();
            ItemFactura item= new ItemFactura(producto, cantidad);
            factura.addItemFactura(item);
            System.out.println();
        }
        System.out.println(factura.getDetalleFactura());
    }

}
