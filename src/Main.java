import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static DogBoardingService dogBoardingService = new DogBoardingService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    boardDog();
                    break;
                case 2:
                    pickUpDog();
                    break;
                case 3:
                    listBoardedDogs();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Dog Boarding Service Menu:");
        System.out.println("1. Board a dog");
        System.out.println("2. Pick up a dog");
        System.out.println("3. List boarded dogs");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void boardDog() {
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter dog's breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter owner's name: ");
        String ownerName = scanner.nextLine();

        Dog dog = new Dog(name, breed, ownerName);
        dogBoardingService.boardDog(dog);
    }

    private static void pickUpDog() {
        System.out.print("Enter the name of the dog to pick up: ");
        String dogName = scanner.nextLine();
        dogBoardingService.pickUpDog(dogName);
    }

    private static void listBoardedDogs() {
        dogBoardingService.listBoardedDogs();
    }
}
