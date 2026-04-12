package app;

public class Event implements Comparable<Event> {
  private int time;
  private EventType eventType;

  public Event(int _time, EventType _eventType) {
    time = _time;
    eventType = _eventType;
  }

  public int getTime() {
    return time;
  }

  public EventType getEventType() {
    return eventType;
  }

  public int compareTo(Event event) {
    return time - event.time;
  }
}
