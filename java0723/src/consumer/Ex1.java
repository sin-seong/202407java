package consumer;

import java.util.function.BiConsumer;//2개일떄
import java.util.function.Consumer; //한개일떄

public class Ex1 {
		public static void main(String[] ar) {
			Consumer<String> consumer = t->System.out.println(t);
			
			consumer.accept("빛이 강할수록 어둠은 짙어진다");
			
			BiConsumer<String, String> consumer2 = (x,y)->
				System.out.println(x+y);
				consumer2.accept("혼자","남았구나");
			
			
		}

}
