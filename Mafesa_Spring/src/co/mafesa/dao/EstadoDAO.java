package co.mafesa.dao;

import co.mafesa.dto.Estado;
import co.mafesa.exception.MyException;
/**
 * Interface que define los m�todos permitidos para los estados de ordenes de compra
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */
public interface EstadoDAO {
	/**
	 * Inserta la informaci�n de un Estado
	 * @param estado estado
	 * @throws MyException cuando hay un error insertando
	 */
	public void insert(Estado estado) throws MyException;

	/**
	 * Entrega la informaci�n del estado de una orden de compra dado su numero
	 * @param numero numero de estado
	 * @return estado
	 * @throws MyException cuando hay un error consultando
	 */
	public Estado get(int numero) throws MyException;

	/**
	 * Modifca los datos del estado de una orden de compra en la base de datos
	 * @param estado objeto {@link Estado} con la informaci�n a modificar
	 * @throws MyException cuando hay un error modificando la informaci�n
	 */
	public void update(Estado estado) throws MyException;

	/**
	 * Elimina los datos del estado de una orden de compra en la base de datos
	 * @param estado objeto {@link Estado} con la informaci�n a modificar
	 * @throws MyException  cuando hay un error eliminando la informaci�n
	 */
	public void delete(Estado estado) throws MyException;

}
