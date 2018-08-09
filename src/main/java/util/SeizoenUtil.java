package util;

public class SeizoenUtil {
    public static double GetMultiplier(String seizoen) {
        if (seizoen.equals("Lente")) {
            return 2.5;
        }
        else if (seizoen.equals("Zomer")) {
            return 2;
        }
        else if (seizoen.equals("Herfst")) {
            return 3;
        }
        else if (seizoen.equals("Winter")) {
            return 3.5;
        }
        return 0;
    }
}
