package one.digitalInovation.digitalmicroservices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@Configuration
@EnableReactiveElasticsearchRepositories(basePackages = "one.digitalInovation.digitalmicroservices.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration{
}
