package dal.gravity;

public class GravityConstant implements GravityModel {

	private double g;
	
	public GravityConstant() {
	
	}
	
	public GravityConstant(double g) {
		g = this.g;
	}
	
	@Override
	public double getGravitationField() {
		return g;
	}
	
	public void setGravitationField(double g) {
		g = this.g;
	}

}
