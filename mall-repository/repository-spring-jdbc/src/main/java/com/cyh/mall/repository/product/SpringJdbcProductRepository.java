package com.cyh.mall.repository.product;

import com.cyh.mall.repository.data.product.Product;

import java.util.Optional;

/**
 * @author cyh
 * @since 2024/5/8
 */
public class SpringJdbcProductRepository implements ProductRepository {


    @Override
    public Optional<Product> findById(Long id) {
        System.out.println("spring jdbc 的实现");
        return Optional.empty();
    }
}
