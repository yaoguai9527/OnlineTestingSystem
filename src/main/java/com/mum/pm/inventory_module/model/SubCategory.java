package com.mum.pm.inventory_module.model;

import javax.persistence.*;

/**
 * Created by manzil on 4/25/2017.
 */
@Entity
@Table
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subCategoryId;
    private String subCategoryName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "active")
    private int active;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "subCategoryId=" + subCategoryId +
                ", subCategoryName='" + subCategoryName + '\'' +
                ", category=" + category +
                '}';
    }
}
