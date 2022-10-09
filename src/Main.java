public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" " + firstName+" " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        System.out.println("Задание № 2");
        System.out.println();
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
        System.out.println();
        System.out.println("Задание № 3");
        System.out.println();
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        String fullName3 = lastName2+" " + firstName2+" " + middleName2;
        fullName3 = fullName3.replace ("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);


    }
}