package com.egjson;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJSONEg {
public static void main(String[] args) throws Exception {
	Address adr = new Address("Street","city",1234);
	Person obj = new Person("Ravi",46,adr);
	
	Address[]addrs = { new Address("Street1","city1",1234),
			new Address("Street2","city1",1234)};
	Person obj1 = new Person("Ravi",46,adr,addrs);

//	obj.setAge(46);
//	obj.setName("Ravi");
	
	ObjectMapper mapper = new ObjectMapper();
	FileOutputStream fos = new FileOutputStream("person.json");
//	mapper.writeValue(fos, obj);
	mapper.writeValue(fos, obj1);
	
	String pjson = mapper.writeValueAsString(obj1);
	System.out.println("Json file created "+pjson);
}
}
