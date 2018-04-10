
public class DeskLampPoint {
	
	//field
	private boolean isOn; //boolean type의 변수 이름은 is로 시작하는 경우가 대다수
	
	//method
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if (isOn) {
			return "켜져있습니다.";
		}
		else {
			return "꺼져있습니다.";
		}
	}

}
