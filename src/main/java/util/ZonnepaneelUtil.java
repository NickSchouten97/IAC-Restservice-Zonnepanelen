package util;

/**
 * Created by Nick on 23-6-2017.
 */
public class ZonnepaneelUtil {
    double kwh;

    public double getKwh(double zonkracht, double zonstand, boolean bewolking, String seizoen){
        double multiplier = SeizoenUtil.GetMultiplier(seizoen);
        if(bewolking == true){
            kwh = zonkracht + zonstand / multiplier / 2;
        }
        else if(bewolking == false){
            kwh = zonkracht + zonstand / multiplier ;
        }
        return kwh;
    }

}
