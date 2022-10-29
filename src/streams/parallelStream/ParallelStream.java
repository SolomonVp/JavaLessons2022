package streams.parallelStream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("sunResult = " + sumResult);
        System.out.println("-----------------------------------------------------------------------------------------");

        double sumResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("sunResult1 = " + sumResult1);
        System.out.println("-----------------------------------------------------------------------------------------");

        double divisionResult = list.stream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("divisionResult = " + divisionResult);
        System.out.println("-----------------------------------------------------------------------------------------");

        double divisionResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("divisionResult1 = " + divisionResult1 + "!!!! This is not correct!");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
