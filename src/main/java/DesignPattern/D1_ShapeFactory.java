package DesignPattern;

public class D1_ShapeFactory {
	public D1_Shape getShape(String shapeType){
		if(shapeType==null)
			return null;
		else if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new D1_Circle();
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new D1_Square();
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new D1_Rectangle();
		return null;
	}

}
