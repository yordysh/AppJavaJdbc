package com.Ironman;

import com.Ironman.dao.CategoryDao;
import com.Ironman.dao.ConnectionCore;
import com.Ironman.entity.Category;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CategoryDao categoryDao = new CategoryDao();

        List<Category> categories = categoryDao.findAll();

        for(Category category:categories){
            System.out.println("Category: "+category.getName());
        }
    }
}