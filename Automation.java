package Assingment;

public class Automation  extends MultipleLangauge implements TestTool,Language {

		public void ruby() {
			// TODO Auto-generated method stub
			System.out.println("Ruby");
		}

		
		

		@Override
		public void java() {
			// TODO Auto-generated method stub
			System.out.println("Java");
		}

		@Override
		public void Selenium() {
			// TODO Auto-generated method stub
			System.out.println("Selenium");
		}

		public static void main() {
			Automation au=new Automation();
			au.java();
			au.Selenium();
			au.ruby();
			
		}




}


