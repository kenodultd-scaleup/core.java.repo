package encapsulation;

public class Camera {

	private String cameraName;
	private boolean canSnap;
	private long zoomLenght;
	
	
	public Camera (String cameraName, boolean canSnap, long zoomLenght) {
		this.cameraName = cameraName;
		this.canSnap = canSnap;
		this.zoomLenght = zoomLenght;
	}
	
	//Getter
	public long getZoomLenght() {
		return zoomLenght;
	}
	
	//Setter
	public void setZoomLenght(long zoomLenght) {
		this.zoomLenght = zoomLenght;
	}
	
	//Getter 
	public String getCameraName() {
		return cameraName;
	}
	
	//Setter 
		public void setCameraName(String cameraName) {
			this.cameraName = cameraName;
		}
	public void canCameraSnap () {
		System.out.println(canSnap);
	}
}
