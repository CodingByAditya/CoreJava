interface Company2
        {
                       void m1();
                       void m2();
                       void m3();
                       void m4();

       }
        class Company1 implements Company2
      {
        public void m1(){
        System.out.println("........Company Details........");
      }
        public void m2(){
        System.out.println("--->MICROSOFT<---");
     }
        public void m3(){
        System.out.println("ADDRESS-->United States Of  America");
     }  
        public void m4(){
        System.out.println("It is a american multinational corporation");
     }
        public static void main(String[] args)
     {
        Company1 c = new Company1();
                             c.m1();
                             c.m2();
                             c.m3();
                             c.m4();
    }
 }