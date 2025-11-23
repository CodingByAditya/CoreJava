class MethodExample9
{
  public void Percentage(){
      int sm=553;
      int fm=600;
      double per=(double)sm/fm*100;
      System.out.println("Secure Mark--"+sm);
      System.out.println("Full Mark--"+fm);
      System.out.println("Result--"+per);
     }
     public static void main(String[]args){
        MethodExample9 m = new MethodExample9();
	m.Percentage();
      }
    }