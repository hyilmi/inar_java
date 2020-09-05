package chapter7;

public class Exercise07_23 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		// all lockers closed
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
		}

		for (int ST = 1; ST <= lockers.length; ST++) {
			for (int LK = 0; LK < lockers.length; LK += ST) {
				if (lockers[LK]) {
					lockers[LK] = false;
				} else {
					lockers[LK] = true;
				}
			}
		}
		System.out.println("Open lockers: ");
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.println("Locker " + (i + 1));
			}
		}

	}

}
