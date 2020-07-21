package com.ls.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
    public class DBConnection
    {

        @Value("${n1}")
        private String fno;
        @Value("${n2}")
        private String sno;
        @Value("${n3}")
        private int age;

        public DBConnection()
        {
            System.out.println(" am in DBConnection ==>");
        }

        public void sum()
        {
            System.out.println(Integer.parseInt(fno) +Integer.parseInt(sno));
        }

        public void add(){
            if (age>18){
                System.out.println("elegible for voting");
            }else
            {
                System.out.println("Not eligible for voting");
            }
        }
    }

