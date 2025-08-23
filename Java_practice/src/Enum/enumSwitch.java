package Enum;

public class enumSwitch {

	enum Level{High, Low, Medium}
	public static void main(String[] args) {
		Level l=Level.Medium;
		switch(l) {
		case Low: System.out.println("Low level");
		break;
		case Medium: System.out.println("Medium level");
		break;
		case High: System.out.println("High level");
		break;
		}

	}

}
