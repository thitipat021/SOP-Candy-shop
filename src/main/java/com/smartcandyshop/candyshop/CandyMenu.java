package com.smartcandyshop.candyshop;

import java.util.List;
import java.util.ArrayList;

public class CandyMenu {
    public static Candies[] allCandy = new Candies[]{
            new CandyFactory().createChoco(1,"M&M",20.0),
            new CandyFactory().createLoli(2,"Chupachups",10.0),
            new CandyFactory().createJelly(3,"Jellybelly",15.0),
            new CandyFactory().createBubble(4,"Doublemint",10.0),
            new CandyFactory().createMello(5,"Kraft",40.0),
            new CandyFactory().createCandy(6,"Mentos",10.0),
            new CandyFactory().createChoco(7,"Snickers",15.0),
            new CandyFactory().createBubble(8,"Lotte",10.0),
            new CandyFactory().createJelly(9,"Haribo",25.0),
            new CandyFactory().createChoco(10,"Wonka",100.0),
            new CandyFactory().createJelly(11,"Nerds",30.0)
    };

    public static Candies[] getAllCandy() {
        return allCandy;
    }

    public Candies getCandy(int ID){
        for (Candies item: allCandy) {
            if (item.getId() == ID) return item;
        }
        return null;
    }

    private static List<Candies> watchType(candyType type){
        List<Candies> outputs = new ArrayList<Candies>();
        for (Candies item : allCandy) {
            if (item.getType() == type) {
                outputs.add(item);
            }
        }
        return outputs;

    }
//    public static List<Candies> getCandyCategory(int inputType){
//        List<Candies> output = new ArrayList<Candies>();
//        switch (inputType){
//            case 1: {
//                output = watchType(candyType.Chocolate);
//                break;
//            }
//            case 2: {
//                output = watchType(candyType.Lollipop);
//                break;
//            }
//            case 3: {
//                output = watchType(candyType.Jellybean);
//                break;
//            }
//            case 4: {
//                output = watchType(candyType.Bubblegum);
//                break;
//            }
//            case 5: {
//                output = watchType(candyType.Marshmallow);
//                break;
//            }
//            case 6: {
//                output = watchType(candyType.Candy);
//                break;
//            }
//        }
//        return output;
//    }
}
