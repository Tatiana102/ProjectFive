public class BmiService {

    public int calculate(int weightKG, double heightMeters) {
        return (int) (weightKG / (heightMeters * heightMeters));
    }
}
