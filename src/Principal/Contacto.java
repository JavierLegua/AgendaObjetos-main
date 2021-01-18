package Principal;

public class Contacto {
	/**
	 * declaramos variables
	 */
	private String nombre;
	private String telefono;
	
	/**
	 * cosntructor que recibe el nombre y el telefono
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * devuelve el nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * el nuevo nombre de nuestro contacto
	 * @param nombre
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
	 * @param telefono
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
	 * @param busqueda
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
