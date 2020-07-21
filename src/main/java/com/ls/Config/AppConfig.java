package com.ls.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan( {"com.ls.bean"})
@PropertySource("classpath:App.properties")
public class AppConfig {

}



