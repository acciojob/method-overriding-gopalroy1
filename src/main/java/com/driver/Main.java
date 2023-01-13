package com.driver;

public class Main {
  public static void main(String[] args) {
    B B = new B();
    B.meth();
    B.meth();

  }
}
class A{
  String meth(){
    return "Invoking method from class A";
  }
}
class B extends A{
  @Override
  String meth() {
    return "Method is overridden in Extendend class B";
  }
}