public class Warrior {
    private WeaponStrategy weapon;
    private String name;

    public Warrior(String name, WeaponStrategy weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(WeaponStrategy weapon) {
        this.weapon = weapon;
    }

    public void performAttack() {
        System.out.println(name + " está atacando:");
        weapon.attack();
    }
}
