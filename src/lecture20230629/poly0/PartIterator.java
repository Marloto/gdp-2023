package lecture20230629.poly0;

import java.util.Iterator;
import java.util.List;

public class PartIterator implements Iterator<Position>{

    private int index;
    private double targetDistance;
    private List<Position> position;
    
    public PartIterator(double target, List<Position> position) {
        this.targetDistance = target;
        this.position = position;
    }
    
    public boolean hasNext() {
        return index < this.position.size() &&
               targetDistance > 0;
    }

    public Position next() {
        // 0. erster durchlauf, wenn index == 0
        if(index == 0) {
            // ++ Operator: erst zurückgeben (0)
            //              danach erhöhen
            return this.position.get(index ++);
            // new Position(0,0);
        }
        // 1. die distanz zum nächsten Punkt passt
        //    in die restliche targetDistanz
        
        Position a = this.position.get(index - 1);
        Position b = this.position.get(index);
        index ++;
        // ggf. ist b == null
        double distanceTo = b.distanceTo(a);
        if(targetDistance >= distanceTo) {
            targetDistance -= distanceTo;
            return b;
        } else {
            Position res = b.sub(a).normalize().mul(targetDistance).add(a);
            targetDistance = 0;
            return res;
        }
    }

}
