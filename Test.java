/*
Anonymous class (name less class)
by using Abstract modifier
by using Interface
if you dont know the behaviour then we use abstract modifier
with class
with method
Illegal combinations:
1.private + abstract
2. final + abstract

// if no any method is abstact then also we can make class abstarct
// can not make object of abstract class
// no restriction in abstract
// if any method is abstract then make the class abstract
Object arr[]=new Object[5]
one class extend only one abstarct class(dirct or indirect)
 */


abstract class Result
{
   abstract public void calcResult();// for declaration , we need Inheritance.
}
// Inheritance for reusability, decrease retendency , reduce duplicacy.
/*
class Cresult extends Result//extends implies Inheritance ==> [is a] relationship
   // mandatory for class to declare first.
{

   @Override// between classes. while overlap between methods.
     public void calcResult()// widening by default
   {
      System.out.println("Welcome");
   }
}
parent hold reference of child only invokes onlu methods inside child
but child ivoke both methods of child or parent.
*/

public class Test
{
   public static void main(String[] args)
   {
     // Cresult obj=new Cresult();
      //obj.calcResult();
     // new Cresult().calcResult();// object of anonnymous class
     /* Result obj1=*/new Result()// result is a parent class
      {
         @Override//definition
         public void calcResult()
         {
            System.out.println("Welcome");
         }
      }.calcResult();// cannot create object of abstract class.
      //obj1.calcResult();
      }
   }

