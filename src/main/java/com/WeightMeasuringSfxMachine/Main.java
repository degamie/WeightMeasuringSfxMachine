package com.WeightMeasuringSfxMachine;

import java.util.ArrayList;

//WID(5/11/2025)//Aka Degamiesign
public class Main {
    public ArrayList<String>weight_menu=new ArrayList<>();
    public String weight_unit=null;
    public Main(Sfx,machine_stmt,Weight_val,weight_unit){
        this.Sfx=Sfx;
        this.machine_stmt=machine_stmt;
        this.weight_unit=weight_unit;

    }
    public void  setWeight_unit(String weight_unit){ this.weight_unit;}//Binding  Weight Unit
    public String getWeight_unit(String weight_unit){return weight_unit;}
     public Integer accuracy=0;
     public void setAccuracy(Integer accuracy){this.accuracy=accuracy;}
     public Integer getAccuracy(Integer accuracy){
         return accuracy;
     }
     public Integer updateAllByAccuracy(Integer accuracy){getAccuracy(accuracy)+setAccuracy(accuracy);}
    public Integer Sfx=0;
     public String setSfx(Integer Sfx){this.Sfx=Sfx;}
     public Integer getSfx(Integer sfx){
         return sfx;
     }
    public  String machine_stmt=null;
    public String getMachine_stmt( String machine_stmt){
        return machine_stmt;
    }
    public Integer setMachine_stmt(Integer Sfx){
        this.Sfx=Sfx;
    }
     public String updateAllBYMachineStmt(String machine_stmt){getMachine_stmt(machine_stmt)+setMachine_stmt(machine_stmt);}

    public Integer Weight_val=0;
     public Integer getWieghtVal(Integer Weight_val){
         return Weight_val;
     }
    public String setWeight_Unit(String weight_unit){
        return weight_unit;
    }
//    public String getWeight_val(Integer Weight_val){
//        return Weight_val;
//    }
    public void setWeight_val(Integer Weight_val){
        this.Weight_val=Weight_val;
    }//bidning Weight_Val



    public Integer weight_Detect(String weight_unit,Integer Wight_val,String machine_stmt){
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
    public Integer weight_accuracy(Integer accuracy){//wieght_accuracy declare
        //Calculating  Weight Detect's Accuracy Iteratively
        while(accuracy!=0){
            if(weight_Detect(weight_unit, Weight_val, machine_stmt)==0){
                accuracy=0;

            }
            else if (weight_Detect(weight_unit, Weight_val, machine_stmt)==5)accuracy=25;
            else if (weight_Detect(weight_unit, Weight_val, machine_stmt)==15)accuracy=50;
            else if (weight_Detect(weight_unit, Weight_val, machine_stmt)==25)accuracy=75;
            else if (weight_Detect(weight_unit, Weight_val, machine_stmt)==50)accuracy=100;
        }return accuracy;
    }
    public Integer weightMeasure(Integer Weight_val, Integer accuracy){
        weight_Detect(weight_unit,Weight_val,machine_stmt)+ this.accuracy;
    }

    public Integer Wight_Display(String machine_stmt,Integer Sfx,Integer accuracy){
        weight_Detect(weight_unit,Weight_val,machine_stmt)+weightMeasure(accuracy)+System.out.println(Sfx);
    }
    }
//        public static void main(String[] args) {

