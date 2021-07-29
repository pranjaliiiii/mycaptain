class employee{
 String name, Address;
 int year_of_joining;;
  public static void main(String arg[]){
  employee p1=new employee();
  p1.name="Robert";
  p1.year_of_joining = 1994;
   p1.Address="64C- WallsStreat";
   employee p2=new employee();
   p2.name="Sam";
   p2.year_of_joining = 2000;
   p2.Address="68D- WallsStreat";
   employee p3=new employee();
    p3.name="John";
    p3.year_of_joining = 1999;
    p3.Address="26B- WallsStreat";
    System.out.println("Name    "+"Year of Joining  "+ "Address" );
    System.out.println(p1.name+"    "    +p1.year_of_joining+"        "  + p1.Address );
    System.out.println(p2.name+"       "    +p2.year_of_joining+"        "  + p2.Address );
    System.out.println(p3.name+"      "    +p3.year_of_joining+"        "  + p3.Address );
    }
}
