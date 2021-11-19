package com.mycompany.lab14;

public class Main {
    
    public static void main(String[] args) {
        
        //soft or hard, light-weight or heavy, transparent or translucent or opaque, rigid or bendy 
        //or  elastic,  breathable  or  nonbreathable,  waterproof,  absorbent,  windproof,  moisture-resistant,  shiny, 
        //antibacterial,  heat-resistant,  cold-resistant,  acid-resistant,  alcohol-resistant,  alkali-resistant,  mineral oil-
        //resistant, and recyclable. 
        Materials rubber = new Materials.Builder("it can be soft", "it can be hard",
                "it can be light", "it can be heavy").elastic("it is elastic").waterproof("it is waterproof").build();
        System.out.println(rubber);
    }
}
