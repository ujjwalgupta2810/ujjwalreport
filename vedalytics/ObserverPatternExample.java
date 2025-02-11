package vedalytics;

import java.util.*;

//Observer interface
interface Observer {
 void update(String stockName, double price);
}

//Concrete Observer 
class Investor implements Observer {
 private String name;

 public Investor(String name) {
     this.name = name;
 }

 @Override
 public void update(String stockName, double price) {
     System.out.println(name + " has been notified. " + stockName + " is now " + price);
 }
}

//Subject interface
interface Subject {
 void addObserver(Observer observer);
 void removeObserver(Observer observer);
 void notifyObservers();
}

//Concrete Subject
class Stock implements Subject {
 private List<Observer> observers = new ArrayList<>();
 private String stockName;
 private double price;

 public Stock(String stockName, double price) {
     this.stockName = stockName;
     this.price = price;
 }

 @Override
 public void addObserver(Observer observer) {
     observers.add(observer);
 }

 @Override
 public void removeObserver(Observer observer) {
     observers.remove(observer);
 }

 @Override
 public void notifyObservers() {
     for (Observer observer : observers) {
         observer.update(stockName, price);
     }
 }

 public void setPrice(double price) {
     this.price = price;
     notifyObservers();
 }

 public String getStockName() {
     return stockName;
 }

 public double getPrice() {
     return price;
 }
}

//Main class to demonstrate Observer Pattern
public class ObserverPatternExample {
 public static void main(String[] args) {
     // Create a stock (Subject)
     Stock googleStock = new Stock("Google", 1500.0);

     // Create observers (Investors)
     Investor investor1 = new Investor("Ujjwal");
     Investor investor2 = new Investor("Gupta");

     // Add observers to the stock
     googleStock.addObserver(investor1);
     googleStock.addObserver(investor2);

     // Update the stock price (this will notify all observers)
     System.out.println("Stock price is updated.");
     googleStock.setPrice(1600.0); // All observers are notified

     // Remove one observer and change the stock price again
     googleStock.removeObserver(investor1);
     System.out.println("Stock price is updated again.");
     googleStock.setPrice(1700.0); // Only investor2 will be notified
 }
}
