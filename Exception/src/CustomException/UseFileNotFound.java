package CustomException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseFileNotFound {
	public static void main(String[] args) throws IOException {
		try{
			File f = new File("C:\\Users\\KRISHNA\\Desktop\\k.xlx");
			if(f.createNewFile()) {
				System.out.println("filecreated");
			}
			else {
				throw new FileNotFoundException();			
				}
				
		//	FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
		}
	}

}

