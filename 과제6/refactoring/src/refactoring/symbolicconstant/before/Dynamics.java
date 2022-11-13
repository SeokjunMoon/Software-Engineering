package refactoring.symbolicconstant.before;

public class Dynamics {
	public static final double 중력가속도 = 9.81;
	public double getPotentialEnergy(final double mass, final double height) {
		return mass * 중력가속도 * height;
	}
	public double getWeight(final double mass) {
		return mass * 중력가속도;
	}
}
