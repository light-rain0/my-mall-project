package com.cyh.mall.service;

import com.cyh.mall.repository.data.product.Product;
import com.cyh.mall.repository.product.ProductRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * 商品查询Spi机制实现测试
 *
 * @author cyh
 * @since 2024/5/8
 */
public class ProductServiceLoadTests {

    @Test
    public void test() {
        ProductRepository productRepository = ProductRepository.INSTANCE;

        Optional<Product> byId = productRepository.findById(0L);
    }
}
