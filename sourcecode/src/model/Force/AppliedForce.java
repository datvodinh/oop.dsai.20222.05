package model.force;

public class AppliedForce extends Force {
	public static final double ABSOLUTE_MAX_APPLIEDFORCE = 500; // Absolute maximum applied force value

	public AppliedForce(double magnitude) {
		super(magnitude);
	}

	@Override
	public void setMagnitude(double magnitude) {
		// Cap the magnitude value within the absolute maximum applied force range
		double cappedValue = Math.max(Math.min(magnitude, ABSOLUTE_MAX_APPLIEDFORCE), -ABSOLUTE_MAX_APPLIEDFORCE);
		super.setMagnitude(cappedValue);
	}
}
