package internal.org.springframework.content.s3.config;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.content.commons.config.AbstractStoreBeanDefinitionRegistrar;
import org.springframework.content.s3.config.EnableS3ContentRepositories;
import org.springframework.content.s3.store.S3ContentStore;

public class S3ContentRepositoriesRegistrar extends AbstractStoreBeanDefinitionRegistrar {

	@Override
	protected void createOperationsBean(BeanDefinitionRegistry registry) {
	}

	@Override
	protected Class<? extends Annotation> getAnnotation() {
		return EnableS3ContentRepositories.class;
	}

	@Override
	protected Class<?> getIdentifyingType() {
		return S3ContentStore.class;
	}
}