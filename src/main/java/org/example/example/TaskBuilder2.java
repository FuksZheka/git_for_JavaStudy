package org.example.CodeWarsJava.main.java.org.example;

public class TaskBuilder2 {
    int input_digit1;
    int input_digit2;
    String capi;
    int counter_digits = 0, sum_of_digits = 0;
    int another_digit1;


    TaskBuilder2(String capi,int another_digit1){
        this.capi = capi;
        this.another_digit1 = another_digit1;
    }
    public int getAnother_digit1() {
        return another_digit1;
    }

    public int getInput_digit2() {
        return input_digit2;
    }

    public void setInput_digit1(int input_digit1) {
        this.input_digit1 = input_digit1;
    }

    public void setInput_digit2(int input_digit2) {
        this.input_digit2 = input_digit2;
    }

    public void sum(int i1, int i2){
        this.input_digit1 = i1;
        this.input_digit2= i2;
        System.out.println(i1+i2);
    }

    public static void main(String[] args) {
        TaskBuilder2 taskBuilder2 = new TaskBuilder2("real_capibruh", 15);
        taskBuilder2.sum(taskBuilder2.getAnother_digit1(), 15);
        taskBuilder2.setInput_digit2(12);
        taskBuilder2.sum(taskBuilder2.getInput_digit2(), taskBuilder2.getInput_digit2());
    }
}
