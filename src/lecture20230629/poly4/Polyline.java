package lecture20230629.poly4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polyline implements Iterable<Position> {
	private List<Position> positions;
    private double maxLength;
	
	public Iterator<Position> iterator() {
		 return new PolylinePartIterator(this.maxLength, positions);
	}
	
	public Polyline(double maxLength) {
		this.maxLength = maxLength;
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
