#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ejb.services;

import javax.ejb.Stateless;

/**
 * Echo EJB service class.
 * @author krequena
 *
 */
@Stateless
public class EchoService {
	
	private final static String PREFIX = "Hello ";

	/**
	 * Echo method.
	 * @param value Name.
	 * @return Echo return value.
	 */
	public final String echo(final String value) {
		return PREFIX.concat(value);
	}
}
