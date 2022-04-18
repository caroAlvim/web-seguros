package sisrh.rest;

import java.text.SimpleDateFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.*;
import io.swagger.annotations.Api;

@Api
@Path("/sistema")
public class SistemaRest {
	@GET
	@Path("ping")
	@Produces(MediaType.TEXT_PLAIN)
	public Response ping() {
		UUID uuid = UUID.randomUUID();
		return Response.ok().entity("pong: " + uuid).build();
	}
	
	@GET
	@Path("datahora")
	@Produces(MediaType.TEXT_PLAIN)
	public Response datahora() {
		String pattern = "dd/MM/YYYY - HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return Response.ok().entity(simpleDateFormat.format(new Date())).build();
	}

}
