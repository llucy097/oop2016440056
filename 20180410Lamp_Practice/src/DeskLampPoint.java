
public class DeskLampPoint {
	
	//field
	private boolean isOn; //boolean type�� ���� �̸��� is�� �����ϴ� ��찡 ��ټ�
	
	//method
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if (isOn) {
			return "�����ֽ��ϴ�.";
		}
		else {
			return "�����ֽ��ϴ�.";
		}
	}

}
