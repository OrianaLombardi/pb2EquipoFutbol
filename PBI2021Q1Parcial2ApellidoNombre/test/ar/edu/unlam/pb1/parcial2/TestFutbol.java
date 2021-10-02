package ar.edu.unlam.pb1.parcial2;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestFutbol {

	@Test
	public void testQueSePuedaAgregarUnJugador() {
		//Preparacion
		//Datos entrada
		String nombre="Oriana";
		int edad=25, numero=4;
		double precio=25000.0;
		
		//Ejecucion
		Jugador jugador=new Jugador(numero, nombre,edad,precio);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		
		//Validacion
		assertNotNull(jugador);
		assertEquals(nombre,jugador.getNombre());
		assertEquals(edad,jugador.getEdad());
		assertEquals(numero,jugador.getNumero());
		assertEquals(precio, jugador.getPrecio(),0.01);
		
		
	}
	
	
	
	@Test 
	public void queNoSePuedaAgregarUnJugador() {
		//Preparacion
		//Datos entrada
		String nombre="Oriana",nombre1="Julian",nombre2="Lino",nombre3="Analia",nombre4="Giovanni",nombre5="Lionel";
		int edad=25, numero=4,edad1=20, numero1=5,edad2=25, numero2=10,edad3=19, numero3=6,edad4=29, numero4=11,edad5=32, numero5=13;
		double precio=25000.0,precio1=25000.0,precio2=25000.0,precio3=25000.0,precio4=25000.0,precio5=25000.0;
		
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		Jugador jugador1=new Jugador(numero1,nombre1,edad1,precio1);
		Jugador jugador2=new Jugador(numero2,nombre2,edad2,precio2);
		Jugador jugador3=new Jugador(numero3,nombre3,edad3,precio3);
		Jugador jugador4=new Jugador(numero4,nombre4,edad4,precio4);
		Jugador jugador5=new Jugador(numero5,nombre5,edad5,precio5);
		
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		Boolean valorObtenido=equipo.agregarJugador(jugador5);
		
		
		//validacion
		assertFalse(valorObtenido);
	}
	
	@Test
	public void buscaUnJugadorEnLaListaDeJugadoresPorNombreQueDevuelvaUnJugador() {
		//Preparacion
		//Datos de entrada
		String nombre="Oriana";
		Integer numero=10,edad=25;
		Double precio=25000.50;
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		
		
		//ejecucion
		equipo.agregarJugador(jugador);
		Jugador jugadorBuscado=equipo.buscar(nombre);
		
		
		//validacion
		assertEquals(jugador,jugadorBuscado);
	}
	
	@Test
	public void buscaUnJugadorEnLaListaDeJugadoresPorNumeroQueDevuelvaUnJugador() {
		//Preparacion
		//Datos de entrada
		String nombre="Oriana";
		Integer numero=10,edad=25;
		Double precio=25000.50;
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		
		
		//ejecucion
		equipo.agregarJugador(jugador);
		Jugador jugadorBuscado=equipo.buscar(numero);
		
		
		//validacion
		assertEquals(jugador,jugadorBuscado);
	}
	
	
	@Test
	public void buscaUnJugadorEnLaListaDeJugadoresPorNombreQueNoDevuelvaUnJugador() {
		//Preparacion
		//Datos de entrada
		String nombre="Lino";
		Integer numero=11, edad=40;
		Double precio=60000.0;
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		
		
		//Ejecucion
		Jugador jugadorBuscado=equipo.buscar(nombre);
		equipo.agregarJugador(jugador);
		
		//Validacion
		assertNull(jugadorBuscado);
		
	}
	
	
	@Test
	public void buscaUnJugadorEnLaListaDeJugadoresPorNumeroQueNoDevuelvaUnJugador() {
		//Preparacion
		//Datos de entrada
		String nombre="Lino";
		Integer numero=11, edad=40;
		Double precio=60000.0;
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		
		
		//Ejecucion
		Jugador jugadorBuscado=equipo.buscar(numero);
		equipo.agregarJugador(jugador);
		
		//Validacion
		assertNull(jugadorBuscado);
		
	}
	
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeUnEquipoDevolviendoUnDouble() {
		//Preparacion
		//Datos de entrada
		String nombre="Oriana";
		Integer numero=6,edad=26;
		Double precio=26000.00;
		String nombre1="Lino";
		Integer numero1=6,edad1=40;
		Double precio1=29000.0;
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		Jugador jugador1=new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		
		double jugadorEdadPromedio=equipo.calcularLaEdadPromedioDelEquipo();
		
		
		//Validacion
		
		assertEquals(edad,jugadorEdadPromedio,0.00);
		assertEquals(edad1,jugadorEdadPromedio,0.00);
	}
	
	
	@Test
	public void queSePuedaCalcularElValorDelEquipoDevolviendoUnDouble() {
		//Preparacion
		//Datos de entrada
		String nombre="Oriana";
		Integer numero=6,edad=26;
		Double precio=26000.00;
		String nombre1="Lino";
		Integer numero1=6,edad1=40;
		Double precio1=29000.0;
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		Jugador jugador1=new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		double valorEquipo=equipo.calcularElValorDelEquipo();
		
		
		//Validacion
		assertEquals(precio,valorEquipo,0.00);
		assertEquals(precio1,valorEquipo,0.00);
		
	}
	
	@Test
	public void queNOSePuedaCalcularElValorDelEquipoDevolviendoUnDouble() {
		//Preparacion
		//Datos de entrada
		String nombre="Oriana";
		Integer numero=6,edad=26;
		Double precio=26000.00;
		String nombre1="Lino";
		Integer numero1=6,edad1=40;
		Double precio1=29000.0;
		Jugador jugador=new Jugador(numero,nombre,edad,precio);
		Jugador jugador1=new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Velez");
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		double valorEquipo=equipo.calcularElValorDelEquipo();
		
		
		//Validacion
		assertEquals(precio,valorEquipo,0.00);
		assertEquals(precio1,valorEquipo,0.00);
		
	}
	
	
}
