package com.or1.app;

import java.util.*;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    // one();
    // two();
    three();
  }

  private static void three() {
    Queue queue = preset(16);
    ServicePoint sp = new ServicePoint(queue);
    sp.serve();
  }

  private static Queue preset(int n) {
    Queue queue = new Queue();
    for (int i = 0; i < n; i++) {
      Customer customer = new Customer();
      queue.add(customer);
    }
    return queue;
  }

  private static void two() {
    Queue queue = preset(5);
    while (!queue.isEmpty()) {
      queue.handleQueueNext();
    }
  }

  private static void one() throws InterruptedException {
    Customer customer = new Customer();
    customer.close();
    customer.time();
  }
}
