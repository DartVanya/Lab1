package Lab;

// Класс элемента в контейнере панели
public class item {

	private itemState state;
	protected String color;
	protected String button = "О";
	protected String lamp = "Л";
	protected boolean turned = false;
	
    public void changeState(itemState state) {
        this.state = state;
    }
    public itemState getState() {
    	return state;
    }

	// Конструктор для лампы
	item(String c) {
		this.changeState(new Lamp(this));
		color = c;
	}

	// Конструктор для кнопки
	item() {
    	this.changeState(new Button(this));
	}

	// Печать элемента
	void print(){
    	this.state.print();
	}

	// Получение типа, true = кнопка, false = лампа
	boolean get_type() {
    	return this.state.get_type();
	}

	// Переключение лампы
	void swith() {
    	this.state.swith();
	}
}