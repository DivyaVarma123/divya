package com.mrcubes.admin.schema.model;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsonschema2pojo.SchemaMapper;

import com.sun.codemodel.JCodeModel;

public class LogInResponseSchema {


		//public static void main(String[] args) {
			 public static void convert2LogInRespPojo() throws IOException{

			JCodeModel codeModel = new JCodeModel();
			URL source;
			try {
				source = new URL("file:///E://babblu//LogInResponse.json.schema");

				SchemaMapper mapper = new SchemaMapper();

				mapper.generate(codeModel, "LogInResponsePojo", "com.mrcubes.admin.jsontopojo", source);

				codeModel.build(new File("C:\\Users\\shravan\\eclipse-workspace\\CurdOperationsOnDB\\src\\main\\java"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
