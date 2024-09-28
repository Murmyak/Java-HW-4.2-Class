//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // Входные данные
        double weightKg = 69;
        double heightMeters = 1.69;

        int bmi = service.calculate(weightKg, heightMeters);

        System.out.println("Индекс массы тела (BMI): " + bmi);
    }
}