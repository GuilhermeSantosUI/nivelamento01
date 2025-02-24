package org.unit.app.models;

public class InvoiceModel {
  private String number;
  private String description;
  private int quantity;
  private double pricePerItem;

  public InvoiceModel(String number, String description, int quantity, double pricePerItem) {
    this.number = number;
    this.description = description;
    setQuantity(quantity);
    setPricePerItem(pricePerItem);
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = (quantity > 0) ? quantity : 0;
  }

  public double getPricePerItem() {
    return pricePerItem;
  }

  public void setPricePerItem(double pricePerItem) {
    this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
  }

  public double getTotalInvoice() {
    return quantity * pricePerItem;
  }
}
