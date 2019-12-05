class P4{
public static void main(String[] args){
 for(int i=0;i<5;i++){
  int a =Integer.parseInt(args[i]);
 if(a<0)
    System.out.println(a+" is a negative number.");
 else if(a>0)
   System.out.println(a+" is a positive number.");
 else if(a==0)
    System.out.println(a+" is Zero");
 else
  System.out.println("Enter correct number");
}
}
}