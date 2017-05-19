package co.mafesa.bl;

import java.text.ParseException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.mafesa.dto.Factura;
import co.mafesa.exception.MyException;

/**
 * Contienen los m�todos de la l�gica del negocio para la entidad Factura
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 *
 */
@Transactional
public interface FacturaBL {
	/**
	 * Retorna el listado de facturas del sistema
	 * @return lista de facturas
	 * @throws MyException cuando hay un error listando las facturas
	 */
	public List<Factura> obtenerLista() throws MyException;
	
	/**
	 * Genera la factura
	 * @param numFactura numero de factura
	 * @param fechaVencimiento fecha de vencimiento
	 * @param numOrdenCompra numero de orden de compra
	 * @param valorImpuestos valor impuestos
	 * @param valorDescuentos valor descuentos
	 * @param observaciones observaciones
	 * @throws MyException cuando hay errores generando la factura
	 * @throws ParseException cuando hay errores realizando la conversi�n de tipos
	 */
	public void generarFactura(String numFactura, String fechaVencimiento, String numOrdenCompra, String valorImpuestos,
			String valorDescuentos, String observaciones) throws MyException, ParseException;


	/**
	 * Modifica la informacion de una factura
	 * @param numFactura numero de factura
	 * @param fechaVencimiento fecha de vencimiento
	 * @param numOrdenCompra numero de orden de compra
	 * @param valorImpuestos valor impuestos
	 * @param valorDescuentos valor descuentos
	 * @param observaciones observaciones
	 * @throws MyException cuando hay errores modificando la factura
	 * @throws ParseException cuando hay errores modificando la conversi�n de tipos
	 */
	public void modificarFactura(String numFactura, String fechaVencimiento, String numOrdenCompra, String valorImpuestos,
			String valorDescuentos, String observaciones) throws MyException, ParseException;

	/**
	 * Busca la informacion de una factura dado su numero
	 * @param numFactura numero de factura
	 * @return factura
	 * @throws MyException cuando hay errores buscando una factura
	 */
	public Factura buscarFactura(String numFactura) throws MyException;
}
