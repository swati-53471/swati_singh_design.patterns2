package bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape sq = new Square(new GreenColor());
		sq.applyColor();
	}

}