package com.or1.app;

import java.util.*;

class ServicePoint {
  private Queue queue;
  private long start;
  private long end;

  private List<Long> times = new ArrayList<>();

  ServicePoint(Queue queue) {
    this.queue = queue;
  }

  public void serve() {
    long sum = 0;
    if (queue.isEmpty()) {
      System.out.println("customers is empty");
    }
    while (!queue.isEmpty()) {
      Customer customer = queue.handleQueueNext();
      System.out.println("Serving customer " + customer.id);
      start = System.currentTimeMillis();
      try { // NOTE: This would be refactored into a wait class
        Thread.sleep((long) (Math.random() * 1000));
      } catch (InterruptedException e) {
        System.err.println("InterruptedException at Queue:handleQueue()");
      }
      end = System.currentTimeMillis();
      times.add(end - start);
      System.out.println("Served customer " + customer.id + " in " + (end - start) + " ms");
    }
    for (Long time : times) {
      sum += time;
    }
    System.out.println("Average time spent per customer was " + (sum / times.size()));
  }
}
