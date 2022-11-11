
public class ArrayRandom {

	public static void main(String[] args) {
    int[] numeros = new int[20];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 10) + 1);
      System.out.println("[" + i + "] = " + numeros[i]);
    }
  }
}
