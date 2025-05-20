package org.javaguru.student_evgenii_pashtaev.lesson_3.level_7;

class Speaker {

    String model;
     boolean condition = false;
     int volume = 0;

    Speaker(String model){
        this.model= model;
    }

    void enableSpeaker(){
            this.condition = true;

    }
    void moreVolume() {

        if (this.condition == true) {
            this.volume += 1;
        } else {
            System.out.println("Enable speaker please");
        }
    }
        void disableSpeaker(){
                this.volume = 0;
                this.condition = false;
        }
        String levelVolume(){
            String cond;

            if (this.condition == false){
                cond = "disable";
            }
            else {
                cond  = "enable";
            }
            return "level " + this.volume +"," + " Speaker is " + cond + ","  + " Speaker model: " + this.model;
        }
        int getLevel(){
            return this.volume;
        }
        String getModel(){
            return this.model;
        }
        String getConditions(){
            String cond;
            if (this.condition == true){
                cond = "Enable";
            }
            else{
                cond = "Disable";
            }
            return cond;
        }

}

