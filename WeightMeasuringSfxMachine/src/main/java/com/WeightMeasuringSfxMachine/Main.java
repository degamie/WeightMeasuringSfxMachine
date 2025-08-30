package com.WeightMeasuringSfxMachine;

public class Main {
    public Integer Sfx=0;
    public  String machine_stmt=null;
    public Integer Wight_val=0;
    public String weight_unit=null;

    public String weight_Detect(String weight_unit,Integer Wight_val,String machine_stmt){
        while(Wight_val!=0){
            if(Wight_val>0 && Wight_val==0 && weight_unit=="KG" || weight_unit=="Gram" || weight_unit=="t"  || weight_unit=="tonne"  || weight_unit=="oz"  || weight_unit=="lb" )Wight_val= Integer.valueOf(weight_unit.concat(Wight_val,weight_unit));Sfx+=1;machine_stmt="mid Weight";
            else if (Wight_val>5 && Wight_val==5 && weight_unit=="KG" || weight_unit=="Gram" || weight_unit=="t"  || weight_unit=="tonne"  || weight_unit=="oz"  || weight_unit=="lb" )Wight_val= Integer.valueOf(weight_unit.concat(Wight_val,weight_unit));Sfx+=2;machine_stmt="OverWeight1";
            else if (Wight_val>15 && Wight_val==0 && weight_unit=="KG" || weight_unit=="Gram" || weight_unit=="t"  || weight_unit=="tonne"  || weight_unit=="oz"  || weight_unit=="lb" )Wight_val= Integer.valueOf(weight_unit.concat(Wight_val,weight_unit));Sfx+=2;machine_stmt="OverWeight2";
            else if (Wight_val>25 && Wight_val==25 && weight_unit=="KG" || weight_unit=="Gram" || weight_unit=="t"  || weight_unit=="tonne"  || weight_unit=="oz"  || weight_unit=="lb" )Wight_val= Integer.valueOf(weight_unit.concat(Wight_val,weight_unit));Sfx+=3;machine_stmt="OverWeight3";
            else if (Wight_val>50 && Wight_val==50 && weight_unit=="KG" || weight_unit=="Gram" || weight_unit=="t"  || weight_unit=="tonne"  || weight_unit=="oz"  || weight_unit=="lb" )Wight_val= Integer.valueOf(weight_unit.concat(Wight_val,weight_unit));Sfx+=4;machine_stmt="OverWeight4";
        }return machine_stmt+Sfx;

    }
    }
//        public static void main(String[] args) {



//    }
