/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 class Singleton{
    private static Singleton UniqueInstance;
    static int count=0;
    private Singleton(){
        count++;
    }
    public static Singleton getInstance(){
        if(UniqueInstance==null)
        {
        UniqueInstance=new Singleton();
        System.out.println("New Object Created");
        }
        System.out.println("Count :" +count);
        return UniqueInstance;
    }
    
}