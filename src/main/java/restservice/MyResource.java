package restservice;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("myresource")
public class MyResource {

    @POST
    public String getOrderInfo(@FormParam("zonkracht") double zonkracht, @FormParam("zonstand") double zonstand) {
        Zonnepaneel w = new Zonnepaneel();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("kwh", w.getKwh(zonkracht, zonstand));
        return job.build().toString();
    }
}