package com.kishore.utilites;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "prod")
public class Production_Env implements Environments_Config {

	@Override
	public void env_setup() {
		System.out.println("I am running from Production Environment!");
	}

}
