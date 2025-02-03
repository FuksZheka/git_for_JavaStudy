package org.example.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AtTrainee {
    public static void workerSorter() {
        List<Map<String, String>> list = new ArrayList<>();

        list.add(Map.of(
                ColumnName.NAME.getValue(), "Кирилл",
                ColumnName.AGE.getValue(), "26",
                ColumnName.JOBTITLE.getValue(), "middle java dev",
                ColumnName.SALARY.getValue(), "150000 руб"));
        list.add(Map.of(
                ColumnName.NAME.getValue(), "Виталий",
                ColumnName.AGE.getValue(), "28",
                ColumnName.JOBTITLE.getValue(), "senior automation QA",
                ColumnName.SALARY.getValue(), "1000 $"));
        list.add(Map.of(
                ColumnName.NAME.getValue(), "Александр",
                ColumnName.AGE.getValue(), "31",
                ColumnName.JOBTITLE.getValue(), "jun func tester",
                ColumnName.SALARY.getValue(), "50000 руб"));
        list.add(Map.of(
                ColumnName.NAME.getValue(), "Дементий",
                ColumnName.AGE.getValue(), "35",
                ColumnName.JOBTITLE.getValue(), "devops",
                ColumnName.SALARY.getValue(), "1500 $"));

        list.stream().filter(employer -> {
            String ageism = employer.get(ColumnName.AGE.getValue());
            int intAge = Integer.parseInt(ageism);
            return intAge < 30;
        }).forEach(employer -> {
            String nameOfYoung = employer.get(ColumnName.NAME.getValue());
            System.out.println(nameOfYoung);
        });
// Альтернативное решение пункта 1
        List<String> names = new ArrayList<>();
        for (Map<String, String> employer : list) {
            String ageism = employer.get(ColumnName.AGE.getValue());
            int intAge = Integer.parseInt(ageism);
            if (intAge < 30) {
                //System.out.println(employer.get(ColumnName.NAME.getValue()));
                names.add(employer.get(ColumnName.NAME.getValue()));
            }
        }
        //Решение пункта 3
        List<Integer> averageAge = new ArrayList<>();
        list.stream().forEach(employer -> {
            String age2 = employer.get(ColumnName.AGE.getValue());
            int intAge2 = Integer.parseInt(age2);
            averageAge.add(intAge2);
        });
        int intSum = averageAge.stream().mapToInt(Integer::intValue).sum();
        int result = intSum / averageAge.size();
        System.out.println(result);

        List<String> names2 = new ArrayList<>();
        list.stream().filter(employer -> {
            String currency = employer.get(ColumnName.SALARY.getValue());
            return currency.contains("руб");
        }).forEach(employer -> {
            String rubleEmployer = employer.get(ColumnName.NAME.getValue());
            names2.add(rubleEmployer);
        });
        System.out.println(names2);
    }

}

enum ColumnName {

    NAME("ИМЯ"), AGE("Возраст"), JOBTITLE("Должность"), SALARY("Зарплата");
    private final String value;

    ColumnName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}



