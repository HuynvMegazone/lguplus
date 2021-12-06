package com.lguplus.fleta.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public static final String NX_SERIES_LIST = "NxSeriesList";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(true)
				.select()
				//.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
//				.apiInfo(apiInfo())
//				.tags(new Tag(NX_SERIES_LIST, "Api tag description"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("LGU+ Media Service :: Contents")
				.description("LGU+ Media Service :: Contents Api documents")
				.version("1.0")
				.build();
	}

}
