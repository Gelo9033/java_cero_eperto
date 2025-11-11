package org.lfgelo.factura.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int numFactura;
    private Cliente cliente;
    private Date fecha;
    private ItemFactura[] items;
    private String detalleFactura;
    private int indiceItems;
    public static final int MAX_ITEMS=4;
    public static int ultimoNumFactura;

    public Factura( String detalleFactura, Cliente cliente){
        this.detalleFactura= detalleFactura;
        this.cliente= cliente;
        this.items= new ItemFactura[MAX_ITEMS];
        this.numFactura= ++ultimoNumFactura;
        this.fecha= new Date();
    }

    public int getNumFactura() {
        return numFactura;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {   
        this.cliente = cliente;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        this.items[indiceItems++]=item;
    }

    public double calcularTotal(){
        double total=0.0;
        for (int i = 0; i < indiceItems; i++) {
            if(items==null) break;
            total += items[i].calcularSubtotal();
        }
        return total;
    }
    public String getDetalleFactura() {
       StringBuilder sb= new StringBuilder();
       SimpleDateFormat df= new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
       sb.append("\n Factura # ").append(numFactura)
         .append("\n").append(detalleFactura)
         .append("\n Cliente: ").append(this.cliente.getNombre())
         .append("\n Direccion: ").append(this.cliente.getDireccion())
         .append("\n Telefono: ").append(this.cliente.getTelefono())
         .append("\n Email: ").append(this.cliente.getEmail())
         .append("\n Fecha Factura: ").append(df.format(this.fecha)).append("\n")
         .append("\n")
         .append("\n#\tNombre\t$\tCant\tTotal\n");
        
       
        for (int i = 0; i < indiceItems; i++) {
            if(items==null) break;
            sb.append(items[i].getProducto().getCodigo()).append("\t")
                .append(items[i].getProducto().getNombre()).append("\t")
                .append(items[i].getProducto().getPrecio()).append("\t")
                .append(items[i].getCantidad()).append("\t")
                .append(items[i].calcularSubtotal()).append("\n");
        }
        sb.append("Total Factura: ").append(this.calcularTotal()).append("\n");

         return sb.toString();

    }

}
