package firstProgram;

public class Multiplication {

	void printTable() {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
	}

	void printTable(int tableNum) {

		printTable(tableNum, 1, 10);
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d * %d = %d", tableNum,
		 * i, tableNum * i).println(); }
		 */
	}

	void printTable(int tableNum, int firstNum, int lastNum) {
		for (int i = firstNum; i <= lastNum; i++) {
			System.out.printf("%d * %d = %d", tableNum, i, tableNum * i).println();
		}
	}
}
