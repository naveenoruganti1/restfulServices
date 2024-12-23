package com.wwtp.boot;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class WWTPApplication extends Application {

	public WWTPApplication() {
		System.out.println("application created...");
	}

}
