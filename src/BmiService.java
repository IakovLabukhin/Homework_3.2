public class BmiService {
    public int calculate(double weightKilograms, double heightMeters) {
        return (int) (weightKilograms / (heightMeters * heightMeters));
    }
}