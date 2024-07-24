package p439;

public class Main {
	
	public static void main(String[] ar) {
		Button button = new Button();
		button.setOnClickListener(new CallListener2());
		button.touch();
	}

}
