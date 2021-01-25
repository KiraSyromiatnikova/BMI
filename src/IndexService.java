public class IndexService {
    public double calculate(double height_sm, double weight_kg) {
        double index;
        index = weight_kg /( (height_sm * height_sm) / 10000);
        return index;
    }
}