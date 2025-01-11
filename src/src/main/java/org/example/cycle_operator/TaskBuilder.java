package org.example.cycle_operator;

public class TaskBuilder {

    int input_number;
    int counter_digits = 0, sum_of_digits = 0;

    public TaskBuilder() {
        this.input_number = input_number;
    }

    public void raschetchik(int input_number){
        do {
            sum_of_digits += input_number % 10;
            counter_digits += 1;
            input_number /= 10;
        }
        while (input_number > 0);
        System.out.println(counter_digits + " " + sum_of_digits);
    }

    public int getCounter_digits() {
        return counter_digits;
    }

    public int getInput_number() {
        return input_number;
    }

    public static void main(String[] args) {
        TaskBuilder task236 = new TaskBuilder();
        task236.raschetchik(4258);
//        int inputNumber = task236.getInput_number();
//        System.out.println(inputNumber);
    }


}