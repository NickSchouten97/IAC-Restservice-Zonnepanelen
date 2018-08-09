package restservice;

/**
 * Created by Nick on 23-6-2017.
 */
public class Zonnepaneel {
    double kwh;

    public double getKwh(double zonkracht, double zonstand){
        kwh = zonkracht + zonstand;
        return kwh;
    }

}
