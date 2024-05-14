public class App {
    public static void main(String[] args) throws Exception {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println("Computer, which price is R$ " + price1);
        System.out.println("Office desk, which price is R$ " + price2);
        System.out.println("Record: " + age + " yers old, code " + code + " and " + gender);
        System.out.println("Measure with eight decimal places: " + measure);
    }
}
