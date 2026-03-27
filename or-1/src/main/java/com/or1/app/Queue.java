package com.or1.app;

import java.util.*;

class Queue {
  private List<Customer> customers;

  Queue() {
    customers = new LinkedList<>();
  }

  public Customer handleQueueNext() {
    if (customers.isEmpty()) {
      System.err.println("Empty Queue");
      return null;
    }
    Customer returnee = customers.get(0).close();
    customers.remove(0);

    return returnee;
  }

  void add(Customer customer) {
    customers.add(customer);
  }

  boolean isEmpty() {
    return customers.isEmpty();
  }
}
