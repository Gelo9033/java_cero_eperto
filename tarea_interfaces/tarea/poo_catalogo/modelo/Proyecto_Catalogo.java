package tarea_interfaces.tarea.poo_catalogo.modelo;

public class Proyecto_Catalogo {
    public static void main(String[] args) {
         IProducto[] productos = new IProducto[4];
        productos[0] = new Tvlcd("Huawei",1_000_000,  55);
        productos[1] = new Libro(5_000,"Camilo","Dune", "Nose");
        productos[2] = new Comics(80_000,  "Pepe", "Nose", "Bla", "Superman");
        productos[3] = new Iphone("apple", "xs","blanco",30000);

        imprimirProducto(productos);
    }

    static void imprimirProducto(IProducto[] productos){
        System.out.println();
        for(IProducto producto : productos){
            if(producto == null) continue;

            System.out.println("***************************");

            switch (producto){
                case Iphone iPhone -> System.out.println(iPhone);
                case Comics comic -> System.out.println(comic);
                case Libro libro -> System.out.println(libro);
                case Tvlcd tvLcd -> System.out.println(tvLcd);
                default -> System.out.println("not a class");
            }
        }
    }
}