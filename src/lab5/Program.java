package lab5;

public class Program {
    static void main(String[] args) {
        double investment = 100;
        int years = 0;
        double yearlyInterestRate = 0.05;
        while (investment < 200) {
            investment += investment * yearlyInterestRate;
            years++;
        }
        System.out.println("It took " + years + " years to double your money");
    }
}
