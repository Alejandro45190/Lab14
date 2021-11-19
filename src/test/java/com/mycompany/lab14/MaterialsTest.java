package com.mycompany.lab14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaterialsTest {

    /**
     * Test of toString method, of class Materials.
     */
    @Test
    public void testToString() {
        //metal
        String expResult = "Materials{soft= it is not soft, hard= it is hard,"
                + " lightWeight= it can be lightweight, heavy= it can be heavy,"
                + " transparent= null, translucent= null, opaque= It can not be "
                + "seen through, \n" + " rigid= it is rigid, bendy= null, "
                + "elastic= null, breathable= null, " + "nonbreathable= null, "
                + "waterproof= null, absorbent= null, windproof= null, "
                + "moistureResistant= null, \n" + " shiny= null, "
                + "antibacterial= null, heatResistant= null, "
                + "coldResistant= null, acidResistant= null, "
                + "alcoholResistant= null, alkaliResistant= null, "
                + "mineralOilResistant= null, recyclable= most are recyclable}";
        Materials metal = new Materials.Builder("it is not soft", "it is hard",
                "it can be lightweight", "it can be heavy").opaque("It can not"
                + " be seen through").rigid("it is rigid").recyclable("most are"
                + " recyclable").build();
        String result = metal.toString();
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testToString2() {
        //plastic
        String expResult = "Materials{soft= it is kinda soft, hard= it is kinda"
                + " hard, lightWeight= it is lightweight, heavy= it is not"
                + " heavy, transparent= some are transparent, translucent= some "
                + "are translucent, opaque= null, \n" + " rigid= null, bendy= "
                + "it is bendy, elastic= null, breathable= null, nonbreathable="
                + " null, waterproof= it is waterproof, absorbent= null, "
                + "windproof= null, moistureResistant= it is moistureResistant,"
                + " \n" + " shiny= null, antibacterial= null, heatResistant= "
                + "null, coldResistant= null, acidResistant= null, "
                + "alcoholResistant= null, alkaliResistant= null, "
                + "mineralOilResistant= null, recyclable= null}";
        Materials plastic = new Materials.Builder("it is kinda soft", "it is"
                + " kinda hard", "it is lightweight", "it is not heavy")
                .translucent("some are translucent").transparent("some are"
                + " transparent").bendy("it is bendy").waterproof("it is "
                + "waterproof").moistureResistant("it is moistureResistant")
                .build();
        String result = plastic.toString();
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testToString3() {
        //wood
        String expResult = "Materials{soft= it is not soft, hard= it is hard, "
        + "lightWeight= it is not light, heavy= it can be heavy, transparent= "
        + "null, translucent= null, opaque= It can not seen through, \n" +
        " rigid= it is rigid, bendy= null, elastic= null, breathable= null, "
        + "nonbreathable= null, waterproof= null, absorbent= it is absorbent, "
        + "windproof= null, moistureResistant= null, \n" + " shiny= null, "
        + "antibacterial= null, heatResistant= null, coldResistant= null, "
        + "acidResistant= null, alcoholResistant= null, alkaliResistant= null, "
        + "mineralOilResistant= null, recyclable= null}";
        Materials wood = new Materials.Builder("it is not soft", "it is hard",
                "it is not light", "it can be heavy").opaque("It can not"
                + " seen through").rigid("it is rigid").absorbent("it is absorbent").build();
        String result = wood.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString4() {
        //leather
        String expResult = "Materials{soft= it is soft, hard= it is not hard, "
        + "lightWeight= it is light, heavy= it is not heavy, transparent= null, "
        + "translucent= null, opaque= It can not be seen through, \n" +
        " rigid= null, bendy= null, elastic= it is elastic, breathable= null, "
        + "nonbreathable= null, waterproof= null, absorbent= null, windproof= "
        + "null, moistureResistant= null, \n" + " shiny= it can be shiny, "
        + "antibacterial= null, heatResistant= null, coldResistant= null, "
        + "acidResistant= null, alcoholResistant= null, alkaliResistant= null, "
        + "mineralOilResistant= null, recyclable= null}";
        Materials leather = new Materials.Builder("it is soft", "it is not hard",
                "it is light", "it is not heavy").opaque("It can not"
                + " be seen through").elastic("it is elastic").shiny("it can be shiny").build();
        String result = leather.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString5() {
        //stone
        String expResult = "Materials{soft= it is not soft, hard= it is hard, "
        + "lightWeight= it can be light, heavy= it can be heavy, transparent= "
        + "null, translucent= null, opaque= null, \n" + " rigid= it is rigid, "
        + "bendy= null, elastic= null, breathable= null, nonbreathable= null, "
        + "waterproof= null, absorbent= null, windproof= null, "
        + "moistureResistant= null, \n" + " shiny= null, antibacterial= null, "
        + "heatResistant= null, coldResistant= null, acidResistant= null, "
        + "alcoholResistant= null, alkaliResistant= null, mineralOilResistant= "
        + "null, recyclable= null}";
        Materials stone = new Materials.Builder("it is not soft", "it is hard",
                "it can be light", "it can be heavy").rigid("it is rigid").build();
        String result = stone.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString6() {
        //glass
        String expResult = "Materials{soft= it is not soft, hard= it is hard, "
        + "lightWeight= it can be light, heavy= it can be heavy, transparent= "
        + "null, translucent= null, opaque= null, \n" + " rigid= it is rigid, "
        + "bendy= null, elastic= null, breathable= null, nonbreathable= null, "
        + "waterproof= null, absorbent= null, windproof= null, "
        + "moistureResistant= null, \n" + " shiny= null, antibacterial= null, "
        + "heatResistant= null, coldResistant= null, acidResistant= null, "
        + "alcoholResistant= null, alkaliResistant= null, mineralOilResistant= "
        + "null, recyclable= null}";
        Materials stone = new Materials.Builder("it is not soft", "it is hard",
                "it can be light", "it can be heavy").rigid("it is rigid").build();
        String result = stone.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString7() {
        //plaster
        String expResult = "Materials{soft= it is soft at first, hard= it "
        + "hardens after time, lightWeight= it can be light, heavy= it can be "
        + "heavy, transparent= null, translucent= null, opaque= null, \n" +
        " rigid= null, bendy= null, elastic= null, breathable= null, "
        + "nonbreathable= null, waterproof= it is almost waterproof, absorbent= "
        + "null, windproof= null, moistureResistant= null, \n" + " shiny= null, "
        + "antibacterial= null, heatResistant= it is heat Resitant, "
        + "coldResistant= it is cold Resitant, acidResistant= null, "
        + "alcoholResistant= null, alkaliResistant= null, mineralOilResistant= "
        + "null, recyclable= null}";
        Materials plaster = new Materials.Builder("it is soft at first", "it hardens after time",
                "it can be light", "it can be heavy").waterproof("it is almost "
                + "waterproof").heatResistant("it is heat Resitant")
                .coldResistant("it is cold Resitant").build();
        String result = plaster.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString8() {
        //rubber
        String expResult = "Materials{soft= it can be soft, hard= it can be hard,"
        + " lightWeight= it can be light, heavy= it can be heavy, transparent= "
        + "null, translucent= null, opaque= null, \n" + " rigid= null, bendy= "
        + "null, elastic= it is elastic, breathable= null, nonbreathable= null, "
        + "waterproof= it is waterproof, absorbent= null, windproof= null, "
        + "moistureResistant= null, \n" + " shiny= null, antibacterial= null, "
        + "heatResistant= null, coldResistant= null, acidResistant= null, "
        + "alcoholResistant= null, alkaliResistant= null, mineralOilResistant= "
        + "null, recyclable= null}";
        Materials rubber = new Materials.Builder("it can be soft", "it can be "
                + "hard", "it can be light", "it can be heavy").elastic("it is "
                + "elastic").waterproof("it is waterproof").build();
        String result = rubber.toString();
        assertEquals(expResult, result);
    }
    
}
