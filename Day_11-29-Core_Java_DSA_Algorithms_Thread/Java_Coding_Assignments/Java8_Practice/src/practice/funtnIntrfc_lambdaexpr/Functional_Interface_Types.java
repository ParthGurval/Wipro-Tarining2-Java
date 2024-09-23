package practice.funtnIntrfc_lambdaexpr;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interface_Types {

	public static void main(String[] args) {
        // 1. Consumer: Represents an operation that takes a single input argument and returns no result.
        // It's typically used for operations that produce side effects.
        Consumer<String> printConsumer = str -> System.out.println("Consumer: " + str);
        printConsumer.accept("Hello, Consumer!");

        // 2. Supplier: Represents a supplier of results. It takes no arguments and returns a result.
        // It's typically used for providing values or objects.
        Supplier<String> stringSupplier = () -> "Hello from Supplier!";
        String result = stringSupplier.get();
        System.out.println("Supplier: " + result);

        // 3. Predicate: Represents a predicate (boolean-valued function) of one argument.
        // It's used for testing conditions.
        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean check = isEven.test(10);
        System.out.println("Predicate: Is 10 even? " + check);

        // 4. Function: Represents a function that accepts one argument and produces a result.
        // It's typically used for transforming or processing data.
        Function<String, Integer> stringLengthFunction = str -> str.length();
        int length = stringLengthFunction.apply("Hello, Function!");
        System.out.println("Function: Length of 'Hello, Function!' is " + length);
    }
}
