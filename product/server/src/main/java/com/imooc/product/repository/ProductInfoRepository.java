package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    public List<ProductInfo> findByProductStatus(Integer productStatus);

    public List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
