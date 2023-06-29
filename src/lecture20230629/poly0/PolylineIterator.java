package lecture20230629.poly0;

import java.util.Iterator;
import java.util.List;

public class PolylineIterator implements Iterator<Position> {

    private int index;
    private List<Position> positions;
    
    public PolylineIterator(List<Position> positions) {
        this.positions = positions;
    }

    public boolean hasNext() {
        // index < laenge von liste
        return index < this.positions.size();
    }

    public Position next() {
        // an dem index zurückgeben
        // zuerst erhöhen
        return this.positions.get(index ++);
    }
    
    /*
     * while(hasNext()) {
     *   next();
     * }
     */

}
