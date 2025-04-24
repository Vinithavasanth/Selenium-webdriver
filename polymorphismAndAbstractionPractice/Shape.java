package polymorphismAndAbstractionPractice;

public class Shape {
	public void drawShape(String shapeName) {
		switch (shapeName.toLowerCase()) {
		case "circle":
			System.out.println("Drawing a Circle");
			break;
		case "rectangle":
			System.out.println("Drawing a Rectangle");
			break;
		case "triangle":
			System.out.println("Drawing a Triangle");
			break;
		default:
			System.out.println("Unknown shape: " + shapeName);
		}
	}

	public static void main(String[] args) {
		Shape drawer = new Shape();
		drawer.drawShape("circle");
		drawer.drawShape("rectangle");
		drawer.drawShape("triangle");
		drawer.drawShape("hexagon");
	}
}
