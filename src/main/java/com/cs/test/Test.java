package com.cs.test;

class Test {
  
  public static void main(String[] args)
  {
    System.out.println("hellow world....");
  }
  
}

/*

class Var
{
 public static void main(String[] args)
 { 
   int a=10;
   int b=35;
   System.out.println(a+b);
 }
}

//Instance variable

class Instance
{
  int a=10; //memory allocated when abject created-> destroyed when object destroyed
  int b=80;
  
  public static void main(String[] args) //static area
  {
    Instance t = new Instance(); // object created as access not possible for instance variable directly in static method
    System.out.println(t.a);
    System.out.println(t.b);
    
    t.m2(); //JVM is only responsible to execute main method, and if user defined method is there, then call explicitely in main menthod.
    //static body
  }
  
   void m2() //Instance area
   {
     System.out.println(a);// Instance body
     System.out.println(b);   
   }
    
}*/