public class Main {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        double weight_kg = 49;
        double height_sm = 167;
        double index = service.calculate(167.5, 49.5);
        System.out.println(index);
    }
}