package lecture20230629.poly7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 1. Schritt Iterable implementieren
// 2. iterator() : Iterator<T>

public class Polyline implements Iterable<Position> {
	private List<Position> positions;
	
	public Iterator<Position> iterator() {
		 return positions.iterator();
	}
	
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
	
	public Polyline scale(double factor) {
		Polyline line = new Polyline();
		for(Position p : this) {
			line.add(p.mul(factor));
		}
		return line;
	}
	
	public Polyline stopAfter(double f) {
		Iterable<Position> it = () -> new PolylinePartIterator(f, this.positions); 
		
		Polyline polyline = new Polyline();
		for(Position p : it) {
		    polyline.add(p);
		}
		return polyline;
	}
	
	public String toString() {
		return this.positions.toString();
	}
	
}
