package warGame;

public class Card {
	private String name;
	private int value;
	
	public Card(int value, String name) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(name + "Value: " + value);
	}
	
}
//Card is made of Name and of Number (JQK = 10,11,12 A = 1)etc