package com.spring.cocomarket.services;

import com.spring.cocomarket.Iservices.ICatalogService;
import com.spring.cocomarket.entities.Catalog;
import com.spring.cocomarket.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogServiceImpl implements ICatalogService {
    @Autowired
    private CatalogRepository catalogRepository;

    @Override
    public Optional<Catalog> getCatalogById(int id) {
        return catalogRepository.findById(id);
    }

    @Override
    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }

    @Override
    public Catalog addCatalog(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @Override
    public Catalog updateCatalog(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @Override
    public void deleteCatalog(int id) {
        catalogRepository.deleteById(id);
    }
}
