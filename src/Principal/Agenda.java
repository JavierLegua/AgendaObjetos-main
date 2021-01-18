package Principal;

import java.util.Scanner;

public class Agenda {

	/**
	 * @author Javier Legua
	 * @version 1.0
	
	
	
	 * Inicializamos variables
	 */
	
	private String propietario;
	private Contacto[] vAgenda;
	
	/**
	 * Constructor por defecto
	 */
	public Agenda() {
		propietario = "";
		vAgenda = new Contacto[10];

	}
	/**
	 * Costructor que asigna valores a las 3 primeras posiciones del vector
	 * @param propietario propietario
	 */
	public Agenda(String propietario) {
		this.propietario = propietario;
		vAgenda = new Contacto[10];
		vAgenda[0] = new Contacto("Juan", "999888777");
		vAgenda[1] = new Contacto("Pepe", "222222");
		vAgenda[2] = new Contacto("Silvia", "333333");
	}

	/**
	 * Establece el tamaño del vector con la variable tam
	 * @param propietario propietario
	 * @param tam tamaño
	 */
	public Agenda(String propietario, int tam) {
		this.propietario = propietario;
		vAgenda = new Contacto[tam];
	}
	/**
	 * No recibe nada
	 * Se muestra el menu de opciones y te pide por teclado un numero para escoger una de las opciones 
	 * disponibles
	 * @return devuelve un numero del 1-6
	 */
	public static int verMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("Agenda telefonos 2.0 \n -------------- \n");
			System.out.println("1- Ver todos los contactos");
			System.out.println("2- Añadir contacto");
			System.out.println("3- Borrar contacto");
			System.out.println("4- Buscar contacto");
			System.out.println("5- Editar contacto");
			System.out.println("6- Salir");
			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
			}
			
			if (opc < 1 || opc > 6) {
				System.out.println("Opcion no valida \n\n");
			}
		} while (opc < 1 || opc > 6);
		return opc;
	}
	/**
	 * No recibe nada
	 * @return propietario
	 */
	public String getPropietario() {
		return propietario;
	}
	/**
	 * to string por defecto
	 */
	@Override
	public String toString() {
		String contactos = "";

		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] != null) {
				contactos += vAgenda[i].toString() + "\n";
			}
		}

		return propietario + "\n" + contactos;
	}
	
	/**
	 * busqueda de la posicion del contacto
	 * @return posicion
	 */
	private int buscarPosicion() {
		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * busqueda del nombre o del telefono
	 * @param busqueda buscar
	 * @return si se ha encontrado el numero de telefono o el nombre
	 */
	
	private int buscarPosicion(String busqueda) {
		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i].comparar(busqueda)) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Se añade un contacto al vector con el nombre y el telefono
	 */
	public void anadirContacto() {
		Scanner leer = new Scanner(System.in);
		String nombre, telefono;
		int pos;
		
		try {
			System.out.println("A�adiendo un nuevo contacto");
			System.out.println("Dime el nombre del contacto");
			nombre = leer.nextLine();
			System.out.println("Dime el telefono del contacto");
			telefono = leer.next();
			
			Contacto c = new Contacto(nombre, telefono);
			pos = buscarPosicion();
			vAgenda[pos] = c;
			System.out.println("Contacto a�adido");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Tu agenda esta llena");
		} catch (Exception e) {
			System.out.println("El contacto no se ha podido a�adir");
		}
		
	}
	/**
	 * Se borra el contacto que el usuario ha solicitado
	 */
	public void borrarContacto() {
		Scanner leer = new Scanner(System.in);
		String busqueda;
		int pos;
		
		try {
			System.out.println("Borrando contacto");
			System.out.println("Dime el nombre o el telefono del contacto");
			busqueda = leer.nextLine();
			
			pos = buscarPosicion(busqueda);
			vAgenda[pos] = null;
			System.out.println("Contacto Borrado");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No se ha encontrado el contacto");
		} catch (Exception e) {
			System.out.println("El contacto no se ha podido borrar");
		}
		
	}

}
