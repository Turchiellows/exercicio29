package veiculo;

public class Veiculo {

   // ATTRIBUTES ===============================================================
   private double kilometroPercorrido;
   private double litrosGastos;

   // CONSTRUCTOR ==============================================================
   public Veiculo() {
      this.kilometroPercorrido = 0;
      this.litrosGastos = 0;
   }

   public Veiculo(double kilometroPercorrido, double litrosGastos) {
      this.kilometroPercorrido = kilometroPercorrido;
      this.litrosGastos = litrosGastos;
   }

   // GETTES AND SETERS ========================================================
   public double getKilometroPercorrido() {
      return kilometroPercorrido;
   }

   public void setKilometroPercorrido(double kilometroPercorrido) {
      if (kilometroPercorrido < 0) {
         kilometroPercorrido = 0;
      }
      this.kilometroPercorrido = kilometroPercorrido;
   }

   public double getLitrosGastos() {
      return litrosGastos;
   }

   public void setLitrosGastos(double litrosGastos) {
      if (litrosGastos < 0) {
         litrosGastos = 0;
      }
      this.litrosGastos = litrosGastos;
   }

   // CONSUM ===================================================================
   public double getConsumo() {
      return (getKilometroPercorrido() / getLitrosGastos());
   }

}
