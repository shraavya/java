
public class CylinderN extends CirlceN{
	private int height;
	public CylinderN(int rad, int h){
		super(rad);
		height = h;
	}
	
	public double getVolume(){
		return height* super.getArea();
	}

}
