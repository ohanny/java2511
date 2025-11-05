
public class DrawingApp {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.red = 100;
		shape.green = 96;
		shape.blue = 51;
		
		
		ColorTool tool = new ColorTool();

		System.out.println(shape.red + ", " + shape.green + ", " + shape.blue);
		
		tool.lighter(shape);
		
		System.out.println(shape.red + ", " + shape.green + ", " + shape.blue);
	}
}
