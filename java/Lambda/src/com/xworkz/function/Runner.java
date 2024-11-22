package com.xworkz.function;
import java.util.function.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class Runner {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);

		};
		consumer.accept(5);
		BiConsumer<String, Integer> biConsumer = (a, b) -> {
			System.out.println(a + b);
		};
		biConsumer.accept("abhi", 22);

		Supplier<Double> suplier = () -> {
			return 50.00;

		};
		Function<String, Integer> function = (d) -> {
			System.out.println(d);
			return 56;

		};
		BiFunction<Integer, String, Integer> biFunction = (a, b) -> {
			System.out.println(a + b);
			return 8;
		};
		biFunction.apply(6, "darshu");

		Predicate<String> predicate = (a) -> {
			System.out.println(a);
			return true;
		};
		predicate.test("Sanvi");

		BiPredicate<Integer, String> biPredicate = (a, b) -> {
			System.out.println(a + b);
			return true;
		};
		biPredicate.test(2, "sudeep");

		UnaryOperator<String> operator = (a) -> {

			return "Hi";
		};
		IntConsumer consumer2 = (a) -> {
			return;

		};
		IntSupplier intSupplier = () -> {
			return 3;
		};
		IntFunction<String> function2 = (a) -> {
			return "x";
		};
		IntPredicate intPredicate = (a) -> {
			return false;
		};
		IntUnaryOperator intUnaryOperator = (a) -> {
			return 5;
		};
		IntBinaryOperator binaryOperator = (a, b) -> {
			return 7;
		};
		LongSupplier longSupplier = () -> {
			return 1L;
		};

		LongFunction<Integer> function3 = (a) -> {
			return 2;
		};

		LongPredicate longPredicate = (a) -> {
			return false;
		};
		LongUnaryOperator longUnaryOperator = (a) -> {
			return 2L;
		};
		LongBinaryOperator binaryOperator1 = (a, b) -> {
			return 3L;
		};

		DoubleConsumer consumer3 = (b) -> {
			return;
		};
		DoubleSupplier doubleSupplier = () -> {
			return 10.00;
		};

		DoubleFunction<Integer> doubleFunction = (a) -> {
			return 3;
		};

		BinaryOperator<Integer> binaryOperator2 = (a, b) -> {
			return 3;
		};
		DoublePredicate doublePredicate = (a) -> {
			return false;
		};
		DoubleUnaryOperator doubleUnaryOperator = (a) -> {
			return 3.00;
		};

		DoubleBinaryOperator binaryOperator3 = (a, b) -> {
			return 5.00;
		};

		ToIntFunction<Integer> function4 = (d) -> {
			return 4;
		};
		ToDoubleFunction<String> doubleFunction2 = (g) -> {
			return 3.00;
		};
		ToLongFunction<Integer> function5 = (g) -> {
			return 8L;
		};
		ToIntBiFunction<Integer, Integer> biFunction2 = (a, b) -> {
			return 3;
		};
		ToDoubleBiFunction<String, String> biFunction3 = (a, b) -> {
			return 3.00;
		};
		ToLongBiFunction<Integer, String> biFunction4 = (a, b) -> {
			return 3L;
		};
		ObjIntConsumer<String> consumer4 = (a, b) -> {
			return;
		};
		ObjDoubleConsumer<Integer> consumer5 = (a, b) -> {
			return;
		};
		ObjLongConsumer<Long> consumer6 = (a, c) -> {
			return;
		};
		IntToDoubleFunction doubleFunction3 = (a) -> {
			return 8.00;
		};
		IntToLongFunction function6 = (a) -> {
			return 5L;
		};
		DoubleToIntFunction doubleToIntFunction = (d) -> {
			return 2;
		};
		LongToIntFunction function7 = (l) -> {
			return 9;

		};
		DoubleToLongFunction doubleToLongFunction = (d) -> {
			return 10L;
		};
		LongToDoubleFunction doubleFunction4 = (k) -> {
			return 9.00;
		};

	}

}
