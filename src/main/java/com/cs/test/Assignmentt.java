package com.cs.test;

class Assignmentt {
  
  int            a = 20;
  int            b = 10;
  static float   c = 56.90f;
  static boolean d = false;
  
  void m1()
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(Assignmentt.c);
    System.out.println(Assignmentt.d);
    
  }
  
  static void m2()
  {
    Assignmentt t= new Assignmentt();
    System.out.println(t.a);
    System.out.println(t.b);
    System.out.println(Assignmentt.c);
    System.out.println(Assignmentt.d);
  }
  
  public static void main(String[] args)
  {
      //System.out.println();
    Assignmentt s= new Assignmentt();
    s.m1();
    System.out.println("-------------------------------");
    //System.out.println(s.m1());
    Assignmentt.m2();
}
  
}