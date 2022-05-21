public class CreditPaymentService {

    public double calculate(int credit, int month) {

        double results;
        double percent = 9.99 / (100 * 12);
        double degree = Math.pow(1 + percent, -month);
        double z = 1 - degree;

        results = credit * percent / (1 - degree);

        return results;
    }

}
