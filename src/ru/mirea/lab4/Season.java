package ru.mirea.lab4;

public enum Season {

    Winter (-10){
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },

    Summer(26){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },

    Autumn(10){
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    Spring(17){
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };
    private final int SeasonTemp;
    private Season (int SeasonTemp) {
        this.SeasonTemp = SeasonTemp;
    }
    public int getSeasonTemp(){
        return this.SeasonTemp;
    }
    public String getDescription() {
        return "время года";
    }
}