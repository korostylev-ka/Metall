import armatura.Armatura;
import corner.Corner;

public class Main {
    public static void main(String[] args) {
        Armatura a8 = new Armatura(8, 0.395);
        System.out.println(a8);
        System.out.println(a8.toCalcWeight(6));
        Corner cr50 = new Corner(50, 5, 3.77);
        System.out.println(cr50);

    }
}
