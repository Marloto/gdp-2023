package lecture20230629.poly7;

public class Position {
	private final double x;
	private final double y;

	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Position add(Position other) {
		return new Position(x + other.x, y + other.y);
	}

	public Position sub(Position other) {
		return new Position(x - other.x, y - other.y);
	}

	public Position mul(double f) {
		return new Position(x * f, y * f);
	}

	public Position div(double f) {
		return new Position(x / f, y / f);
	}

	public double sqrMagnitude() {
		return x * x + y * y;
	}

	public double magnitude() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double distanceTo(Position p) {
		return p.sub(this).magnitude();
	}
	
	public Position normalize() {
		return this.div(this.magnitude());
	}

	public String toString() {
		return x + "/" + y;
	}
	
	public static void main(String[] args) {
		Position position = new Position(10, 0);
		Position position2 = position.add(new Position(10, 0));
		double distanceTo = position2.distanceTo(position);
		System.out.println(distanceTo);
	}

}







