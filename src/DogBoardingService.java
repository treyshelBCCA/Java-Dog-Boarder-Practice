import java.util.ArrayList;

class DogBoardingService {
    private ArrayList<Dog> boardedDogs = new ArrayList<>();

    public void boardDog(Dog dog) {
        boardedDogs.add(dog);
        System.out.println(dog.getName() + " has been boarded.");
    }

    public void pickUpDog(String dogName) {
        for (Dog dog : boardedDogs) {
            if (dog.getName().equalsIgnoreCase(dogName)) {
                boardedDogs.remove(dog);
                System.out.println(dogName + " has been picked up.");
                return;
            }
        }
        System.out.println("No dog found with the name " + dogName);
    }

    public void listBoardedDogs() {
        if (boardedDogs.isEmpty()) {
            System.out.println("No dogs are currently boarded.");
        } else {
            System.out.println("Currently boarded dogs:");
            for (Dog dog : boardedDogs) {
                System.out.println(dog);
            }
        }
    }
}