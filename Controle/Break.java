package Controle;

public class Break {
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		if(i == 5) {
			break;
			//ele para a repetição no 5
		}
		System.out.println(i);
	}
}
}
