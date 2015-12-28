import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MainPageResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextHello(){
		String text = "Hello world!";
		return Response.ok(text).build();
	}
	

	@GET
	@Produces(MediaType.TEXT_XML)
	public Response getXMLHello(){
		String text = "<?xml version=\"1.0\"?>" + "<hello> Hello world!" + "</hello>";
		return Response.ok(text).build();
	}
	

	@GET
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
