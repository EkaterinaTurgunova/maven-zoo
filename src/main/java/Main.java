import company.zoo.*;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Zoo! Now you will learn something new about the inhabitants of the zoo!");
        CreatureQuantity.infoCreatureQuantity();
        System.out.println("\n.......................................");

        Scanner scanner = new Scanner(System.in);
        int  number = 0;

        do {
                System.out.println("Chose someone from the list. \nAnimals: 1. Cheetah 2. Giraffe " +
                        "\nBirds: 3. Hummingbird 4. Needle-tailed swift " +
                        "\nFish: 5. Boxfish 6. Butterflyfish \n0. Exit");
            try {
                number = scanner.nextInt();

                switch (number) {
                    case 1:
                        Cheetah cheetah = new Cheetah();
                        System.out.println(".......................................");

                        System.out.println(cheetah.getKindOfCreature());
                        System.out.println(cheetah.getSpecificSkill());
                        cheetah.breath();
                        cheetah.move();

                        System.out.println("\n.......................................");

                        break;

                    case 2:
                        Giraffe giraffe = new Giraffe();
                        System.out.println(".......................................");

                        System.out.println(giraffe.getKindOfCreature());
                        System.out.println(giraffe.getSpecificSkill());
                        giraffe.breath();
                        giraffe.move();
                        System.out.println("\n.......................................");

                        break;

                    case 3:
                        Hummingbird hummingbird = new Hummingbird();
                        System.out.println(".......................................");

                        System.out.println(hummingbird.getKindOfCreature());
                        System.out.println(hummingbird.getSpecificSkill());
                        hummingbird.breath();
                        hummingbird.move();
                        System.out.println("\n.......................................");

                        break;

                    case 4:
                        NeedleTailedSwift needleTailedSwift = new NeedleTailedSwift();
                        System.out.println(".......................................");

                        System.out.println(needleTailedSwift.getKindOfCreature());
                        System.out.println(needleTailedSwift.getSpecificSkill());
                        needleTailedSwift.breath();
                        needleTailedSwift.move();
                        System.out.println("\n.......................................");

                        break;

                    case 5:
                        Boxfish boxfish = new Boxfish();
                        System.out.println(".......................................");

                        System.out.println(boxfish.getKindOfCreature());
                        System.out.println(boxfish.getSpecificSkill());
                        boxfish.breath();
                        boxfish.move();
                        System.out.println("\n.......................................");

                        break;

                    case 6:
                        Butterflyfish butterflyfish = new Butterflyfish();
                        System.out.println(".......................................");

                        System.out.println(butterflyfish.getKindOfCreature());
                        System.out.println(butterflyfish.getSpecificSkill());
                        butterflyfish.breath();
                        butterflyfish.move();
                        System.out.println("\n.......................................");

                        break;

                    case 0:
                        System.out.println("See you soon!");

                        break;

                    default:
                        System.out.println("Wrong number! Try Again!");

                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Sorry, wrong input:" + e.getMessage());

                break;
            }

        } while (number != 0);
    }
}