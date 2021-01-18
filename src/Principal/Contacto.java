package Principal;

/**
 * 
 * @author daw-A
 *
 */

public class Contacto {
	
	private String nombre;
	private String telefono;
	
	/**
	 * cosntructor que recibe el nombre y el telefono
	 * @param nombre nombre
	 * @param telefono telefono
	 */
	
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return nombre devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * el nuevo nombre de nuestro contacto
	 * @param nombre nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * devuelve el telefono
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * nuevo telefono de nuestro contacto
	 * @param telefono telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * to string por defecto
	 * @return devuelve el nombre y el telefono del contacto
	 */
	@Override
	public String toString() {
		return nombre + " ---- " + telefono;
	}
	
	/**
	 * funcion que se utuliza para buscar los contactos
	 * @param busqueda buscar
	 * @return verdadero o falso
	 */
	public boolean comparar(String busqueda) {
		if (nombre.equalsIgnoreCase(busqueda) || telefono.equalsIgnoreCase(busqueda)) {
			return true;
		}else {
			return false;
		}
	}

}
