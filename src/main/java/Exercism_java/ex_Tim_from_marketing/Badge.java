package Exercism_java.ex_Tim_from_marketing;

public class Badge {
    public static String print(Integer id, String name, String department) {
        if (department == null) {
            department = "OWNER";
        }
        if (id == null) {
            return String.format("%s - %s", name, department.toUpperCase());
        } else return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(print(554, "capi", "prodavec"));
    }
}

//второй вариант выполнения, более быстрый
class Badge2 {
    public static String print(Integer id, String name, String department) {
        if (department == null) {
            department = "OWNER";
        }
        department = department.toUpperCase();

        if (id == null) {
            return name + " - " + department;
        } else {
            return "[" + id + "] - " + name + " - " + department;
        }
    }
}