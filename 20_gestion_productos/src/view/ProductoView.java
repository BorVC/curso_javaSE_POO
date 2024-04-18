package view;

import curso.io.LectorTeclado;
import model.Producto;
import service.ProductoService;

public class ProductoView {

	static LectorTeclado lector = new LectorTeclado();
	static ProductoService servicio = new ProductoService();
	public static void main(String[] args) {
		int opcion = 0;
		do {
			presentarMenu();
			try {
				opcion = lector.readInt();
				switch (opcion) {
				case 1:
					nuevo();
				break;
				case 2:
					bajar();
				break;
				case 3:
					subir();
				break;
				case 4: 
					eliminarProducto();
				break;
				case 5: 
					todos();
				break;
				case 6:
					System.out.println("Hasta pronto!!!");
				break;
				default:
					System.out.println("La opción seleccionada es incorrecta");
				}
				
			}catch(NumberFormatException ex) {
				System.out.println("Debe ser un valor numérico!!");
			}
		}while(opcion != 6);

	}
	
	//Métodos
	static void presentarMenu() {
		String menu = """
				1- Nuevo producto
				2- Bajar precio
				3- Subir precio por categoría
				4- Eliminar producto por categoría
				5- Mostrar todos los productos
				""";
				System.out.println(menu);
	}
	
	
	static void nuevo() {
		System.out.println("Nombre");
		String nombre = lector.readString();
		System.out.println("Precio");
		int precio = lector.readInt();
		System.out.println("Categoría");
		String categoria = lector.readString();
		Producto producto = new Producto(nombre,precio,categoria);
		servicio.agregarProducto(producto);
	}
	
	static void bajar() {
		System.out.println("Introduce un porcentaje");
		int porcentaje = lector.readInt();
		servicio.bajarPrecio(porcentaje);
	}
	
	static void subir() {
		System.out.println("Introduce una categoría");
		String categoria = lector.readString();
		System.out.println("Introduce un porcentaje");
		int porcentaje = lector.readInt();
		servicio.subirPrecioCategoria(porcentaje, categoria);
	}
	
	static void eliminarProducto() {
		System.out.println("Introduce una categoría");
		String categoria = lector.readString();
		servicio.eliminarPorCategoria(categoria);
	}
	
	static void todos() {
		servicio.obtenerProductos();
	}

}
