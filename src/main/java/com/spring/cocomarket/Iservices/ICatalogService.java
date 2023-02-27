package com.spring.cocomarket.Iservices;

import com.spring.cocomarket.entities.Catalog;

import java.util.List;
import java.util.Optional;

public interface ICatalogService {
    Optional<Catalog> getCatalogById(int id);

    List<Catalog> getAllCatalogs();

    Catalog addCatalog(Catalog catalog);

    Catalog updateCatalog(Catalog catalog);

    void deleteCatalog(int id);
}

