package nested_classes.static_nested_class;

// static nested класс очень похож на обычный внешний класс, но находится внутри другого класса.
// Создавая обьект static nested класса, нужно указывать и класс, содержащий его
// static nested может содержать static и nonStatic элементы
// static nested может обращаться даже к private переменным внешнего класса
// внешний класс может обращаться даже к private элементам nested класса

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);

    }

    @Override
    public String toString() {
        return "\nMy car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine  extends Z{
        private int horsePower;
        static int countOfObjects;


        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }
        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine1 = new Car.Engine(256);
        System.out.println(engine1);

        Car car = new Car("red", 2, engine1);
        System.out.println(car);
    }
}

class Z {

}
