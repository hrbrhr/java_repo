package org.javaguru.student_anastassija.lesson_5.level_1;

 class Light {

     boolean Violet (int wavelength){return (wavelength >= 380) && (wavelength <= 449);}
     boolean Blue (int wavelength){return (wavelength >= 450) && (wavelength <= 494);}
     boolean Green (int wavelength){return (wavelength >= 495) && (wavelength <= 569);}
     boolean Yellow (int wavelength){return (wavelength >= 570) && (wavelength <= 589);}
     boolean Orange (int wavelength){return (wavelength >= 590) && (wavelength <= 619);}
     boolean Red (int wavelength){return (wavelength >= 620) && (wavelength <= 750);}

     public String detect (int wavelength){
         if (Violet(wavelength)){
             return "Violet";
         } else if (Blue(wavelength)){
             return "Blue";
         } else if (Green(wavelength)){
             return "Green";
         } else if (Yellow(wavelength)) {
             return ("Yellow");
         } else if (Orange(wavelength)){
                 return "Orange";
         } else if (Red(wavelength)){
             return "Red";
         } else {
             return "Invisible Light";
         }
     }
}
