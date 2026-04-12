package app;

import java.util.PriorityQueue;
import java.util.Queue;

class EventList {
  private Queue<Event> eventQueue = new PriorityQueue<>();

  public void ReadQueue() {
    Queue<Event> tempQueue = new PriorityQueue<>();
    tempQueue.addAll(eventQueue);
    while (!tempQueue.isEmpty()) {
      Event event = tempQueue.poll();
      System.out.print(event.getTime() + " " + event.getEventType() + ", ");
    }
    System.out.println();
  }

  /// returns null if event queue is empty
  /// otherwise returns the first in queue and removes it from the queue
  public Event Progress() {
    return eventQueue.poll();
  }

  public void AddToQueue(Event event) {
    eventQueue.add(event);
  }
}
