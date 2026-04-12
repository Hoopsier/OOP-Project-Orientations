package app;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Random random = new Random();
    EventList eventList = new EventList();
    for (int i = 0; i < 30; i++) {
      int rnd = random.nextInt(0, 15);
      eventList.AddToQueue(new Event(rnd, EventType.random()));
    }
    eventList.ReadQueue();
    Event event = eventList.Progress();
    System.out.println("First in queue is " + event.getTime() + " with importance: " + event.getEventType());
  }
}
