
public class GeometricObject {

	Vertex pos;
	public double height;
	public double width;
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public Vertex getPos(){
		return pos;
	}
	
	public GeometricObject(double height, double width, Vertex pos){
		this.pos=pos;
		this.height=height;
		this.width=width;
		
		if(width<0){
			width=-width;
			pos.x=pos.x -width;
		}
		if(height<0){
			height=-height;
			pos.y=pos.y -height;
		}
		
	}
	
	
}
