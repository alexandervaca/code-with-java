## code-with-java

https://www.geeksforgeeks.org/java/synchronization-in-java/








# package Executor
- introduction: https://www.makigas.es/series/concurrencia-en-java/interbloqueos-synchronized-y-el-problema-de-la-cena-de-los-filosofos
- solution: https://www.makigas.es/series/concurrencia-en-java/introduccion-a-executor-en-java



# package Virtual Threads
https://www.theserverside.com/tip/A-primer-on-Java-21-virtual-threads-with-examples

# package virtual thread v2
- Consideraciones importantes:
  synchronized y Hilos Virtuales:
  Evita usar synchronized con hilos virtuales, ya que puede bloquear el hilo de la plataforma, anulando el beneficio de los hilos virtuales. Usa otras opciones como ReentrantLock si necesitas sincronización.
  Operaciones de E/S:
  Los hilos virtuales son especialmente útiles para operaciones de E/S (entrada/salida) como acceso a bases de datos, llamadas a servicios web, o lectura/escritura de archivos, donde el hilo puede estar esperando mucho tiempo.
  CompletableFuture:
  Los hilos virtuales se integran bien con CompletableFuture para operaciones asíncronas, permitiendo encadenar tareas que se ejecutan en hilos virtuales.
  Rendimiento:
  Los hilos virtuales ofrecen un mejor rendimiento que los hilos de plataforma en aplicaciones con alta concurrencia de operaciones de E/S, ya que no están limitados por el número de hilos del sistema operativo.

