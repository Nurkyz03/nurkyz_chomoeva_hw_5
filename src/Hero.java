public class Hero {
    private int health;
    private int damage;
    private String superpower;

    // Конструктор с заданием всех полей
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    // Конструктор с заданием только здоровья и урона
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "No superpower"; // По умолчанию без суперспособности
    }

    // Геттер для поля health
    public int getHealth() {
        return health;
    }

    // Геттер для поля damage
    public int getDamage() {
        return damage;
    }

    // Геттер для поля superpower
    public String getSuperpower() {
        return superpower;
    }
}
