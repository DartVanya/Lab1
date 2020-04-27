package Lab;

public class Button extends itemState {

	Button(item Item) {
		super(Item);
	}

	@Override
	public void print() {
		System.out.print(Item.button);
	}
	public boolean get_type() {
		return true;
	}
	public void swith() {
		Item.turned = !Item.turned;
		if(Item.button == "Î")
			Item.button = "î";
		else
			Item.button = "Î";
	}
 
}
