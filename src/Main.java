public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenseType("Physical");

        // Выводим информацию о боссе
        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создаем героев и выводим их информацию
        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    // Метод для создания 3 героев с различными конструкторами
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];

        // Герой 1: использование всех полей конструктора
        heroes[0] = new Hero(500, 5, "Tank");

        // Герой 2: использование конструктора с здоровьем и уроном
        heroes[1] = new Hero(200, 30);

        // Герой 3: использование всех полей конструктора
        heroes[2] = new Hero(250, 0, "Healer");

        return heroes;
    }
}
