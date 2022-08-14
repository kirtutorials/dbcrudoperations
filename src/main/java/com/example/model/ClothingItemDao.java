package com.example.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class ClothingItemDao {
    // ORM - Object Relation Mapping
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * CRUD
     *  - Create
     *  - Read - single/multiple/all
     *  - Update
     *  - Delete
     *
     *  Divide and Conquer
     *
     *  WebApplication
     *      - Presentation Logic (View)
     *      - Business new Logic (Controller/Service)
     *      - Database Logic (SELCT * FROM...)
     */

    public int createClothingItem(ClothingItem c) {
        String sql = String.format("INSERT INTO `Cloths` VALUES(\'%s\', \'%s\', \'%f\', \'%d\')",
                c.getType(),
                c.getSize(),
                c.getPrice(),
                c.getQuantity());
        return jdbcTemplate.update(sql);
    }

    public int updateClothingItem(ClothingItem c) {
        String sql = String.format("INSERT INTO `Cloths` VALUES(\'%s\', \'%s\', \'%f\', \'%d\')",
                c.getType(),
                c.getSize(),
                c.getPrice(),
                c.getQuantity());
        return jdbcTemplate.update(sql);
    }

    public int deleteClothingItem(ClothingItem c) {
        String sql = String.format("INSERT INTO `Cloths` VALUES(\'%s\', \'%s\', \'%f\', \'%d\')",
                c.getType(),
                c.getSize(),
                c.getPrice(),
                c.getQuantity());
        return jdbcTemplate.update(sql);
    }

    public List getClothingItems() {
        String sql = "SELECT * FROM Cloths WHERE price >= 12";
        return jdbcTemplate.queryForList(sql);
    }

}
