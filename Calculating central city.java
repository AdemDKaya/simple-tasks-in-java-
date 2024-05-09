import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numCities = input.nextInt();

        double[][] cities = new double[numCities][2]; 
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the coordinates (x y) for city " + (i + 1) + ": ");
            cities[i][0] = input.nextDouble(); 
            cities[i][1] = input.nextDouble(); 
        }

        int centralCityIndex = findCentralCity(cities);
        double totalDistance = calculateTotalDistance(cities, centralCityIndex);
        System.out.println("The central city is city " + (centralCityIndex + 1));
        System.out.println("The total distance to all other cities = " + totalDistance);
    }

    
    public static int findCentralCity(double[][] cities) {
        int centralCityIndex = 0;
        double minTotalDistance = Double.MAX_VALUE;
        for (int i = 0; i < cities.length; i++) {
            double totalDistance = 0;
            for (int j = 0; j < cities.length; j++) {
                if (i != j) {
                    totalDistance += distanceBetween(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
                }
            }
            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralCityIndex = i;
            }
        }
        return centralCityIndex;
    }

    
    public static double calculateTotalDistance(double[][] cities, int centralCityIndex) {
        double totalDistance = 0;
        for (int i = 0; i < cities.length; i++) {
            if (i != centralCityIndex) {
                totalDistance += distanceBetween(cities[centralCityIndex][0], cities[centralCityIndex][1], cities[i][0], cities[i][1]);
            }
        }
        return totalDistance;
    }

   
    public static double distanceBetween(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}