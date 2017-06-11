import javax.swing.*;
public class CardGame
{
   int i;
   int j;
   int count;
   int find; 
   String[] s;
   
   public CardGame(int i,int j)
   {
      this.i=i;
      this.j=j;
      
      s=new String[12];
      
   
      s[0]="bird";
      s[1]="girafe";
      s[2]="flamingo";
      s[3]="bird";
      s[4]="deer";
      s[5]="lion";
      s[6]="elephant";
      s[7]="girafe";
      s[8]="flamingo";
      s[9]="elephant";
      s[10]="lion";
      s[11]="deer";
      
      int size=12;
      
      if(i==j)
      {System.out.println("Ju keni zgjedhur letren e njejte.Ju lutem zgjedhni perseri");}     
      
      else{
         System.out.println(""+s[i]+" dhe leteren "+s[j]);
         
         if(s[i].equals(s[j]))
         { 
            find=find+2;
            System.out.println("Ke qelluar letrat e njejta "+s[j]+" "+find+"/"+size);
            s[i]="";
            s[j]="";
            count=count+1;
           
         
         
         }
         else
         {System.out.println("Provo perseri");
         }
      }
      if(count==6)
      {System.out.println("Ju keni fituar");}
          
            
   } 
     
     
           
         
      
         
   public static void main(String [] args)
   {  
      System.out.println("Mireseerdhete ne lojen CardGame");
      System.out.println("Perdorni letrat nga 0-11");
      System.out.println("Per te perfunduar shtypni nje numer me te madh se 11 pasi nje leter e tille nuk ekziston");
      System.out.println();
      boolean b=false;
      while(!b)
      {
         int i=new Integer(JOptionPane.showInputDialog("Shkruaj nje numer prej 0-11")).intValue();
         int j=new Integer(JOptionPane.showInputDialog("Shkruaj nje numer prej 0-11")).intValue();
         
                 
         if(i>=0 && i<=11 && j>=0 && j<=11)
         
         
         {new CardGame(i,j);}
         
         else{System.out.println("Ju keni nderpre lojen");
            b=true;}
       
      
      }
      
   }
}

