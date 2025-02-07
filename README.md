# Project_1
Project_1
Future vs CompletableFuture.
Future:
Future is an interface in Java introduced in Java 5 and it's mostly being used to create asynchronous tasks. Now, why there is a need to create asynchronous tasks? Let us assume that we are creating a website where we have to do some computation in order which means we have to complete Task-1 before Task-2. With synchronous tasks, our web application will wait for Task-1 to be completed before proceeding to Task-2 where the application could be something else during this wait time.
In asynchronous design, our application will continue working on tasks that are not dependent on Task-1 to be completed and that's why there is a need for asynchronous architecture.
Drawbacks with Future:
1.Future can't be finished explicitly.
2.Without blocking, we can't do anything else with a Future's result.
3.There is no way to execute multiple Futures in simultaneously and then combine the results.
4.There are no exception handling constructs in the Future.
CompletableFuture:
CompletableFuture is an class in Java introduced in Java 8 and as you might have guessed this class implements Future interface. Now, why do we use CompletableFuture? That's the big question, right? CompletableFuture was a significant improvement over Future interface. Let's understand this better.
With Future, we had a lot of difficulties like we can't combine results which is what we saw above in drawbacks of Future also. CompletableFuture implements CompletionStage interface through which we can combine the results with other steps. Just like this, CompletableFuture came with around 60 methods just to provide a better functionality for asynchronous computation.


