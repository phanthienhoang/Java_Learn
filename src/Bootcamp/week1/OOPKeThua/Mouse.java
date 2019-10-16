package Bootcamp.week1.OOPKeThua;

public class Mouse extends Animal {

    private int weight;

    // Constructor mặc định.
    public Mouse() {
        // Gọi tới cấu tử Mouse(int)
        // Call to constructor Mouse(int)
        this(100);
    }

    // Constructor có 1 tham số
    public Mouse(int weight) {
        // Nếu bạn không gọi bất kỳ một super(..) nào.
        // Java sẽ gọi một super() mặc định.
        // super();
        this.weight = weight;
    }

    // Constructor có 2 tham số.
    public Mouse(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getAnimalName() {
        return "Mouse";
    }
}
