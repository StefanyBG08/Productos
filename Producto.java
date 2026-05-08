public class Producto {

    // Atributos
    String nombre;
    double precio;
    int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    // Método para calcular valor del inventario
    public double calcularValorInventario() {
        return precio * stock;
    }

    // Método para aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }

    // Método para verificar disponibilidad
    public void hayDisponibilidad() {
        if (stock > 0) {
            System.out.println("Hay disponibilidad");
        } else {
            System.out.println("No hay disponibilidad");
        }
    }
}