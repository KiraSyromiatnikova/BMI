public class Main {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        double weightKg = 49;
        double heightSm = 167;
        double index = service.calculate(167, 50);
        System.out.println(index);
    }
}