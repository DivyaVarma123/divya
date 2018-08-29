package com.mrcubes.admin.schema.model;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		LogInRequestSchema.convert2LogInRequestPojo();
		LogInResponseSchema.convert2LogInRespPojo();
		UserResponseSchema.convert2UserResponsePojo();
		UsersRequestSchema.convert2UserRequestPojo();
		BigMsgResponse.convert2BigRespPojo();
	}

}
