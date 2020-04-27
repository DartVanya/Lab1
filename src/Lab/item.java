package Lab;

// Класс элемента в контейнере панели
public class item {
	
	private itemState state;
	
	String color;
	String button = "О";
	String lamp = "Л_";
	boolean turned;
	
	
    public void changeState(itemState state) {
        this.state = state;

    }
    public itemState getState() {
        return state;
    }

	
	// Конструктор для лампы
	item(boolean t, String c) {
		this.changeState(new Lamp(this));
		color = c;
		turned = false;
	}
	// Для кнопки
	item(boolean t) {
		turned = false;
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