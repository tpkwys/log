本实验项目主要用于学习日志记录框架SLF4J(Simple Logging Facade For Java)，兄弟框架 commons-logging（apache）。
slf4j是不同java日志框架的一个抽象（门面），需要具体实现，比如 logback,log4j,jdk logging，其功能类似于java的jdbc。
             /  logback
app -  slf4j -  log4j
             \  jdk logging
              .....