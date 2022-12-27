public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myCalculate = service.calculate(1.56,50.5);
        System.out.println(myCalculate);
    }
}