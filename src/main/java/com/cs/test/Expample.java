package com.cs.test;


/*class Expample {
  
  void m1()
  {
    System.out.println("m1 method");
  }
  
  static void m2()
  {
    System.out.println("m2 method");
  }
  public static void main(String[] args)
  {
    Expample e=new Expample();
    e.m1();
    Expample.m2();
  }
  
}*/

//--------------------------------------------------------------------------

// epample-2

/*class Expample {
  
  void m1(int a, char b)
  {
    System.out.println("m1 method");
    System.out.println(a);
    System.out.println(b);
  }
  
  static void m2(double c,String str)
  {
    System.out.println("m2 method");
    System.out.println(c);
    System.out.println(str);
  }
  public static void main(String[] args)
  {
    Expample e=new Expample();
    e.m1(90, 'f');     //while arguments are passed in the method, those methods are expecting the values passed while calling 
    System.out.println("--------------------------------");
    Expample.m2(10.89,"tst");
  }*/

//In real project level, arguments contains 'object' contains, not integer value or char or double or float 

//--------------------------------------------------------------------------

//Example 3: when method expecting the objects e=while calling in main method(Project level use)

class X{}
class Emp{}
class Y{}
class Student{}


/*class Expample {
  
  void m1(X x, Emp e1)
  {
    System.out.println("m1 method");
  }
  
  static void m2(Y y,Student s)
  {
    System.out.println("m2 method");
  }
  
  public static void main(String[] args)
  {
    Expample e=new Expample();
    X x=new X();     //2. So create the object regarding 1st class X and pass the obj variable(x) to method m1
    Emp e1=new Emp();    //3. So create another object regarding 2nd class Emp and pass the obj variable(e) to method m1 
    
    e.m1(x,e1); //1. here m1 method expecting the object (x & e)values from different class     
    System.out.println("--------------------------------");
    
     Y y=new Y();     //2. So create the object regarding 1st class Y and pass the obj variable(y) to method m2
    Student s=new Student();    //3. So create another object regarding 2nd class Student and pass the obj variable(s) to method m2 
    
    Expample.m2(y,s); //1. here m2 method expecting the object (y & s)values from different class
    
  }*/

//----------------------------------------------------------------------------------
  
// Eample 7: (Method inside method calling)

/*class Expample {
  
  void m1()
  {
    m2(); //output:'m3 method', '30' & 'm2 method'
    System.out.println("m1 method"); //'m1 method'
    m3(90); // 'm3 method' & '90'
  }
  
  void m2()
  {
    m3(30);
    System.out.println("m2 method");
  }
  
  void m3(int a)
  {
    System.out.println("m3 method");
    System.out.println(a);
  }
  
  public static void main(String[] args)
  {
    Expample e=new Expample();
    e.m1();
    
  }*/

//-----------------------------------------------------

//Example 8: (Instance and local vairable with same name)

class Expample {
  
  int a=100; // Instance variable
  int b=200; // Instance variable   
  
  void add(int a,int b) // local variable
  {
    
    System.out.println(this.a+this.b); // 'this' keyword need to use while declaring instance variable
    System.out.println(a+b);
    
  }
  public static void main(String[] args)
  {
    Expample e=new Expample();
    e.add(4,9);
    
  }








  
  
  
  
  
  
  
  
  
  
}
















