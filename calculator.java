package main.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/calculator")
public class calculator {
 
	@Path("add/{num1}/{num2}")
	@GET
	@Produces("application/xml")
	public String suma(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		Double rta;
		rta = num1 + num2;
 
		String result = "@Produces(\"application/xml\") Output: \n\nOperacion de suma: \n\n" + num1 + " + " + num2;
		return "<calculator>" + "<suma>" + rta + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
	}
	
	@Path("subs/{num1}/{num2}")
	@GET
	@Produces("application/xml")
	public String subs(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		Double rta;
		rta = num1 - num2;
 
		String result = "@Produces(\"application/xml\") Output: \n\nOperacion de resta: \n\n" + num1 + " + " + num2;
		return "<calculator>" + "<suma>" + rta + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
	}

	@Path("mult/{num1}/{num2}")
	@GET
	@Produces("application/xml")
	public String mult(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		Double rta;
		rta = num1 * num2;
 
		String result = "@Produces(\"application/xml\") Output: \n\nOperacion de multiplica: \n\n" + num1 + " + " + num2;
		return "<calculator>" + "<suma>" + rta + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
	}

	@Path("div/{num1}/{num2}")
	@GET
	@Produces("application/xml")
	public String div(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		Double rta;
		rta = num1 / num2;
 
		String result = "@Produces(\"application/xml\") Output: \n\nOperacion divide: \n\n" + num1 + " + " + num2;
		return "<calculator>" + "<suma>" + rta + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
	}

	
}
