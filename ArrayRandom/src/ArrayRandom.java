
public class ArrayRandom {

	public static void main(String[] args) {
    int[] numeros = new int[30];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 10) + 1);
      System.out.println("[" + (i + 1) + "] = " + numeros[i]);
    }
  }
}
