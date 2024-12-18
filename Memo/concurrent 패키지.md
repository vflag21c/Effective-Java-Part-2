## java.util.concurrent 패키지
### 병행(concurrency) 프로그래밍에 유용하게 사용할 수 있는 유틸리티 묶음

- 병행`concurrency`과 병렬`paralleism`의 차이
- 병행은 여러 작업을 번갈아 가며 실행해 마치 동시에 여러 작업을 동시에 처리하듯 보이지만, 실제로는 한번에 오직 한 작업만 실행한다. CPU 가 한개여도 가능하다.


- 병렬은 여러 작업을 동시에 처리한다. CPU가 여러개 있어야 가능하다.
- 자바의 concurrent 패키지는 병행 애플리케이션에 유용한 다양한 툴을 제공한다.
  - BlockingQueue, Callable, ConcurrentMap, Executor, ExecutorService, Future, ...