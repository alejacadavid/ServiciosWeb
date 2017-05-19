package co.mafesa.dto;


import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO para la tabla Usuario
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */
@XmlRootElement
public class Usuario {

	private String nombreUsuario;
	private String tipoId;
	private String numeroId;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String email;
	private String contrase�a;
	private Date fechaCreacion;
	private Cliente cliente;
	
	private Set<RolesUsuario> rolesUsuario;
	
	/**
	 * @return el nombre de usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario el nombre de usuario a ingresar
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return el tipo de identificaci�n
	 */
	public String getTipoId() {
		return tipoId;
	}
	/**
	 * @param tipoId el tipo de identificaci�n a ingresar
	 */
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	/**
	 * @return el n�mero de identificaci�n
	 */
	public String getNumeroId() {
		return numeroId;
	}
	/**
	 * @param numeroId el n�mero de identificaci�n a ingresar
	 */
	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}
	/**
	 * @return los nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres los nombres a ingresar
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return los apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos los apellidos a ingresar
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return la direcci�n
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion la direcci�n a ingresar
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el tel�fono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el tel�fono a ingresar
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el correo electr�nico
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email el correo electr�nico a ingresar
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return la contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}
	/**
	 * @param contrase�a la contrase�a a ingresar
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	/**
	 * @return la fecha de creaci�n
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion la fecha de creaci�n a ingresar
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the rolesUsuario
	 */
	public Set<RolesUsuario> getRolesUsuario() {
		return rolesUsuario;
	}
	/**
	 * @param rolesUsuario the rolesUsuario to set
	 */
	public void setRolesUsuario(Set<RolesUsuario> rolesUsuario) {
		this.rolesUsuario = rolesUsuario;
	}


}
