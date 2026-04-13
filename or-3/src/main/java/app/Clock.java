package app;

class Clock {
  private static Clock instance;
  private int time = 0;

  Clock() {

  }

  public static Clock getInstance() {
    if (instance == null) {
      instance = new Clock();
    }
    return instance;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int _time) {
    time = _time;
  }
}
