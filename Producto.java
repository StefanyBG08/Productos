public class Producto {

    // Atributos
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    // Metodo para calcular valor del inventario
    public double calcularValorInventario() {
        return precio * stock;
    }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }

    // Metodo para verificar disponibilidad
    public void hayDisponibilidad() {
        if (stock > 0) {
            System.out.println("Hay disponibilidad");
        } else {
            System.out.println("No hay disponibilidad");
        }
    }
}
