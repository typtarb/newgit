package www.sohu.com;

public class Store {
	public Food getFood(String type, Factory factory) {
		return factory.craeteFood(type);
	}
}
