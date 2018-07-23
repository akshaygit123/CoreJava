package com.cs.test;

class Assignmet {
  
  int a = 20;
  int b = 90;
  
  /*static void m1()
  {
    System.out.println();
  }
  
  static void m2()
  {
    System.out.println(b);
  }*/
  
  public static void main(String[] args)
  {
    //System.out.println(Assignment.m1);
    //System.out.println(Assignment.m2);
    
    Assignmet.m2();
    //Assignmet.m2(assignment.a, assignment.b);
  }

   static void m2()
  {
    Assignmet assignment = new Assignmet();
    // TODO Auto-generated method stub
    System.out.println(assignment.a + ":"+ assignment.b);
    
  }

  private static void m1(int a2, int b2)
  {
    // TODO Auto-generated method stub
    System.out.println(a2 + ":"+ b2);
    
  }

  
}