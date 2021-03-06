package RESTClasses;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class MainPageResource {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextHello(){
		String text = "Hello fucking world!";
		return Response.ok(text).build();
	}
	

	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public Response getXMLHello(){
		String text = "<?xml version=\"1.0\"?>" + "<hello> Hello world!" + "</hello>";
		return Response.ok(text).build();
	}
	

	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public Response getHTMLHello(){
		String text = "<html>"
						+ "<head>"
						+ "</head>"
						+ "<body>"
							+ "<p>"
								+ "Hello world!"
							+ "</p>"
						+ "</body>"
					+ "</html>";
		return Response.ok(text).build();
	}
}
