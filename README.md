
## build
```bash
time MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1" mvn -T 1C package && java -jar target/bar-1.0.0-SNAPSHOT-jar-with-dependencies.jar baz quox arf
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.011 s (Wall Clock)
[INFO] Finished at: 2019-03-10T14:38:47-05:00
[INFO] Final Memory: 30M/357M
[INFO] ------------------------------------------------------------------------

real	0m10.677s
user	0m13.081s
sys	0m2.518s
Hello World!
concat arguments = bazquoxarf
```

### or skip tests ( the skipTests is a property that's leveraged to skip the scalatest-maven-plugin )
```bash
time MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1" mvn -T 1C package -Dmaven.test.skip -DskipTests && java -jar target/bar-1.0.0-SNAPSHOT-jar-with-dependencies.jar baz quox arf
...
real	0m7.586s
user	0m6.834s
sys	0m2.079s
Hello World!
concat arguments = bazquoxarf
```

