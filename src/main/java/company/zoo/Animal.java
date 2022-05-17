package company.zoo;

public abstract class Animal extends Entity implements ZooDoing  {

    protected String kindOfEntity;

    public String getKindOfEntity() {
        return "This is a " + kindOfEntity +".";
    }

    @Override
    public void breath() {
        System.out.printf("The %s breathes oxygen. ", kindOfEntity);
    }

    @Override
    public void move() {
        System.out.printf("\nThe %s walks on the ground. ", kindOfEntity);
    }


//
//    @Override
//    public void breath() {
//        System.out.println("The %s is breathes air", ());
//
//    }
//
//    @Override
//    public void move() {

    }




