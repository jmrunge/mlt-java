# mlt-java
Java bindings for MLT Framework (v0.9.6 at the time)

This projects aims to simplify development of Java apps using [mlt-framework](http://www.mltframework.org/)

It includes all java classes and the native library generated via [SWIG](http://www.swig.org/), and includes two utility classes for loading the native library.

Take a look at the [example class](https://github.com/jmrunge/mlt-java/blob/master/src/main/java/org/mltframework/test/Play.java) to see how to use it.

## This project is NOT part of the official distribution of [mlt-framework](http://www.mltframework.org/)

## How to get it
* Get latest version and [download it](https://github.com/jmrunge/mlt-java/releases/tag/v0.9.6) to your computer
* Maven: Add this to your pom.xml:
```xml
    <repositories>
        <repository>
            <id>zir-releases</id>
            <url>https://github.com/jmrunge/maven/raw/master/releases</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>ar.com.zir</groupId>
            <artifactId>mlt-java</artifactId>
            <version>0.9.6</version>
        </dependency>
    </dependencies>
```

##Feedback
Please let me know how does it go to you on github issues! 
##LICENSE
[GNU Affero General Public License](http://www.gnu.org/licenses/agpl-3.0.html)

Enjoy!
