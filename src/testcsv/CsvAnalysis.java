package testcsv;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CsvAnalysis {
	public List csvString(String filename) {
		InputStreamReader fr = null;
		BufferedReader br = null;
		List dataList = new ArrayList();
		try {
			fr = new InputStreamReader(new FileInputStream(filename));
			br = new BufferedReader(fr);
			String rec = null;	
			while ((rec = br.readLine()) != null) {
				List myList = new ArrayList();
				String[] argsArr = rec.split(",");
				for (int i = 0; i < argsArr.length; i++) {
					//System.out.println("num \" (i 1) \":" + argsArr[i]);
					myList.add(i,argsArr[i]);
				}
				dataList.add(myList);	
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return dataList ;
	}

}
