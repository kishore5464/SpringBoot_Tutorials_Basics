package com.kishore.utilites;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "dev")
public class Development_Env implements Environments_Config {

	@Override
	public void env_setup() {
		System.out.println("I am running from Production Environment!");
	}

}
