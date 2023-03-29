import model.Fruit;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit fr = new Fruit();
        fr.setName(sc.nextLine());
        if (Objects.equals(fr.getName(), "Банан")){
            System.out.println("Банан");
            fr.setPrice(20);
            System.out.println("Цена фрукта: " + fr.getPrice() + " com");
            System.out.println("Введите нужную массу фрукта");
            fr.setQolich(sc.nextInt());
            System.out.println("Наименование фрукта: " + fr.getName() +"\nЦена: " + fr.getPrice()+" com" + "\nМасса: " + fr.getQolich() + "kg\nС вас: " + fr.getPrice() * fr.getQolich() + " com");

        } else {
            System.out.println("Введен не правильный фрукт!");
        }
        }
    }