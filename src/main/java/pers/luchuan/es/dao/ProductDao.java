package pers.luchuan.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import pers.luchuan.es.entity.Product;

/**
 * @author luchuan
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}
