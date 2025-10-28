package com.example.soapuserservice;



public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SoapuserserviceApplication.class);
	}

}
