
public class Vertex {

	public double x;
	public double y;
	
	public Vertex(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	
	public String toString(){
		return "("+x+","+y+")";
		}
	
	public double length() {
		return Math.sqrt(x*x+y*y);
	 }
	
	public Vertex skalarMult(double s){
		return new Vertex(x*s, y*s);
	}
	
	public void skalarMultiMod(double s){
	  x=x*s;
	  y=y*s;
	}
	
	public Vertex add(Vertex vn){
		return new Vertex(x+vn.x,y+vn.y);
	}
	
	public Vertex sub(Vertex vn){
		return new Vertex(x-vn.x,y-vn.y);
	}
		
	public void addMod(Vertex vn){
		x=x+vn.x;
		y=y+vn.y;
	}
	
	public void subMod(Vertex vn){
		x=x-vn.x;
		y=y-vn.y;
	}
	
	public Vertex normalized(){
	  	return new Vertex(this.x/this.length(), this.y/this.length());
	 }
	
	public void normalizedMod(){
		double factor = 1/length();
		x = factor * x;
		y = factor * y;
	}
	
	public double distance(Vertex vn){
		double xx=vn.x-this.x;
		double yy=vn.y-this.x;
				
		return Math.sqrt(xx*xx+yy*yy);
	 }
	
	
	public boolean equals(Object thatObject){
		if(thatObject instanceof Vertex){
			Vertex that = (Vertex)thatObject;
			
			return this.x==that.x && this.y == that.y;
		 }
		return false;
		}
	    
	public double getX(){
		return x;
		}
	
	public double getY(){
		return y;
		}
	
	public void setX(double x){
		this.x=x;
		}
	
	public void setY(double y){
		this.y=y;
		}
	


}
