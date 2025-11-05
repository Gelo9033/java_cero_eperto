public class App {
    public static void main(String[] args) throws Exception {
        Automovil miAuto = new Automovil("Toyota", "Corola", "Rojo", 1.8);

       
        System.out.println(miAuto.detallesDelAuto());
        System.out.println("Kimetro por litro: "+miAuto.calcularConsumo(130, 11.45f));
    }
}
