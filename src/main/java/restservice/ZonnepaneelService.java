package restservice;

import model.Bewolking;
import util.ZonnepaneelUtil;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;

@Path("/ZonnepaneelService")
public class ZonnepaneelService {

    @GET
    public String getKwh(@QueryParam("zonkracht") String zonkracht, @QueryParam("zonstand") String zonstand, @QueryParam("bewolkingkans") String bewolkingkans, @QueryParam("seizoen") String seizoen) {
        ZonnepaneelUtil w = new ZonnepaneelUtil();
        Bewolking bewolking = new Bewolking();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("kwh", w.getKwh(Double.parseDouble(zonkracht), Double.parseDouble(zonstand), bewolking.IsHetBewolkt(Double.parseDouble(bewolkingkans)), seizoen));
        return job.build().toString();
    }
}