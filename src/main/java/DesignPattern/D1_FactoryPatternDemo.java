package DesignPattern;

public class D1_FactoryPatternDemo {
	public static void main(String[] args){
		D1_ShapeFactory shapeFactory = new D1_ShapeFactory();
		D1_Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
	}

}
