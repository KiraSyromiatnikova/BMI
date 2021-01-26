public class IndexService {
    public double calculate(double heightSm, double weightKg) {
        double index;
        index = weightKg / ((heightSm * heightSm) / 10000);
        return index;
    }
}