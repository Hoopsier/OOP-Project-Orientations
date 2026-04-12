package app;

import java.util.concurrent.ThreadLocalRandom;

public enum EventType {
  URGENT,
  LAX,
  UNIMPORTANT;

  private static final EventType[] VALUES = values();

  public static EventType random() {
    return VALUES[ThreadLocalRandom.current().nextInt(VALUES.length)];
  }
}
