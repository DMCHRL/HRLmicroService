package myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/1/24.
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new HrlRule();
    }
}
