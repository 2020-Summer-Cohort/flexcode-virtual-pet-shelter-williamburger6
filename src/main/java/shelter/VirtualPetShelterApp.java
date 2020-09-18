package shelter;
import java.lang.reflect.Member;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter myPetShelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Chuck", "grey", 3, 3, 3);
        VirtualPet pet2 = new VirtualPet("Sadie","white",1,2,3);
        VirtualPet pet3 = new VirtualPet("Louie","brown",3,2,1);

        myPetShelter.add(pet1);
        myPetShelter.add(pet2);
        myPetShelter.add(pet3);

        String userChoice;

        do {
            System.out.println("Welcome to the cat house. Here are the available cats:");
            myPetShelter.showPets();

            System.out.println("What would you like to do?");
            System.out.println("Press 1 to feed cats");
            System.out.println("Press 2 to  water cats");
            System.out.println("Press 3 to play with a cat");
            System.out.println("Press 4 to adopt a cat");
            System.out.println("Press 5 to admit a pet");
            System.out.println("Press 6 to leave");
            userChoice = input.nextLine();



            if(userChoice.equals("1")){
                System.out.println("Which cat would you like to feed?");
                myPetShelter.showPets();
                String petToFeed = input.nextLine();
                myPetShelter.hunger(petToFeed,0);
                System.out.println(petToFeed + " is grateful you fed them, they're all full now");
            }

            else if(userChoice.equals("2")){
                System.out.println("Which cat would you like to give water");
                myPetShelter.showPets();
                String petToWater = input.nextLine();
                myPetShelter.thirst(petToWater,0);
                System.out.println(petToWater + " drank every last drop");
            }
            else if(userChoice.equals("3")){
                System.out.println("Which cat would you like to play with?");
                myPetShelter.showPets();
                String petToPlay = input.nextLine();
                myPetShelter.energy(petToPlay,0);
                System.out.println(petToPlay + " would be happy to play");

            }
            else if(userChoice.equals("4")){
                System.out.println("Which cat would you like to adopt?");
                myPetShelter.showPets();

            }


            else if (userChoice.equals("5")){
                System.out.println("We'd be happy to take your cat");
                System.out.println("What is your cat's name?");
                String newCatName = input.nextLine();
                System.out.println("What color are they?");
                String newCatColor = input.nextLine();
                new VirtualPet(newCatName,newCatColor,3,3,3);


            }
        }while(userChoice != "6");

            System.out.println("Thanks for visiting!");



    }
}
