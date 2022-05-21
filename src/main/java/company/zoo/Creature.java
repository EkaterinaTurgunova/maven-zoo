package company.zoo;

public class Creature {

    protected String kindOfCreature;

    public String getKindOfCreature() {
        return "This is a " + kindOfCreature +".";
    }

    protected String specificSkill;

    public String getSpecificSkill() {
        return specificSkill;
    }
}
