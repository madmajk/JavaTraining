public class Homework {
	public static void main(String[] args) {

		// Zadanie 1 - Prosta logika

		boolean lhs = true;
		boolean rhs = true;

		System.out.println((!(lhs && rhs)) == ((!lhs) || (!rhs)));
		System.out.println((!(lhs || rhs)) == ((!lhs) && (!rhs)));

		System.out.println(lhs && rhs == lhs || !rhs);
		System.out.println(lhs && !rhs == !lhs || !rhs);
		System.out.println((!lhs && rhs) == (!lhs || !rhs));
		System.out.println((!lhs && !rhs) == (!lhs || !rhs));

		System.out.println(lhs || rhs == lhs && rhs);
		System.out.println(lhs || !rhs == lhs && rhs);
		System.out.println(!lhs ||rhs == lhs && rhs);
		System.out.println((!lhs || !rhs) == (lhs && !rhs));

		// Zadanie 2 - Priorytety i łączność

		int varInt0 = 100;
		int varInt1 = 1000;

		System.out.println(1 + ((2 * 3) * 4));
		System.out.println((1 + (2 * 3)) == (5 * 6) / 7 == (false));
		System.out.println(varInt0 = varInt1 -= (1 + 2 / (3 * 4)));
		System.out.println((!lhs) && (rhs) == ((!lhs) || (!rhs)));
		System.out.println(1 + 2 < 3 ? (4 * 5) : (6 / 7));
	}
}
