package com.ibm.mavenstudy;

import java.io.IOException;

public class TestExcel {

	public static void main(String[] args) throws IOException {
		String sd=ExcelCode.readStringData(0, 0);
		System.out.println(sd);

		double nd=ExcelCode.readNumericData(0, 1);
		System.out.println(nd);
	}

}
