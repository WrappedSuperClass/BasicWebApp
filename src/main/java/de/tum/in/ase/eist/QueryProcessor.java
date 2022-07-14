package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("your name")) {
            return "Lukas";
        } else if (query.toLowerCase().contains("plus")) { // TODO extend the programm here
            String[] temp1;
            temp1 = query.split("plus");
            int a = Integer.parseInt(temp1[0].replaceAll("\\D", ""));
            int b = Integer.parseInt(temp1[1].replaceAll("\\D", ""));
            int sum = a + b;
            return Integer.toString(sum);



        } else if(query.contains("is largest")){
            String[] temp1;
            temp1 = query.split(",");
            int a = Integer.parseInt(temp1[0].replaceAll("\\D", ""));
            int b = Integer.parseInt(temp1[1].replaceAll("\\D", ""));
            if(a > b){
                return Integer.toString(a);
            }else
            return Integer.toString(b);


        }else {
            return "";
        }
    }
    }

