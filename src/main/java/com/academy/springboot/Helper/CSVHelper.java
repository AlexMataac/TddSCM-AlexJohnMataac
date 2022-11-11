package com.academy.springboot.Helper;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSVHelper {

    /*private void writeToCSVFile(List<String[]> list, File file) throws IOException {

        List<String> collect = list.stream()
                .map(this::convertToCSVFormat)
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : collect) {
                bw.write(line);
                bw.newLine();
            }
        }
    }*/
    /*private static List<String[]> createCSVDataSpecial(){

        String[] header = {"Name", "Age","Salary", "Company"};
        String[] Employee1 = {"Wayne", "30", "110000", "Cognizant Softvision"};
        String[] Employee2 = {"Jerome", "26", "140000", "Cognizant Softvision"};
        String[] Employee3 = {"Shaun", "25", "130000", "Cognizant Softvision"};
        String[] Employee4 = {"Ali", "25", "120000", "Cognizant Softvision"};

        List<String[]> list = new ArrayList<>();
        list.add(header);
        list.add(Employee1);
        list.add(Employee2);
        list.add(Employee3);
        list.add(Employee4);

        return list;

    }*/
}