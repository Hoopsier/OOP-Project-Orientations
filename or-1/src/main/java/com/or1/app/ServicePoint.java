package com.or1.app;

class ServicePoint {
  private Queue queue;
  private long start;
  private long end;

  ServicePoint(Queue queue) {
    this.queue = queue;
  }

  public void serve() {
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
      System.out.println("Served customer " + customer.id + " in " + (end - start) + " ms");
    }
  }
}
