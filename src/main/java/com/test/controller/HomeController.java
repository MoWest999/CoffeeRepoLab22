package com.test.controller;

import com.test.util.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller //controls the entire app
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome", "message", "Hello World");
    }

    @RequestMapping("/userform")
    public ModelAndView userform() {
        return new ModelAndView("form", "inst", "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler(
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("email") String email,
            @RequestParam("phone number") int phonenumber,
            @RequestParam("password") String password
            //do some form of validation
    ) {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("email", email);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("password", password);
        return mv;
    }

    @RequestMapping(value = "getAllItems")
    public ModelAndView getAllItems() {
        //define the data for the connection
        String dbAddress = "jdbc:mysql://localhost:3306/coffeeshopdb";
        String username = "root";
        String password = "Free1378";
        //load driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); //more dynamic
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //more static

            //create the db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username, password);

            //create the db statement (query)

            String readCustomersCommand = "select name,  description, quantity , price from items";

            Statement readCustomers = mysqlConnection.createStatement();//creates the statement

            ResultSet results = readCustomers.executeQuery(readCustomersCommand); //executes the statement &
            //puts data in results variable

            //create array list of customers

            ArrayList<Items> customerList = new ArrayList<Items>();

            //map from the ResultSet to the ArrayList

            while (results.next()) {
                //create Customer object (for each row) and in each object, store first and second column data for each row
                Items temp = new Items(results.getString(1),
                        results.getString(2), results.getInt(3), results.getDouble(4));
                customerList.add(temp);

            }
            // create new Model and View
            return new ModelAndView("customerView", "cList", customerList);

        } catch (Exception e) {
        }
        return null;
    }
}

