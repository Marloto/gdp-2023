package lecture20230629.poly6;

import java.util.Iterator;

public class PolylinePart implements Iterable<Position> {
	
	private Polyline line;
	private double length;

	public PolylinePart(double length, Polyline line) {
		this.length = length;
		this.line = line;
	}

	public Iterator<Position> iterator() {
		return new PolylinePartIterator(length, this.line.getPositions());
	}

}
