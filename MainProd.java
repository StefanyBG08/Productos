public class MainProd {
    public static void main(String[] args) {

        //Crear productos
        Producto producto1 = new Producto("Vinilos", 1500, 10);
        Producto producto2 = new Producto("Disco", 300, 0);

        //Mostrar informacion antes del descuento
        System.out.println("=== PRODUCTO 1 ===");
        producto1.mostrarInfo();

        //Aplicar descuento
        producto1.aplicarDescuento(15);

        //Mostrar despues del descuento
        System.out.println("Despues del descuento:");
        producto1.mostrarInfo();

        //Mostrar valor inventario
        System.out.println("Valor inventario: $" + producto1.calcularValorInventario());

        //Verificar disponibilidad
        producto1.hayDisponibilidad();

        System.out.println("---------------------");

        //Producto 2
        System.out.println("=== PRODUCTO 2 ===");
        producto2.mostrarInfo();

        producto2.hayDisponibilidad();
    }
}
