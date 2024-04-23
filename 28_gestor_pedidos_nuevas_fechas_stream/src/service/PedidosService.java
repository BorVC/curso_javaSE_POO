package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	/*public Pedido pedidoMasReciente() {
		/*Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if(p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;
		
		return pedidos.stream()
				.max(Comparator.comparing(p -> p.fechaPedido))
				.orElse(null);
	}*/
	
	//devuelve el pedido más reciente,pero si hubiera más de uno que cumpla 
	//la misma condición misma fecha, devuelve el q tiene mas unidades
	public Optional<Pedido> pedidoMasReciente() {
		
		return pedidos.stream()//Stream<Pedido>
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
				.thenComparingInt(p -> p.getUnidades()))
				//.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))//En caso de q salga null
				
				;
				
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		
		return pedidos.stream()
				.filter(p -> p.getFechaPedido().compareTo(f1)>=0 && p.getFechaPedido().compareTo(f2)<=0)
				.collect(Collectors.toList());
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		
		return pedidos.stream()
				.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
				.orElse(null);
		
	}
	
	//devuleve le lista de pedidos del producto recibido como parametro
	public List<Pedido> pedidosPorProducto(String producto){
		return pedidos.stream()
		.filter(p -> p.getProducto().equalsIgnoreCase(producto))
		.collect(Collectors.toList());
	}
	
	//devuelve el pedido con menor número de unidades.Si hay mas de uno el primero q encuentre
	public Optional<Pedido> pedidoMenorUnidades(){//Optional si en caso de q mo haya devuelva  mensaje en vez de null
		return  pedidos.stream()
				.min(Comparator.comparingInt(p -> p.getUnidades()));
	}
	
	//devuelve una cadena con el nombre de todos los produtos sin duplicar,separados por un guión
	public String nombresProductos() {
		return pedidos.stream()
				.map(p -> p.getProducto())//Stream <String>
				.distinct()//Stream <String>
				.collect(Collectors.joining("-"));
	}
}
