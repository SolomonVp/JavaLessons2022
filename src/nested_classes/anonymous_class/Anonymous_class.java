package nested_classes.anonymous_class;

// Anonymous класс не имеет имени
// Anonymous класс - это "объявление " класса и одновременное создание объекта
// В анонимных классах невозможно написать конструктор
// Anonymous класс может обращаться даже к private элементам внешнего класса
// Lambda expression - это краткая форма для написания анонимных классов


public class Anonymous_class {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(3, 6));

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(3, 6));
    }
}

interface Math {
    int doOperation(int a, int b);
}
