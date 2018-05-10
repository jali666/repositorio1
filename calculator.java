package main.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/calculator")
public class calculator {
 
	@Path("add/{numeros:.*}")
	@GET
	@Produces("application/xml")
	public String add(@PathParam("numeros") String numeros) {	
		String result=null;
		String tipoOperacion = "add";
		double resultado = 0;
		try{
			resultado = operaciones.calcula(numeros,tipoOperacion);
			result = "@Produces(\"application/xml\") Output: \n\nOperacion de suma: \n\n" + numeros ;
			return "<calculator>" + "<suma>" + resultado + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}catch (Exception e){
			result = "Error de datos " + e.getMessage();
			resultado=0;
			return "<calculator>" + "<suma>" + resultado + "</suma>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}
	}

	
	@Path("subs/{numeros:.*}")
	@GET
	@Produces("application/xml")
	public String subs(@PathParam("numeros") String numeros){
		String result=null;
		String tipoOperacion = "subs";
		double resultado = 0;
		try{
			resultado = operaciones.calcula(numeros,tipoOperacion);
			result = "@Produces(\"application/xml\") Output: \n\nOperacion de suma: \n\n" + numeros ;
			return "<calculator>" + "<resta>" + resultado + "</resta>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}catch (Exception e){
			result = "Error de datos " + e.getMessage();
			resultado=0;
			return "<calculator>" + "<resta>" + resultado + "</resta>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}
	}

	@Path("mult/{numeros:.*}")
	@GET
	@Produces("application/xml")
	public String mult(@PathParam("numeros") String numeros) throws Exception {
		String result=null;
		String tipoOperacion = "mult";
		double resultado = 0;
		try{
			resultado = operaciones.calcula(numeros,tipoOperacion);
			result = "@Produces(\"application/xml\") Output: \n\nOperacion de suma: \n\n" + numeros ;
			return "<calculator>" + "<multiplicacion>" + resultado + "</multiplicacion>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}catch (Exception e){
			result = "Error de datos " + e.getMessage();
			resultado=0;
			return "<calculator>" + "<multiplicacion>" + resultado + "</multiplicacion>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}
	}

	@Path("div/{numeros:.*}")
	@GET
	@Produces("application/xml")
	public String div(@PathParam("numeros") String numeros) {
		String result=null;
		String tipoOperacion = "div";
		double resultado = 0;
		try{
			resultado = operaciones.calcula(numeros,tipoOperacion);
			result = "@Produces(\"application/xml\") Output: \n\nOperacion de suma: \n\n" + numeros ;
			return "<calculator>" + "<division>" + resultado + "</division>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}catch (Exception e){
			result = "Error de datos " + e.getMessage();
			resultado=0;
			return "<calculator>" + "<division>" + resultado + "</division>" + "<calculator>" + result + "</calculator>" + "</calculator>";
		}
	}
	

	
}
