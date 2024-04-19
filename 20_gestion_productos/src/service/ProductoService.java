package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService extends Producto {

	List <Producto> productos = new ArrayList<Producto>();
	//Métodos
	//Agregar productos
	public void agregarProducto(Producto producto ) {
		productos.add(producto);
	}
	
	//Bajar precio
	public void bajarPrecio( int porcentaje) {
		productos.forEach(pro -> pro.setPrecio(getPrecio() * (100+porcentaje)/100));
	}
	
	//Subir precios por categoría
	public void subirPrecioCategoria(int porcentaje, String categoria) {
		productos.replaceAll(p->{
			if(categoria.equals(p.getCategoria())) {
				p.setPrecio(p.getPrecio()*((100+porcentaje)/100));				
			}
			return p;
		});
	}
	
	//Eliminar por categoría
	public void eliminarPorCategoria(String categoria) {
		productos.removeIf(producto -> producto.getCategoria().equals(categoria));
	}
	
	//Obtener productos
	public void obtenerProductos(){
		productos.forEach(producto -> System.out.println("Nobre: " + producto.getNombre() +
		                                                 "Precio: " + producto.getPrecio() +
		                                                 "Categoría: " + producto.getCategoria() +
		                                                 "-------------------------------------"));
	}
	
	public void ordenarPorPrecio() {
		//Double.compare xq precio es de tipo primitivo
		productos.sort((a,b) -> Double.compare(a.getPrecio(), b.getPrecio()));
	}
	
	
}
