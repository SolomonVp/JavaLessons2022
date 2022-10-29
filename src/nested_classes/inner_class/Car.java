package nested_classes.inner_class;



// Каждый объект внешнего класса всегда ассоциируется с объектом внешнего класса.
// Создавая объект inner класс, нужно перед этим создать объект его внешнего класса.
// inner класс может содержать только non-static элементы
// inner класс может обращаться даже к private элементам внешнего класса
// Внешний класс может обращаться даже к private элементам inner класса, прежде создав его обьект


public class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);

    }

    @Override
    public String toString() {
        return "\nMy car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public class Engine {
        private int horsePower;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

//        Car.Engine engine2 = new car.Engine(150);

//        Car.Engine engine3 = new Car("yelow", 4).new Engine(200);
    }
}
