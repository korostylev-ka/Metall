package armatura;

public class Armatura {
    private int diametr;
    private double weight;
    private double lengthOfRod;
    public Armatura(int diametr, double weight) {
        this.diametr = diametr;
        this.weight = weight;
    }
    public String toString() {
        return "Арматура " + diametr;
    }
    public Double toCalcWeight(int l) { //метод расчета массы по длине
        return weight * l;
    }
}
