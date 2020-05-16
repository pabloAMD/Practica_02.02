import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Factura;
import modelo.Libro;
import modelo.LibroDigital;
import modelo.LibroImpreso;
import modelo.RegistroCompra;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******Practica 02.02 ******");
		System.out.println("LIBROS AGREGADOS");
		
		LibroDigital libroDigital= new LibroDigital();
		libroDigital.setId(1);
		libroDigital.setAutor("Juan Marquez");
		libroDigital.setEdicion("6ta edicion");
		libroDigital.setTitulo("Patrones de dise�o");
		libroDigital.setPrecio(25);

		LibroImpreso libroImpreso= new LibroImpreso();
		libroImpreso.setId(1);
		libroImpreso.setAutor("Maria Sornoza");
		libroImpreso.setEdicion("4ta edicion");
		libroImpreso.setTitulo("Evolucion tecnologica");
		libroImpreso.setPrecio(29);
		
		LibroDigital libroDigital1= new LibroDigital();
		libroDigital1.setId(2);
		libroDigital1.setAutor("Marcia Nieto");
		libroDigital1.setEdicion("2da edicion");
		libroDigital1.setTitulo("Algebra");
		libroDigital1.setPrecio(18);
		
		LibroDigital libroDigital2= new LibroDigital();
		libroDigital2.setId(3);
		libroDigital2.setAutor("Karla Loja");
		libroDigital2.setEdicion("5ta edicion");
		libroDigital2.setTitulo("Matematas");
		libroDigital2.setPrecio(15);
		
		LibroImpreso libroImpreso1= new LibroImpreso();
		libroImpreso1.setId(2);
		libroImpreso1.setAutor("Marco Infante");
		libroImpreso1.setEdicion("4ta edicion");
		libroImpreso1.setTitulo("Fisica");
		libroImpreso1.setPrecio(20);
		
		LibroImpreso libroImpreso2 = new LibroImpreso();
		libroImpreso2.setId(3);
		libroImpreso2.setAutor("Jose Vidal");
		libroImpreso2.setEdicion("3ra edicion");
		libroImpreso2.setTitulo("Literatura");
		libroImpreso2.setPrecio(31);
		
		System.out.println(libroImpreso.toString());
		System.out.println(libroImpreso1.toString());
		System.out.println(libroImpreso2.toString());
		System.out.println(libroDigital.toString());
		System.out.println(libroDigital1.toString());
		System.out.println(libroDigital2.toString());
		
		System.out.println("CLIENTES AGREGADOS");
		
		Cliente c = new Cliente("Pablo","Malla","01028388109","0987865123", 1030.00);
		Cliente c1 = new Cliente("Christian","Rivera","01028388323","0987865321", 500.80);
		Cliente c2 = new Cliente("Marcelo","Durasno","0105236978","0990058963", 2000.00);
		Cliente c3 = new Cliente("Henrry","Guaman","0104785239","0989874285", 700.00);
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println("CREAR COMPRA");
		
		Factura f= new Factura();
		f.setId_factura(1);
		f.setPrecio_unitario(libroDigital.getPrecio());
		f.setCantidad(3);
		f.setDigital(libroDigital);
		f.setCliente(c);
		f.calcularTotal(f.getPrecio_unitario(), f.getCantidad());
		
		Factura f1= new Factura();
			f1.setId_factura(2);
		f1.setPrecio_unitario(libroImpreso.getPrecio());
		f1.setCantidad(4);
		f1.setFisico(libroImpreso);
		f1.setCliente(c);
		f1.calcularTotal(f1.getPrecio_unitario(), f1.getCantidad());
		
		Factura f3= new Factura();
		f3.setId_factura(3);
		f3.setPrecio_unitario(libroImpreso.getPrecio());
		f3.setCantidad(8);
		f3.setFisico(libroImpreso);
		f3.setCliente(c1);
		f3.calcularTotal(f3.getPrecio_unitario(), f3.getCantidad());
		
		Factura f4= new Factura();
		f4.setId_factura(4);
		f4.setPrecio_unitario(libroDigital1.getPrecio());
		f4.setCantidad(1);
		f4.setDigital(libroDigital1);
		f4.setCliente(c2);
		f4.calcularTotal(f4.getPrecio_unitario(), f4.getCantidad());
	
	
		Factura f5= new Factura();
		f5.setId_factura(5);
		f5.setPrecio_unitario(libroDigital2.getPrecio());
		f5.setCantidad(2);
		f5.setDigital(libroDigital2);
		f5.setCliente(c2);
		f5.calcularTotal(f5.getPrecio_unitario(), f5.getCantidad());
		
		System.out.println(f.toString());
		System.out.println(f1.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());
		
		System.out.println("REGISTRO DE FACTURAS");
		
		RegistroCompra r= new RegistroCompra();
		r.guardarCompra(f);
		r.guardarCompra(f1);
		r.guardarCompra(f3);
		r.guardarCompra(f4);
		r.guardarCompra(f5);
		
		c.disminuirCredito(339.0);
		
		System.out.println("Compras \n"+c.recuperaCompras(c,r));
		System.out.println("---------------------------------------------------");
		System.out.println("Compras \n"+c.recuperaCompras(c1,r));
		System.out.println("----------------------------------------------------");
		System.out.println("Compras \n"+c.recuperaCompras(c2,r));
		
		
		
		
		
		
	}

}
