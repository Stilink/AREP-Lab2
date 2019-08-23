package edu.arep;

import static spark.Spark.*;

import java.util.StringTokenizer;

/**
 * Spark
 */
public class Spark {
    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("/");
        get("/", (req, res) ->{
            res.redirect("index.html");
            return null;
        }
        );
        get("/calc", (req, res) ->{
            StringTokenizer stk = new StringTokenizer(req.queryParams("data"));
            LinkedList list = new LinkedList();
            try{
                while(stk.hasMoreTokens()) list.add(Double.parseDouble(stk.nextToken()));
            }catch(Exception e){
                return "Números invalidos.";
            }
            list.restart();
            return "La media es: "+Calculator.mean(list)+" \n"+
            "La desviación es: "+Calculator.deviation(list);
        }
        );
    }
    
    
    
    static int getPort() {
        if (System.getenv("PORT") != null) return Integer.parseInt(System.getenv("PORT"));
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

    
}