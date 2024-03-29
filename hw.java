Java 教程

Java 是由Sun Microsystems公司于1995年5月推出的高级程序设计语言。

Java可运行于多个平台，如Windows, Mac OS，及其他多种UNIX版本的系统。

本教程通过简单的实例将让大家更好的了解JAVA编程语言。

Java 在线工具

JDK 1.6 在线中文手册

我的第一个 JAVA 程序
以下我们通过一个简单的实例来展示 Java 编程，创建文件 HelloWorld.java(文件名需与类名一致), 代码如下：

实例
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

运行实例 »
注：String args[] 与 String[] args 都可以执行，但推荐使用 String[] args，这样可以避免歧义和误读。

运行以上实例，输出结果如下：

$ javac HelloWorld.java
$ java HelloWorld
Hello World
执行命令解析：
以上我们使用了两个命令 javac 和 java。

javac 后面跟着的是java文件的文件名，例如 HelloWorld.java。 该命令用于将 java 源文件编译为 class 字节码文件，如： javac HelloWorld.java。

运行javac命令后，如果成功编译没有错误的话，会出现一个 HelloWorld.class 的文件。

java 后面跟着的是java文件中的类名,例如 HelloWorld 就是类名，如: java HelloWorld。

注意：java命令后面不要加.class。

Gif 图演示：


开始学习JAVA编程
开始学习Java课程

Java 面向对象课程

Java 高级课程
