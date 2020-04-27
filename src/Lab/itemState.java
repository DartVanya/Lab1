package Lab;

public abstract class itemState {
	item Item;
	itemState(item Item){
		this.Item = Item;
	}
	public abstract void print();
	public abstract void swith();
	public abstract boolean get_type();
}

