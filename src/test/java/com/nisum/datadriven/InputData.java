package com.nisum.datadriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class InputData {

    private String userName;
    private String password;

	@DataProvider(name = "inputCsvData")
	public static Object[][] getCsvData() throws IOException {
		CSVReader csvReader = new CSVReader(new FileReader(InputData.class.getResource("/inputData.csv").getPath()));

		List<String[]>dataList=csvReader.readAll();
		
		Object[][] data =new Object[dataList.size()][1];
	
		List<InputData> inputList= new ArrayList<InputData>();
		
		for(String[] strArray:dataList) {
		    if(strArray.length>=2) {
                InputData inputData = new InputData();
                inputData.setUserName(strArray[0].trim());
                inputData.setPassword(strArray[1].trim());
                inputList.add(inputData);
            }
		}
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
                data[i][j] = inputList.get(i);
			}
		}
		
		csvReader.close();
		
		return data;

	}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}