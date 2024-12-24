package org.example;

class Apple {}
class Banana {}

class FruitBox <T> {
    private T[] fruit;

    public FruitBox(T[] fruit) {
        this.fruit = fruit;
    }

    public T getFruit(int index) {
        return fruit[index];
    }
}

class FruitBox2 {
    // 모든 클래스 타입을 받기 위해 최고 조상인 Object 타입으로 설정
    private Object[] fruit;

    public FruitBox2(Object[] fruit) {
        this.fruit = fruit;
    }

    public Object getFruit(int index) {
        return fruit[index];
    }
}

interface AddInterface<T> {
    public T add(T x, T y);
}

class Calculator<T extends Number> {
    void add(T a, T b) {}
    void multiply(T a, T b) {}
    void divide(T a, T b) {}
    void minus(T a, T b) {}
}

public class Generic {
    // 제네릭 메소드: 메소드 선언부에 <T>로 타입 정의
    public static <T> void print(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
//        Apple[] arr = {
//                new Apple(),
//                new Apple()
//        };
//        FruitBox2 box = new FruitBox2(arr);
//
//        Apple apple = (Apple) box.getFruit(0);
//        Banana banana = (Banana) box.getFruit(1);

//        FruitBox<Apple> box = new FruitBox<>(arr);
//
//        Apple apple = (Apple) box.getFruit(0);
//        Banana banana = (Banana) box.getFruit(1);
//        Sample<String> sample = new Sample<>();
//        sample.addElement("This is string", 5);
//        System.out.println(sample.getElement(5));

//        AddInterface<Integer> o = (x, y) -> x + y;
//        System.out.println(o.add(10, 20));

//        print(10);
//        print("Hello");
//        Calculator<Integer> calculator1 = new Calculator<Integer>();

        // 오류
//        Calculator<String> calculator2 = new Calculator<String>();
        Generic.<Integer>print(10);
        print(20);
        print("Hello");
    }
}
