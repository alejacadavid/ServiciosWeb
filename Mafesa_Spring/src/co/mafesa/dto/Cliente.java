package co.mafesa.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO para la tabla Cliente
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */
@XmlRootElement
public class Cliente {

	private String codigoCliente;
	private String tipoId;
	private String id;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private String email;

	/**
	 * @return el codigo del Cliente
	 */
	public String getCodigoCliente() {
		return codigoCliente;
	}
	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	/**
	 * @return the tipoId
	 */
	public String getTipoId() {
		return tipoId;
	}
	/**
	 * @param tipoId the tipoId to set
	 */
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return La raz�n social
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial raz�n social a ingresar
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	/**
	 * @return La direcci�n
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion La direcci�n a ingresar
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return El tel�fono
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
	 * @return El correo electr�nico
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email El correo electr�nico a ingresar
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
