/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); 

        // Static method call using class name
        Mother.show();  // Output: Hello World (calling the Mother class static method)
        Child.show();   // Output: Hello JUET (calling the Child class static method)
   }
}