
//Lista de arreglos 
import java.util.ArrayList;

/*
 * Clase Producto Puede tener atributos como "nombre", "precio",
 * "descripcion", etc. Un método via ser mostrarDetalles para
 * mostrar la informacion del producto.
 */

class Producto {
    // Declaracion de variables
    public int sku;
    public String nombre;
    public double precio;
    public String descripcion;

    // Constructor
    public Producto(int sku, String nombre, double precio, String descripcion) {
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Mostrar detalles de productos
    public void mostrarDetalles() {
        System.out.println("sku: " + sku);
        System.out.println("nombre: " + nombre);
        System.out.println("descripcion: " + descripcion);
        System.out.println("precio: $" + precio);
    }

    // getPrecio traer precio
    public double getPrecio() {
        return precio;
    }
}

/*
 * Clase CarritoDeCompras: Podria contener una lista de productos y métodos como
 * agregarProducto, eliminarProducto y calcularTotal.
 */
class CarritoDeCompras {
    // Declaracion de variables
    private ArrayList<Producto> productos;

    // Constructor
    public CarritoDeCompras() {
        this.productos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar producto
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Calcular total
    public double calcularTotal() {
        // declaramos total
        double total = 0;
        // recorremos el arreglo
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        // devolvemos el total
        return total;
    }

}

/*
 * Clase Usuario: Con atributos como "nombre", "correoElectronico",
 * "direccion", "telefono", etc. Métodos como hacerCompra
 */

class Usuario {
    // Atributos
    private int cedula;
    private String nombre;
    private String correoElectronico;
    private String direccion;
    private int telefono;

    // Contructor
    public Usuario(int cedula, String nombre, String correoElectronico, String direccion, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Hacer compra
    public void hacerCompra(CarritoDeCompras carrito) {
        System.out.println("La compra ha sido realizada: " + nombre);
        double total = carrito.calcularTotal();
        System.out.println("Valor de la compra: $" + total);
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        // dos productos
        Producto producto = new Producto(1, "Carro", 20000, "Hot Wheels");
        Producto producto2 = new Producto(2, "Vaso", 30000, "Cristal");

        // Mostrar detalles
        producto.mostrarDetalles();
        producto2.mostrarDetalles();

        // Un carrito de compras
        CarritoDeCompras carrito = new CarritoDeCompras();

        // Agregar dos producto
        carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);

        // Colocamos un usuario
        Usuario usuario = new Usuario(1, "Juan", "juan@juan.com", "Cl 1 # 1-03", 431);

        // hacemos la compra
        usuario.hacerCompra(carrito);

    }

}