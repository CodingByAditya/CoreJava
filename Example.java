class Example
{
    void get(){
       String name = "ADITYA";
       String Fathersname = "Subal Rout";
       String Mothersname = "Manasi Rout";
       System.out.println(name);

       System.out.println(Fathersname);
       System.out.println(Mothersname);
     }
     void set(){
        
	String faname="ADITYA2";
	//System.out.println(name);
	//System.out.println(Fathersname);
	//System.out.println(Mothersname);
     }
     public static void main(String[]args)
     {
        Example e = new Example();
	e.get();
	e.set();
      }
    }