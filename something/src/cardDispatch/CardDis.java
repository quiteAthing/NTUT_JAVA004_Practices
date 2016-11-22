package cardDispatch;

public class CardDis {

	public static final int with_joker = 54;
	public static final int without_joker = 52;

	public int[] getCardstack(int with_joker) {
		int jokerExist = with_joker;
		int[] stack = new int[jokerExist];
		for (int k = 0; k < jokerExist; k++) {
			int tmp = (int) (Math.random() * jokerExist) + 1;
			stack[k] = tmp;
			for (int s = 0; s < k; s++) {
				while (tmp == stack[s]) {
					tmp = (int) (Math.random() * jokerExist) + 1;
					System.out.println(tmp);
				}
				stack[k] = tmp;

			}

		}

		return stack;

	}

}
