package Lab;

// ����� �������� � ���������� ������
public class item {
	
	private itemState state;
	
	String color;
	String button = "�";
	String lamp = "�_";
	boolean turned;
	
	
    public void changeState(itemState state) {
        this.state = state;

    }
    public itemState getState() {
        return state;
    }

	
	// ����������� ��� �����
	item(boolean t, String c) {
		this.changeState(new Lamp(this));
		color = c;
		turned = false;
	}
	// ��� ������
	item(boolean t) {
		turned = false;
		this.changeState(new Button(this));
	}
	
	// ������ ��������
	void print(){
		this.state.print();
	}
	// ��������� ����, true = ������, false = �����
	boolean get_type() {
		return this.state.get_type();
	}
	// ������������ �����
	void swith() {
		this.state.swith();
	}
}