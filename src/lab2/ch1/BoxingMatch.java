package lab2.ch1;

public class BoxingMatch {
    private Fighter f1,f2;

    public BoxingMatch(Fighter fighter1 , Fighter fighter2){
        this.f1 = fighter1;
        f2 = fighter2;
    }

    public String fight(){
     while (f1.getHealth() > 0 && f2.getHealth() > 0){
         f1.attack(f2);
         if(f2.getHealth()>0){
             f1.attack(f2);
             if(f1.getHealth()<=0){
                 return f2.getName();
             } else return  f1.getName();
         }
     }
     return "No winner";
    }
}
