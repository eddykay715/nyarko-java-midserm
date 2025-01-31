package question2;


public class CurrencyConverter {
    public static double dollarToGhc(double dollars) {
        return dollars * 12.5; // Example rate
    }

    public static double euroToGhc(double euros) {
        return euros * 13.2; // Example rate
    }

    public static double yenToGhc(double yen) {
        return yen * 0.09; // Example rate
    }

    public static double ghcToDollar(double ghc) {
        return ghc / 12.5;
    }

    public static double ghcToEuro(double ghc) {
        return ghc / 13.2;
    }

    public static double ghcToYen(double ghc) {
        return ghc / 0.09;
    }
}
