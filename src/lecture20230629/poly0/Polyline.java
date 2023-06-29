package lecture20230629.poly0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polyline {
	private List<Position> positions;
	
	public Polyline() {
		this.positions = new ArrayList<>();
	}
	
	public List<Position> getPositions() {
		return positions;
	}
	
	public Polyline add(double x, double y) {
		this.add(new Position(x, y));
		return this;
	}
	
	public Polyline add(Position p) {
		this.positions.add(p);
		return this;
	}
		
	public String toString() {
		return this.positions.toString();
	}
	
}
