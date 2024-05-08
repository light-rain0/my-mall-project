package com.cyh.mall.repository;

import com.cyh.mall.repository.data.product.Product;
import com.cyh.mall.repository.product.ProductRepository;

import java.util.Optional;

/**
 * @author cyh
 * @since 2024/5/8
 */
public class JdbcProductRepository implements ProductRepository {


    @Override
    public Optional<Product> findById(Long id) {
        System.out.println("jdbc 的查询实现");
        return Optional.empty();
    }
}
