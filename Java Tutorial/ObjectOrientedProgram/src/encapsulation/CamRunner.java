package encapsulation;

public class CamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camera panasonic = new Camera("Panasonic", true, 35);
		panasonic.canCameraSnap();
		panasonic.setZoomLenght(18l);
	}

}