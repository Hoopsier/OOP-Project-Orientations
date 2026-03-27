package com.or1.app;

class Customer {
  private static int _id = 1;
  public int id;
  private long start;
  private long end;

  Customer() {
    id = _id++;
    start = System.currentTimeMillis();
  }

  public Customer close() {
    end = System.currentTimeMillis();
    System.out.println(end - start + "ms spent in queue (" + id + ")");
    return this;
  }

  void time() {
    start = System.currentTimeMillis();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.err.println("Yikes");
    }
    end = System.currentTimeMillis();
    System.out.println(end - start + "ms spent by " + id);
  }
}
