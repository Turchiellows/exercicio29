// IMPORTS

import veiculo.Veiculo;
import java.util.Scanner;

public class Exercicio29 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);
      Veiculo fusca = new Veiculo();
      Veiculo trator = new Veiculo();
      Veiculo onibus = new Veiculo();

      // READ
      System.out.print("Fusca K: ");
      fusca.setKilometroPercorrido(sc.nextDouble());
      System.out.print("Fusca L: ");
      fusca.setLitrosGastos(sc.nextDouble());

      System.out.print("Trator K: ");
      trator.setKilometroPercorrido(sc.nextDouble());
      System.out.print("Trator L: ");
      trator.setLitrosGastos(sc.nextDouble());

      System.out.print("Onibus K: ");
      onibus.setKilometroPercorrido(sc.nextDouble());
      System.out.print("Onibus L: ");
      onibus.setLitrosGastos(sc.nextDouble());

      // OUTPUT
      System.out.println("\n\n========================================================");
      //  System.out.println(" " + fusca.getConsumo());
      System.out.printf("FUSCA   : %.2f Km/l\n", fusca.getConsumo());
      System.out.printf("TRATOR  : %.2f Km/l\n", trator.getConsumo());
      System.out.printf("ONIBUS  : %.2f Km/l\n", onibus.getConsumo());

   }
}
