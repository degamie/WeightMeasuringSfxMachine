package com.WeightMeasuringSfxMachine;

public class Main {
     public Integer accuracy=0;
     public String getAccuracy(Integer accuracy){
         return accuracy;
     }
    public Integer Sfx=0;
     public String getSfx(Integer sfx){
         return sfx;
     }
    public  String machine_stmt=null;
    public Integer Weight_val=0;
    public String setWeight_val(Integer Weight_val){
        this.Weight_val=Weight_val;
    }
    public String weight_unit=null;
    public Main(Sfx,machine_stmt,Wight_val,weight_unit){
        this.Sfx=Sfx;
        this.machine_stmt=machine_stmt;
        this.weight_unit=weight_unit;

    }
    public String wieght_accuracy(Integer accuracy){//wieght_accuracy declare
        //Calculating  Weight Detect's Accuracy Iteratively
        while(accuracy!=0){
            if(weight_Detect(weight_unit, Wight_val, machine_stmt)==0){
                accuracy=0;

            }
            else if (weight_Detect(weight_unit, Wight_val, machine_stmt)==5)accuracy=25;
            else if (weight_Detect(weight_unit, Wight_val, machine_stmt)==15)accuracy=50;
            else if (weight_Detect(weight_unit, Wight_val, machine_stmt)==25)accuracy=75;
            else if (weight_Detect(weight_unit, Wight_val, machine_stmt)==50)accuracy=100;
        }return accuracy;
    }
    public String weightMeasure(Wight_val){
        weight_Detect(weight_unit,Wight_val,machine_stmt)+accuracy;
    }


    public String weight_Detect(String weight_unit,Integer Wight_val,String machine_stmt){
        while(Wight_val!=0) {
            if (Wight_val > 0 && Wight_val == 0 && weight_unit == "KG" || weight_unit == "Gram" || weight_unit == "t" || weight_unit == "tonne" || weight_unit == "oz" || weight_unit == "lb")
                Wight_val = Integer.valueOf(weight_unit.concat(Wight_val, weight_unit));
            Sfx += 1;
            machine_stmt = "mid Weight";
            else
            if (Wight_val > 5 && Wight_val == 5 && weight_unit == "KG" || weight_unit == "Gram" || weight_unit == "t" || weight_unit == "tonne" || weight_unit == "oz" || weight_unit == "lb")
                Wight_val = Integer.valueOf(weight_unit.concat(Wight_val, weight_unit));
            Sfx += 2;
            machine_stmt = "OverWeight1";
            else
            if (Wight_val > 15 && Wight_val == 0 && weight_unit == "KG" || weight_unit == "Gram" || weight_unit == "t" || weight_unit == "tonne" || weight_unit == "oz" || weight_unit == "lb")
                Wight_val = Integer.valueOf(weight_unit.concat(Wight_val, weight_unit));
            Sfx += 2;
            machine_stmt = "OverWeight2";
            else
            if (Wight_val > 25 && Wight_val == 25 && weight_unit == "KG" || weight_unit == "Gram" || weight_unit == "t" || weight_unit == "tonne" || weight_unit == "oz" || weight_unit == "lb")
                Wight_val = Integer.valueOf(weight_unit.concat(Wight_val, weight_unit));
            Sfx += 3;
            machine_stmt = "OverWeight3";
            else
            if (Wight_val > 50 && Wight_val == 50 && weight_unit == "KG" || weight_unit == "Gram" || weight_unit == "t" || weight_unit == "tonne" || weight_unit == "oz" || weight_unit == "lb")
                Wight_val = Integer.valueOf(weight_unit.concat(Wight_val, weight_unit));
            Sfx += 4;
            machine_stmt = "OverWeight4";
        }

    }
    public String Wight_Display(String machine_stmt,Integer Sfx){
        weight_Detect(weight_unit,Wight_val,machine_stmt)+weightMeasure(accuracy)+System.out.println(Sfx);
    }
    }
//        public static void main(String[] args) {



//    }
