# ali-sofa-ark-example
ark-example: main ark container
ark-example-biz: dynamic ark biz,once load will print a console log

Order:
1. mvn package ark-example
2. java -jar ark-example-1.0.0-ark-executable.jar
3. mvn package ark-example-biz
4. telnet localhost 1234
5. > biz -i .../ark-example-biz/target/ark-example-biz-1.0.0-ark-biz.jar
6. > biz -a
7. will see console ouput with ark-example
8. change ark-example-biz code, console print 1.0.1, modify version -> 1.0.1
9. mvn package ark-example-biz
10. telnet localhost 1234
11. > biz -i .../ark-example-biz/target/ark-example-biz-1.0.1-ark-biz.jar
12. > biz -a
13. > biz -o ark-example-biz:1.0.1
