package com.example.Student.Model;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.Data;

@Data
public class Student {
    private int rno;
    private String name;
    private String tech;
    public static void main(String[] args){
        System.out.println("hello");
    }


}
