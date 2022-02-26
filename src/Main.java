import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
- A program where you type in a zip code in Denmark and you get the city name.
- zip codes and cities are listed in the txt file "cities.txt".
 */
public class Main {


    public static void main(String[] args) throws IOException {
        ArrayList<City> cities = new ArrayList<>();
        populateArrayList(cities);
    }

    public static void populateArrayList(ArrayList<City> cities) throws IOException {
        File file = new File("cities.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String[] arr = scanner.nextLine().split(" "); // splitting indexes in the txt file by 1 space.
            City newCity = new City(arr[0], arr[1]); // txt file now has indexes which is split by a space.
            cities.add(newCity); // everything in the file is now added to an ArrayList.
        }
        getCity(cities); // calling my method getCity().
    }

    public static void getCity(ArrayList<City> cities){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in zip code: ");
        String answer = input.nextLine();
        for (int i = 0; i < cities.size(); i++) { // going through my whole ArrayList.
            if (cities.get(i).getZipcode().equals(answer)) {
                // if the zip codes equals the user input from the scanner object
                // then print out that zip code's city
                System.out.println(cities.get(i));
            }
        }
    }
}