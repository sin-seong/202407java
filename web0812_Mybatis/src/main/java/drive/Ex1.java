package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = dao.getProductById(3);
		System.out.println(product);
	}

}
