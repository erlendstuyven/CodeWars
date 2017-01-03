package codewars.kyu7;

public class GpsSpeed {
    public static int gps(int seconds, double[] distances) {
        double highestSpeed = 0;
        for(int i = 0; i < distances.length-1; i++) {
            double currentSpeed = (distances[i+1]-distances[i]) * 3600/seconds;
            if (currentSpeed > highestSpeed) highestSpeed = currentSpeed;
        }
        return new Double(Math.floor(highestSpeed)).intValue();
    }
}

