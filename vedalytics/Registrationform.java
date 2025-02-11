package oops;

class Registrationform {


	  String name;
	  String email;
	  String password;
	  long phone_number;
	  String gender;
	  String language;
	  int pin_code;
	  String about;
	  
	  Registrationform(String name,String email,String password,long phone_number,String gender,String language,int pin_code)
	  {
	    this.name = name;
	    this.email=email;
	    this.password=password;
	    this.phone_number=phone_number;
	    this.gender=gender;
	    this.language=language;
	    this.pin_code=pin_code;
	    
	    System.out.println("Name is          : "+name);
	    System.out.println("Email is         : "+email);
	    System.out.println("Password is      : "+password);
	    System.out.println("Phone Number  is : "+phone_number);
	    System.out.println("Gender is        : "+gender);
	    System.out.println("Language is      : "+language);
	    System.out.println("Pin Code  is     : "+pin_code);
	    
	    System.out.println();
	    
	  }
	  Registrationform(String name,String email,String password,long phone_number,String gender,String language,int pin_code,String about)
	  {
	    this.name = name;
	    this.email=email;
	    this.password=password;
	    this.phone_number=phone_number;
	    this.gender=gender;
	    this.language=language;
	    this.pin_code=pin_code;
	    this.about = about;
	    
	    System.out.println("Name is          : "+name);
	    System.out.println("Email is         : "+email);
	    System.out.println("Password is      : "+password);
	    System.out.println("Phone Number  is : "+phone_number);
	    System.out.println("Gender is        : "+gender);
	    System.out.println("Language is      : "+language);
	    System.out.println("Pin Code  is     : "+pin_code);
	    System.out.println("About is         : "+about);
	    System.out.println();
	    
	  }
	  Registrationform()
	  {
	    
	  }
	  public static void main(String[] args)
	  {
	    Registrationform r1 = new Registrationform("Ajay","ajay@gmail.com","Hello@123",8596748596l,"Male","English",110034);
	    Registrationform r2 = new Registrationform("Manish","manish@gmail.com","Hello@123",7485968574l,"Male","Hindi",110043,"Hello I am Java Programmer");
	    
	  }
	  
	}