package jp.co.smartservice.app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * 同一セッション内のリクエストの同期化
 *
 * @author bakuskjp
 *
 */
public class EnableSynchronizeOnSessionPostProcessor
    implements BeanPostProcessor {
    private static final Logger logger = LoggerFactory
            .getLogger(EnableSynchronizeOnSessionPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        // NO-OP
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        if (bean instanceof RequestMappingHandlerAdapter) {
            RequestMappingHandlerAdapter adapter =
                (RequestMappingHandlerAdapter) bean;
            logger.info("enable synchronizeOnSession => {}", adapter);
            adapter.setSynchronizeOnSession(true);
        }
        return bean;
    }

}