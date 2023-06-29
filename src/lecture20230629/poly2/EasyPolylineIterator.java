package lecture20230629.poly2;

import java.util.Iterator;
import java.util.List;

public class EasyPolylineIterator implements Iterator<Position> {
	private int current;
	private List<Position> positions;
	
	public EasyPolylineIterator(List<Position> positions) {
		this.positions = positions;
		this.current = 0;
	}
	
	public boolean hasNext() {
		return this.current < this.positions.size();
	}

	public Position next() {
	    return this.positions.get(this.current ++);
	}

}
