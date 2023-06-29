package lecture20230629.poly0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polyline implements Iterable<Position> {
	private List<Position> positions;
	
	// attribut mit setter
	
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
	
	public Iterable<Position> part(double distance) {
	    return () -> new PartIterator(distance, positions);
	}

    public Iterator<Position> iterator() {
        return this.positions.iterator();
    }
	
}
