import java.util.Scanner;

public class kmMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mile = scanner.toString();
        double km ;
        boolean match = mile.matches("^/d+(/d+)?$");
        do {
            System.out.println("Podaj odległość w milach:");
            mile = scanner.next();
        } while (!mile.matches("^\\d+(\\d+)?$"));
        int mileInt = Integer.parseInt(mile);
        km = mileInt / 0.62137;
        System.out.printf("Odległość w km: \u2248%.2f\n", km);




    }
}
