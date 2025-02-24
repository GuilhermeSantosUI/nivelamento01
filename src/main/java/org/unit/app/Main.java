package org.unit.app;

import org.unit.app.views.CustomDateView;
import org.unit.app.views.EmployeeView;
import org.unit.app.views.IntegerSetView;
import org.unit.app.views.InvoiceView;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continueRunning = true;

    while (continueRunning) {
      String banner =
        " _    _ _   _ _____ _______\n" +
          "| |  | | \\ | |_   _|__   __|\n" +
          "| |  | |  \\| | | |    | |\n" +
          "| |  | | . ` | | |    | |\n" +
          "| |__| | |\\  |_| |_   | |\n" +
          " \\____/|_| \\_|_____|  |_|\n" +
          "+-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+\n" +
          "|U|n|i|v|e|r|s|i|d|a|d|e| |T|i|r|a|d|e|n|t|e|s|\n" +
          "+-+-+-+-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+\n" +
          "Nivelamento 1 - Versão 1.0.0\n" +
          "Powered by Java 17\n";

      System.out.println(banner);

      System.out.println("Escolha a questão para visualizar o resultado:");
      System.out.println("[1] - Faturas");
      System.out.println("[2] - Empregados");
      System.out.println("[3] - Datas");
      System.out.println("[4] - Conjuntos de Inteiros");
      System.out.print("Digite qual questão deseja visualizar: ");
      int choice = scanner.nextInt();

      System.out.println("");

      switch (choice) {
        case 1:
          InvoiceView.displayInvoices();
          break;

        case 2:
          EmployeeView.displayEmployees();
          break;

        case 3:
          CustomDateView.displayDates();
          break;

        case 4:
          IntegerSetView.displayIntegerSets();
          break;

        default:
          System.out.println("Opção inválida.");
          break;
      }

      System.out.print("\nDeseja ver outra questão? (s/n): ");
      String response = scanner.next();

      if (response.equalsIgnoreCase("n")) {
        continueRunning = false; // Sai do loop
      }
    }

    System.out.println("Obrigado por usar o programa!");
    scanner.close();
  }

}
