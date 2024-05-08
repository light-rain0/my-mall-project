package com.cyh.mall.repository.product;

import com.cyh.mall.repository.ServiceLoaderUtil;
import com.cyh.mall.repository.data.product.Product;

import java.util.Optional;


/**
 * 商品存储相关操作
 *
 * @author cyh
 * @since 2024/5/8
 */
public interface ProductRepository {

    ProductRepository INSTANCE = ServiceLoaderUtil.find(ProductRepository.class);

    Optional<Product> findById(Long id);
}
