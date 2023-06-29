package lecture20230629.poly7;

import java.util.Iterator;
import java.util.List;

public class PolylinePartIterator implements Iterator<Position> {

	private int current;
	private List<Position> positions;
	private double targetDistance;
	
	public PolylinePartIterator(double targetDistance, List<Position> positions) {
		this.positions = positions;
		this.current = 0;
		this.targetDistance = targetDistance; 
		// this.get(index), this.size(), usw...
	}
	
	/**
	 * Iterator it = ...iterator();
	 * while(it.hasNext()) {
	 *   T element = it.next();
	 *   // ...
	 * }
	 * 
	 * vgl.
	 * 
	 * for(T element : someIterable) {
	 *   // ...
	 * }
	 * 
	 * vgl.
	 * 
	 * while(current < positions.size()) {
	 *   T element = positions.get(current ++);
	 *   // ...
	 * }
	 */
	
	public boolean hasNext() {
		return this.current < this.positions.size() && targetDistance > 0;
	}

	public Position next() {
		if(this.current == 0) {
			return this.positions.get(this.current ++);
		}
		
		Position before = this.positions.get(this.current - 1);
		Position actual = this.positions.get(this.current);
		this.current ++;
				
		double distanceTo = actual.distanceTo(before);
		if(distanceTo >= targetDistance) {
			Position newPos = actual.sub(before).normalize().mul(targetDistance).add(before);
			this.targetDistance = 0;
			return newPos;
		} else {
			this.targetDistance -= distanceTo;
			return actual;
		}
	}

}
