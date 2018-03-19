package win.log;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:activiti.cfg.core.xml","classpath:activiti.cfg.mem.xml","classpath:activiti.cfg.sql.mybatis.xml"})
public class OpenwebflowConfig {

}
