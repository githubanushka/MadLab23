public class Main {
    
 public static void main (String args[]){

    Mother child = new Child ( );
    child.show( ); // show of Mother is called
    // Child child=new Child ( ); 
    //child.show( ); // show ( ) inherited in Child from Mother is called
 }
}