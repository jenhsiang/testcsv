package testcsv;
import java.util.List;

import testcsv.CsvAnalysis;


public class todo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsvAnalysis cc = new CsvAnalysis();
		//List dataList = cc.csvString("C:\\test1.csv");
		List dataList = cc.csvString("C:\\test\\test.csv");
		for(int i=0;i<dataList.size();i++){
			System.out.println(dataList.get(i).toString());
		}

	}

}
