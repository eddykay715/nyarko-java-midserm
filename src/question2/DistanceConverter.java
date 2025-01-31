package question2;

public class DistanceConverter {
    public static double meterToKilometer(double meters) {
        return meters / 1000;
    }

    public static double milesToKilometer(double miles) {
        return miles * 1.60934;
    }

    public static double kilometerToMeter(double kilometers) {
        return kilometers * 1000;
    }

    public static double kilometerToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}