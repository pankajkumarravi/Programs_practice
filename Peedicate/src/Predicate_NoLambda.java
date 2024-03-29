import java.util.function.IntPredicate;

public class Predicate_NoLambda {
	public static void main(String[] args) {
		IntPredicate intPredicate = new IntPredicate() {

			@Override
			public boolean test(int value) {
				if (value < 18)
					return true;
				else
					return false;
			}
		};
		System.out.println(intPredicate.test(20));
	}
}
