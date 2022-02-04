package main;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer joiningNumber = sc.nextInt();

    int[] numeros = new int[(2*joiningNumber)];
    String resultado;
    String output="";
    for(int i=0; i<(2*joiningNumber); i++)
    {
      numeros[i] = sc.nextInt();
    }
    int l=0;
    for(int k=0;k<=joiningNumber;k++){

      for (int j=numeros[k+l];j<=numeros[k+1+l];j++){
        resultado=String.valueOf(j);
        output=output.concat(resultado);
      }
      l=l+1;
    }
    System.out.println(output);
}}
