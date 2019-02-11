import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> telBook = new HashMap<String, ArrayList<String>>();

    telBook.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000", "500 +8 800 200 600")));
    telBook.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
    telBook.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите имя:");
    String name = scanner.nextLine();
    if (telBook.containsKey(name)){
      ArrayList<String> phone = telBook.get(name);

      System.out.println("Перечень телефонов");

      for (int i = 0; i < phone.size(); i++) {
        System.out.println((i + 1) + ". " + phone.get(i));
      }

    }else System.out.println("Такого ФИО в БД нет");
  }
}
