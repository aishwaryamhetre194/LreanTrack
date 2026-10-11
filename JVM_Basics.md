1. What is JDK, JRE, JVM



JDK - Java Development Kit

1.JDK is software used to develop the applications.
2.It contains JRE+ Compiler,debugger, java documents.

JRE -Java Runtime Environment 

1.It contains JVM + Class libraries
2.when we write the programs like printing on the console, file reading/write etc.
3.we need some internall fuctions or methods that it imports run time.

JVM - Java Virtual Machine

1.JVM converts the bytecode to machine code (interpreter +JIT compiler).
2.Source code compiled after compiling it generates bytecode(.class).JVM takes the bytecode and excutes on platform .
3.It also manages garbage collection.

2. What is Bytecode?

When we compile source code using javac command it generate file with extension .class so it contains the bytecode. 
Once the bytecode is generated we can run on any machine using JVM.

3. What does “write once, run anywhere” mean (1–2 short paragraphs)

Write once,run anywhere means after compile the souce code it generates bytecode .
As java is platform independent whenn we install the jvm on every machine it will generate machine code according to the platform.
we dont need to compile the again and again we can run the bytecode using JVM .