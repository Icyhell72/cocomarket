package com.spring.cocomarket.controllers;

import com.spring.cocomarket.Iservices.ICatalogService;
import com.spring.cocomarket.entities.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private ICatalogService catalogService;

    @GetMapping("/{id}")
    public Optional<Catalog> getCatalogById(@PathVariable int id) {
        return catalogService.getCatalogById(id);
    }

    @GetMapping("/all")
    public List<Catalog> getAllCatalogs() {
        return catalogService.getAllCatalogs();
    }

    @PostMapping("/add")
    public Catalog addCatalog(@RequestBody Catalog catalog) {
        return catalogService.addCatalog(catalog);
    }

    @PutMapping("/update")
    public Catalog updateCatalog(@RequestBody Catalog catalog) {
        return catalogService.updateCatalog(catalog);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCatalog(@PathVariable int id) {
        catalogService.deleteCatalog(id);
    }
}

