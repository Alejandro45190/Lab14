package com.mycompany.lab14;

public class Materials {
    
    private final String soft;
    private final String hard;
    private final String lightWeight;
    private final String heavy;
    private final String transparent;
    private final String translucent;
    private final String opaque;
    private final String rigid;
    private final String bendy;
    private final String elastic;
    private final String breathable;
    private final String nonbreathable;
    private final String waterproof;
    private final String absorbent;
    private final String windproof;
    private final String moistureResistant;
    private final String shiny;
    private final String antibacterial;
    private final String heatResistant;
    private final String coldResistant;
    private final String acidResistant;
    private final String alcoholResistant;
    private final String alkaliResistant;
    private final String mineralOilResistant;
    private final String recyclable;

    public Materials(Builder builder) {
        soft = builder.soft;
        hard = builder.hard;
        lightWeight = builder.lightWeight;
        heavy = builder.heavy;
        transparent = builder.transparent;
        translucent = builder.translucent;
        opaque = builder.opaque;
        rigid = builder.rigid;
        bendy = builder.bendy;
        elastic = builder.elastic;
        breathable = builder.breathable;
        nonbreathable = builder.nonbreathable;
        waterproof = builder.waterproof;
        absorbent = builder.absorbent;
        windproof = builder.windproof;
        moistureResistant = builder.moistureResistant;
        shiny = builder.shiny;
        antibacterial = builder.antibacterial;
        heatResistant = builder.heatResistant;
        coldResistant = builder.coldResistant;
        acidResistant = builder.acidResistant;
        alcoholResistant = builder.alcoholResistant;
        alkaliResistant = builder.alkaliResistant;
        mineralOilResistant = builder.mineralOilResistant;
        recyclable = builder.recyclable;
    }

    public String getSoft() {
        return soft;
    }

    public String getHard() {
        return hard;
    }

    public String getLightWeight() {
        return lightWeight;
    }

    public String getHeavy() {
        return heavy;
    }

    public String getTransparent() {
        return transparent;
    }

    public String getTranslucent() {
        return translucent;
    }

    public String getOpaque() {
        return opaque;
    }

    public String getRigid() {
        return rigid;
    }

    public String getBendy() {
        return bendy;
    }

    public String getElastic() {
        return elastic;
    }

    public String getBreathable() {
        return breathable;
    }

    public String getNonbreathable() {
        return nonbreathable;
    }

    public String getWaterproof() {
        return waterproof;
    }

    public String getAbsorbent() {
        return absorbent;
    }

    public String getWindproof() {
        return windproof;
    }

    public String getMoistureResistant() {
        return moistureResistant;
    }

    public String getShiny() {
        return shiny;
    }

    public String getAntibacterial() {
        return antibacterial;
    }

    public String getHeatResistant() {
        return heatResistant;
    }

    public String getColdResistant() {
        return coldResistant;
    }

    public String getAcidResistant() {
        return acidResistant;
    }

    public String getAlcoholResistant() {
        return alcoholResistant;
    }

    public String getAlkaliResistant() {
        return alkaliResistant;
    }

    public String getMineralOilResistant() {
        return mineralOilResistant;
    }

    public String getRecyclable() {
        return recyclable;
    }

    @Override
    public String toString() {
        return "Materials{" + "soft= " + soft
                + ", hard= " + hard
                + ", lightWeight= " + lightWeight
                + ", heavy= " + heavy
                + ", transparent= " + transparent
                + ", translucent= " + translucent
                + ", opaque= " + opaque
                + ", \n rigid= " + rigid
                + ", bendy= " + bendy
                + ", elastic= " + elastic
                + ", breathable= " + breathable
                + ", nonbreathable= " + nonbreathable
                + ", waterproof= " + waterproof
                + ", absorbent= " + absorbent
                + ", windproof= " + windproof 
                + ", moistureResistant= " + moistureResistant 
                + ", \n shiny= " + shiny
                + ", antibacterial= " + antibacterial
                + ", heatResistant= " + heatResistant
                + ", coldResistant= " + coldResistant
                + ", acidResistant= " + acidResistant
                + ", alcoholResistant= " + alcoholResistant
                + ", alkaliResistant= " + alkaliResistant
                + ", mineralOilResistant= " + mineralOilResistant
                + ", recyclable= " + recyclable + '}';
    }
    
    public static class Builder {
        private final String soft;
        private final String hard;
        private final String lightWeight;
        private final String heavy;
        private String transparent;
        private String translucent;
        private String opaque;
        private String rigid;
        private String bendy;
        private String elastic;
        private String breathable;
        private String nonbreathable;
        private String waterproof;
        private String absorbent;
        private String windproof;
        private String moistureResistant;
        private String shiny;
        private String antibacterial;
        private String heatResistant;
        private String coldResistant;
        private String acidResistant;
        private String alcoholResistant;
        private String alkaliResistant;
        private String mineralOilResistant;
        private String recyclable;
        
        //these are the mandatory
        public Builder(String soft, String hard, 
                String lightWeight, String heavy) {
            this.soft = soft;
            this.hard = hard;
            this.lightWeight = lightWeight;
            this.heavy = heavy;
        }
        
        public Builder transparent (String feature) {
            transparent = feature;
            return this;
        }
        
        public Builder translucent (String feature) {
            translucent = feature;
            return this;
        }
        
        public Builder opaque (String feature) {
            opaque = feature;
            return this;
        }
        
        public Builder rigid (String feature) {
            rigid = feature;
            return this;
        }
        
        public Builder bendy (String feature) {
            bendy = feature;
            return this;
        }
        
        public Builder elastic (String feature) {
            elastic = feature;
            return this;
        }
        
        public Builder breathable (String feature) {
            breathable = feature;
            return this;
        }
        
        public Builder nonbreathable (String feature) {
            nonbreathable = feature;
            return this;
        }
        
        public Builder waterproof (String feature) {
            waterproof = feature;
            return this;
        }
        
        public Builder absorbent (String feature) {
            absorbent = feature;
            return this;
        }
        
        public Builder windproof (String feature) {
            windproof = feature;
            return this;
        }
        
        public Builder moistureResistant (String feature) {
            moistureResistant = feature;
            return this;
        }
        
        public Builder shiny (String feature) {
            shiny = feature;
            return this;
        }
        
        public Builder antibacterial (String feature) {
            shiny = feature;
            return this;
        }
        
        public Builder heatResistant (String feature) {
            heatResistant = feature;
            return this;
        }
        
        public Builder coldResistant (String feature) {
            coldResistant = feature;
            return this;
        }
        
        public Builder acidResistant (String feature) {
            acidResistant = feature;
            return this;
        }
        
        public Builder alcoholResistant (String feature) {
            alcoholResistant = feature;
            return this;
        }
        
        public Builder alkaliResistant (String feature) {
            alkaliResistant = feature;
            return this;
        }
        
        public Builder mineralOilResistant (String feature) {
            mineralOilResistant = feature;
            return this;
        }
        
        public Builder recyclable (String feature) {
            recyclable = feature;
            return this;
        }
        
        public Materials build() { 
            return new Materials(this);
        }
    }    
}
