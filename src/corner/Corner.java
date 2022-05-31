package corner;

public class Corner {
    private int width;
    private int depth;
    private double weight;
    public Corner(int width, int depth, double weight) {
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }
    public String toString() {
        return "Уголок " + width + "х" + width + "х" + depth;
    }

}
