public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int a = 1_000_000;
        int x = 12;
        int y = 24;
        int z = 36;

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту с расчётом на 1 год:");
        System.out.println((int) service.calculate(a, x));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту с расчётом на 2 года:");
        System.out.println((int) service.calculate(a, y));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту с расчётом на 3 года:");
        System.out.println((int) service.calculate(a, z));


    }
}
