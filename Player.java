public class Player {
    String Name;
    int age, rating;
    double stat;

    public enum Type {
        BATTING, BOWLING, KEEPING
    };

    private Type type;

    Player() {
    }

    Player(String name, Type toype, int years, double stat, int ratting) {
        Name = name;
        this.type = toype;
        age = years;
        this.stat = stat;
        rating = ratting;
    }

    public Type getType() {
        return type;
    }

    public void getPlayerDetails() {
        System.out.println(" Name :" + Name + "/n Age :" + age + "/n Type :" + type);
    }
}