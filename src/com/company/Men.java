package com.company;

 class Men extends Humen {
     @Override
     public boolean speak(Humen m1) {
         if (m1.sex == false)
             return true;
         else return false;
     }

     @Override
     public boolean somethingtime(Humen m1) {
         return true;
     }

     @Override
     public boolean terpeti(Humen m1) {
         if (m1.sex == false)
             return true;
         else return false;
     }

     @Override
     public Humen relative(Humen m1) {
         if (m1.sex == true)
             return null;
         else return m1;
     }

     public Men(String name, String surname, float casse, float weight) {
         this.name = name;
         this.casse = casse;
         this.sex = true;
         this.weight = weight;
         this.surname = surname;
     }

     public Men() {

     }
 }
