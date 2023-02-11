package com.bolsadeideas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/*
- Archivo de configuracion para referenciar las variables del archivo textos.properties
- classpath hace referencia a la carpeta src/main/resources
*/
@Configuration
@PropertySources({ @PropertySource("classpath:textos.properties") })
public class TextosPropertiesConfig {
}
