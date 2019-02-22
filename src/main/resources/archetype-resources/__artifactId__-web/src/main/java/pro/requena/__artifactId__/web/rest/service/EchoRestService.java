#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.rest.service;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ${package}.ejb.services.EchoService;

/**
 * Echo WS.
 * 
 * @author krequena
 *
 */
@Path("/echo")
public class EchoRestService {

	@EJB
	private EchoService echoService;

	/**
	 * GET method to gather an echo.
	 * @param value
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String postEcho(@QueryParam("value") final String value) {
		return echoService.echo(value);
	}

}