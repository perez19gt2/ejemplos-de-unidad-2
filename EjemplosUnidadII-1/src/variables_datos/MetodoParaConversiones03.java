package variables_datos;

public class MetodoParaConversiones03 {
	public static void main(String[] args) {
		int num = 23;
		System.out.println("num = " + num);
		String str1 = Integer.toString(num);
		System.out.println("str1 = " + str1);
		//Otra manera
		String str2 = String.valueOf(num);
		System.out.println("str2 = " + str2);
	}

}
