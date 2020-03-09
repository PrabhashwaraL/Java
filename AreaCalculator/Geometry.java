
public class Geometry {
	
	public double getAreaOfCircle( double rad ) {
		
		if( rad >= 0 )
			return Math.PI * rad * rad;
		else
			return -1;
		
	}
	
	public double getAreaOfRectangle( double w, double h) {
		
		if( w >= 0 && h >= 0)
			return w * h;
		else
			return -1;
	}
	
	public double getAreaOfTriangle( double b, double h) {
		
		if ( b >= 0 && h >= 0)
			return 0.5 * b * h;
		else
			return -1;
		
	}

}
