/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.daos;


import cn.emac.demo.petstore.domain.tables.Product;
import cn.emac.demo.petstore.domain.tables.records.ProductRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Categorias
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ProductDao extends DAOImpl<ProductRecord, cn.emac.demo.petstore.domain.tables.pojos.Product, String> {

    /**
     * Create a new ProductDao without any configuration
     */
    public ProductDao() {
        super(Product.PRODUCT, cn.emac.demo.petstore.domain.tables.pojos.Product.class);
    }

    /**
     * Create a new ProductDao with an attached configuration
     */
    @Autowired
    public ProductDao(Configuration configuration) {
        super(Product.PRODUCT, cn.emac.demo.petstore.domain.tables.pojos.Product.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.emac.demo.petstore.domain.tables.pojos.Product object) {
        return object.getProductid();
    }

    /**
     * Fetch records that have <code>productid IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Product> fetchByProductid(String... values) {
        return fetch(Product.PRODUCT.PRODUCTID, values);
    }

    /**
     * Fetch a unique record that has <code>productid = value</code>
     */
    public cn.emac.demo.petstore.domain.tables.pojos.Product fetchOneByProductid(String value) {
        return fetchOne(Product.PRODUCT.PRODUCTID, value);
    }

    /**
     * Fetch records that have <code>category IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Product> fetchByCategory(String... values) {
        return fetch(Product.PRODUCT.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Product> fetchByName(String... values) {
        return fetch(Product.PRODUCT.NAME, values);
    }

    /**
     * Fetch records that have <code>descn IN (values)</code>
     */
    public List<cn.emac.demo.petstore.domain.tables.pojos.Product> fetchByDescn(String... values) {
        return fetch(Product.PRODUCT.DESCN, values);
    }
}
