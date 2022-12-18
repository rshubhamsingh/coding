 files:
  package pkgA;
  public class Foo {
  int a = 5;
  protected int b = 6;
  public int c = 7;
  }
  package pkgB;
  import pkgA.*;
  public class Baz {
  public static void main(String[] args) {
  Foo f = new Foo();
  System.out.print(" " + f.a);
  System.out.print(" " + f.b);
 System.out.print(" " + f.c);
 }
 }
