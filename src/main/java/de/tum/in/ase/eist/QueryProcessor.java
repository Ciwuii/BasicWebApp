package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {
//hui
    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Christoph";
        } else if (query.contains("suck") || query.contains("dumb") || query.contains("smell") || query.contains("fuck u") || query.contains("stupid")) { // TODO extend the programm here
            return "no u";
        } else if (query.contains("warum")) {
            return "weil";
        }else if (query.contains("plus")) {
            String tmp = query.replaceAll("[^0-9.]", "");
            String[] tmp2 = tmp.split(".");
            int tmp3 = 0;
            for(String st: tmp2){
                tmp3 = tmp3 + Integer.parseInt(st);
            }
            return Integer.toString(tmp3);
        }else if (query.contains("multiplied")) {
            String tmp = query.replaceAll("[^0-9.]", "");
            String[] tmp2 = tmp.split(".");
            int tmp3 = 0;
            for(String st: tmp2){
                tmp3 = tmp3 * Integer.parseInt(st);
            }
            return Integer.toString(tmp3);
        }
        else if (query.contains("both a square and a cube")) {
            String tmp = query.replaceAll("[^0-9.]", "");
            String[] tmp2 = tmp.split(".");
            int tmp3 = 0;
            for(String st: tmp2){
                int square = Integer.parseInt(st) * Integer.parseInt(st);
                int cube = Integer.parseInt(st) * Integer.parseInt(st) * Integer.parseInt(st);
                if (square == cube) {
                    tmp3 = Integer.parseInt(st);
                }
            }
            return Integer.toString(tmp3);
        }else if (query.contains("largest")) {
            String tmp = query.replaceAll("[^0-9.]", "");
            String[] tmp2 = tmp.split(".");
            int tmp3 = 0;
            for(String st: tmp2){
                if(tmp3 < Integer.parseInt(st)){
                    tmp3 = Integer.parseInt(st);
                }
            }
            return Integer.toString(tmp3);
        }
        else if (query.contains("banana")) {

            return "yellow";
        }
        else {
            return "";
        }
    }

    // public static void main(String[] args) {
    //     System.out.println(process("what is 26 + 3"));
    // }
}
