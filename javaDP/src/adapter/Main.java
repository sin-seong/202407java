package adapter;

public class Main {
	public static void main(String[] ar) {
		Print p = new PrintBanner("Hello");
		p.prinWeak();
		p.prinStrong();
	}
}
