package org.unit.app.views;

import org.unit.app.models.InvoiceModel;

public class InvoiceView {

  public static void displayInvoiceDetails(InvoiceModel invoice) {
    System.out.println("Número: " + invoice.getNumber());
    System.out.println("Descrição: " + invoice.getDescription());
    System.out.println("Quantidade: " + invoice.getQuantity());
    System.out.println("Preço por item: R$ " + invoice.getPricePerItem());
    System.out.println("Total da fatura: R$ " + invoice.getTotalInvoice());
  }

  public static void displayInvoices() {
    InvoiceModel invoice1 = new InvoiceModel("001", "Teclado mecânico RGB", 2, 150.50);
    InvoiceModel invoice2 = new InvoiceModel("002", "Mouse Gamer", -3, -75.90);

    System.out.println("Fatura 1:");
    displayInvoiceDetails(invoice1);

    System.out.println("\nFatura 2:");
    displayInvoiceDetails(invoice2);
  }

}
