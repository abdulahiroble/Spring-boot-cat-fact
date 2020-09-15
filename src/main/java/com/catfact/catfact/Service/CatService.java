package com.catfact.catfact.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.catfact.catfact.Controller.ControllerClass;
import com.google.gson.Gson;

public class CatService {
    public static void main(String[] args) throws IOException {
        // Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        // Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        // Map the data from Json to an object
        ControllerClass data = new Gson().fromJson(inputFromCatURL, ControllerClass.class);
        // Close the BufferedReader
        inputFromCatURL.close();

        // Get front page
        System.out.println(data.toString());

        // Get Single
        // System.out.println(data.getSingle());

        // Get ten
        // System.out.println(data.getTen());

        // Get ten sort by date
        // System.out.println(data.getTenSortByDate());

        // Contains
        // System.out.println(data.getContains());
    }
}