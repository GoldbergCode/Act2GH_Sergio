
public class ArrayRandom {

  public static void main(String[] args) {
    int[] numeros = new int[40];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * 10) + 1);
      System.out.println("[" + ((i + 1) + 1) + "] = " + numeros[i]);
    }


    int[] conteoNumeros = new int[10];
    for (int i = 0; i < numeros.length; i++) {
      conteoNumeros[numeros[i] - 1] += 1;
    }

    for (int i = 0; i < conteoNumeros.length; i++) {
      System.out.println("El número " + (i + 1) + " aparece " + conteoNumeros[i]);
    }
  }
}
