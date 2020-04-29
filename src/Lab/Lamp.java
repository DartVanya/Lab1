package Lab;

public class Lamp extends itemState {

	Lamp(item Item) {
		super(Item);
	}

	@Override
	public void print() {
		if(Item.turned)
			System.out.print(Item.lamp + '_' + Item.color);
		else
			System.out.print(Item.lamp);
	}
	public boolean get_type() {
		return false;
	}
	public void swith() {
		Item.turned = !Item.turned;
	}
 
}
