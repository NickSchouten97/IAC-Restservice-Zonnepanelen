package restservice;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/echo")
public class EchoService {

    @GET
    public String hi(){
        return Json.createObjectBuilder().add("message", "hi").build().toString();
    }


    @GET
    @Path("/say")
    public String echo(@QueryParam("message") String message){
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("message", message);
        return job.build().toString();
    }
}
