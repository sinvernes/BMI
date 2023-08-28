public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(98, 1.87);
        int index = (int) bmi;

        System.out.println("BMI: " + index);

    }
}
