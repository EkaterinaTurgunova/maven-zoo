package company.zoo;

public abstract class Animal extends Creature implements ZooAction {

    @Override
    public void breath() {
        System.out.printf("The %s breathes oxygen.", kindOfCreature);
    }

    @Override
    public void move() {
        System.out.printf("\nThe %s walks on the land.", kindOfCreature);
    }
}