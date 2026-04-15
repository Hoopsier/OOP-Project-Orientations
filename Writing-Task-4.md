# Orientation 4 Performance-Variables

## 1

In for example a banking system,
the performance variables shown are crucial data points needed for optimization.
For example, if a service point has an average of 3 in queue,
you should add another service point.

## 2

### Core 4

- Arrived count increments when a customer arrives.
- Serviced count increments when a customer has been served.
- Active time is increased by the delta time between service start and end.
- Total simulation time *can* be incremented each useful step,
but there are other ways for edge cases.

## 3

bank -> language -> purpose -> service
roadside assistance -> language -> issue -> aid

## 4

```
main(){
  initialize();
  while(!done){
    APhase(queue timeSteps);
    BPhase(bEvents);
    bool cDone = false;
    do{
      cDone = CPhase(cEvents);
    }while(!cDone)
  }
  println("done");
}
```

## 5

A-Phase is the part where you turn the time to the next useful time step.
B-events are the arrivals to the router and finish events for router,
and service points.
C-events are the conditional events, they schedule the finish events in B.
C-events are router events.
