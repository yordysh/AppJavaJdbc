package com.Ironman;

import com.Ironman.dao.ConnectionCore;
import com.Ironman.entity.Category;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ConnectionCore connection= new ConnectionCore();
        connection.getConnection();

    }
}