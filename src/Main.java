public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Ragnar", new SwordStrategy());

        warrior.performAttack();
        System.out.println();

        warrior.setWeapon(new AxeStrategy());
        warrior.performAttack();
        System.out.println();

        warrior.setWeapon(new BowStrategy());
        warrior.performAttack();
    }
}
