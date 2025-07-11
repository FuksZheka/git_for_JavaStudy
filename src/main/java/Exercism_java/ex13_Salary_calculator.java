package Exercism_java;

public class ex13_Salary_calculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int baseSalary = 1000;
        double result = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        result = result < 2000.0 ? result : 2000.0;
        return result;
    }
}