package whileLoop;

public class WhileNumberPlayer {

	private int num;

	public WhileNumberPlayer(int num) {
		this.num = num;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while (i * i < num) {
			System.out.print(i * i + " ");
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < num) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
