//Code Reusability.

//1.Create (Parent Class) For Admin.

public class admin extends developer{
	public void manage(){
		System.out.println("Manage Code");
	}

}


//2.Child Class for Developer.
public class developer extends guest {
	public void write(){
		System.out.println("Write Code");
		
	}
}


//3.Child Class for Admin & Developer.
public class guest {
  public static void read() {
	  System.out.println("Read code");
  }
}


//4.Access For Users.
//Cannot Change AnyThing From Parent Classes Just Only For Access.
public class user {

	public static void main(String[] args) {
		guest Guest = new guest();
		Guest.read();
		
		developer Dev = new developer();
		Dev.read();
		Dev.write();
		
		admin Admin = new admin();
		Admin.read();
		Admin.write();
		Admin.manage();

	}

}
