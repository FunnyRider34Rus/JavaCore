package Lesson11.Fruit;

public class Warehouse {
    public static void run(){

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);//ложим в 1ую коробку 3и яблока

        box2.addFruit(orange);
        box2.addFruit(orange);//ложим в 2ую коробку 2и апельсина

        System.out.println("Вес первой коробки: " + box1.getWeight());
        System.out.println("Вес второй коробки: " + box2.getWeight());

        if (box2.compare(box1)){//сравниваем вес 1ой и 2ой коробки
            System.out.println("Вес 1ой и 2ой коробки одинаковый");
        }

        box1.moveToAnotherBox(box3);//перемещаем фрукты из 1ой коробки в 3ю
        System.out.println("Вес первой коробки: " + box1.getWeight());
        System.out.println("Вес третьей коробки: " + box3.getWeight());

    }
}
