package co.mafesa.dao;

import java.util.List;

import co.mafesa.dto.Servicio;
import co.mafesa.exception.MyException;


/**
 * Interface que define los m�todos permitidos para las servicios en el 
 * sistema
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */

public interface ServicioDAO {

	/**
	 * Obtiene la lista de servicios que existen en el sistema 
	 * @return Lista de servicios
	 * @throws MyException ocurre cuando hay un problema con la conexi�n a la BD
	 */
	public List<Servicio> get() throws MyException;
	
	/**
	 * Inserta la informaci�n de un servicio
	 * @param servicio servicio
	 * @throws MyException cuando hay un error insertando
	 */
	public void insert(Servicio servicio) throws MyException;
	
	/**
	 * Entrega la informaci�n de un servicio dado su referencia
	 * @param refServicio referencia
	 * @return datos del servicio
	 * @throws MyException cuando hay un error consultando
	 */
	public Servicio get(String refServicio) throws MyException;

	/**
	 * Modifca los datos de un servicio en la base de datos
	 * @param servicio objeto {@link Servicio} con la informaci�n a modificar
	 * @throws MyException cuando hay un error modificando la informaci�n
	 */
	public void update(Servicio servicio) throws MyException;
	

	/**
	 * Elimina los datos de un servicio en la base de datos
	 * @param servicio objeto {@link Servicio} con la informaci�n a elimina
	 * @throws MyException cuando hay un error eliminando la informaci�n
	 */
	public void delete(Servicio servicio) throws MyException;
}
