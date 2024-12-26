package Day10;

class CPP {
	public void clang() {
		  System.out.println("cpp is object oriented language");
	  }
}

class Java {
	public void jslang() {
		  System.out.println("java is a platform independent language");
	  }
}
public class Language {
	 public static void main(String args[]) {
		  CPP cp = new CPP();
		  Java js = new Java();
		  cp.clang();
		  js.jslang();
	  }
}
