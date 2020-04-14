package pack1;

import java.io.IOException;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		
		Excel1 e1=new Excel1();
		double t=e1.readData(1,0);
		System.out.println(t);

	}

}
