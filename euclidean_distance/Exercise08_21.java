import java.util.Scanner;

public class Exercise08_21 {

    // Method to compute the Euclidean distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the central city and its total distance to all other cities
    public static double[] findCentralCity(double[][] cities) {
        int n = cities.length;
        double minTotalDistance = Double.MAX_VALUE;
        int centralCityIndex = 0;

        for (int i = 0; i < n; i++) {
            double totalDistance = 0;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    totalDistance += distance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
                }
            }

            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralCityIndex = i;
            }
        }

        return new double[] {centralCityIndex, minTotalDistance};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of cities
        System.out.print("Enter the number of cities: ");
        int numCities = input.nextInt();

        double[][] cities = new double[numCities][2];

        System.out.println("Enter the coordinates of the cities:");

        // Populate the array with user inputs
        for (int i = 0; i < numCities; i++) {
            cities[i][0] = input.nextDouble(); // x-coordinate
            cities[i][1] = input.nextDouble(); // y-coordinate
        }

        // Find the central city and its total distance to all other cities
        double[] result = findCentralCity(cities);

        int centralCityIndex = (int) result[0];
        double totalDistance = result[1];

        System.out.printf("The central city is at (%.1f, %.1f)%n", cities[centralCityIndex][0], cities[centralCityIndex][1]);
        System.out.printf("The total distance to all other cities is %.2f%n", totalDistance);
    }
}
