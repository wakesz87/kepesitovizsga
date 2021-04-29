package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    private int health;
    private int attackDamage;
    private boolean armor;

    public MilitaryUnit(int health, int attackDamage, boolean armor) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public boolean isArmor() {
        return armor;
    }

    public void doDamage(){
        this.attackDamage = attackDamage;

    }

    public int sufferDamage(int damage){
        return health - damage;

    }
}
