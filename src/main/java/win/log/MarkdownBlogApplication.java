package win.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class MarkdownBlogApplication {
	private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        corsConfiguration.addAllowedOrigin("http://localhost:8000");  
        corsConfiguration.addAllowedHeader("*");  
        corsConfiguration.addAllowedMethod("*"); 
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;  
    } 
	 /** 
     * 跨域过滤器 
     * @return 
     */  
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig()); // 4  
        return new CorsFilter(source);  
    }  
    
	public static void main(String[] args) {
		System.out.println(0.1+0.2);
		SpringApplication.run(MarkdownBlogApplication.class, args);
	}
}
