public class BmiService {
    public double calculate(double weightKG, double heightM) {
        double bmi = weightKG / (heightM * heightM);
        return (double) bmi;
    }
}
