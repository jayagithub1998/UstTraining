package com.egjson;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

//No POJO class
public class WriteJSONEg2 {
	public static void main(String[] args) throws Exception {
		ObjectMapper omapper = new ObjectMapper();
		ObjectNode onode = omapper.createObjectNode();
		onode.put("name", "Ravi");
		onode.put("age", 26);
		FileOutputStream fos=new FileOutputStream("./operson");
		//omapper.writeValue(fos, onode);
		
		//to get json with format
		omapper.writerWithDefaultPrettyPrinter().writeValue(fos,onode);
		
	}

}
