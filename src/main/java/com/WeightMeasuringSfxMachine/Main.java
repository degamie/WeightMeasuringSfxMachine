//WID(20/1/2026)//Sarthak Mittal Aka Degamiesign #1.1
package com.WeightMeasuringSfxMachine;

import javax.swing.text.View;
import java.util.ArrayList;


public class Main {
    public Integer measure_segment=0;
    public Integer weightcnt;public View weight_view=null;public int weight_unit=0;
    public Integer getMeasure_segment(Integer measure_segment){return measure_segment;}//measureSegment's Fetching in App
    public void setMeasure_segment(Integer measure_segment){this.measure_segment=measure_segment;}//Binding measureSegment in App   
    public int weight_view=0;
    weightcnt=0;
    public void setWeightcnt(Integer weightcnt){this.weightcnt=weightcnt;}//Binding WeightCount in App
    public Integer getWeightcnt(Integer weightcnt){return weightcnt;}//Fetching WeightCount in Server
    public Integer updateByWieghtCount(Integer weightcnt){
        getWeightcnt(weightcnt)+setWeightcnt(weightcnt)+1;
        return weightcnt;
    }
    public void existsByWeightCount(Integer WeightCount){
        if(weightcnt>0)getWeightcnt(weightcnt);
        else getWeightcnt(0);
    }
    public Main main;
    public View Weight_View;
    public View  getWeight_View(int weight_View){return weight_View;}// WeightView's Fetching
    public void setWeight_View(View Weight_View){this.Weight_View=Weight_View;}//Biding Weight View in App
    public void updateByWeightView(View weight_View){getWeight_View(weight_View)+setWeight_View(Weight_View)+1;}//Updating Weight View in App
    public void existsByWieghtView(View weight_View){
        if(weight_View>0)getWeight_View(weight_View);
        else getWeight_View(0);

    }
    public ArrayList<String>weight_menu=new ArrayList<>();
    public String weight_unit=null;
    public Main(Sfx,machine_stmt,Weight_val,weight_unit){
        this.Sfx=Sfx;
        this.machine_stmt=machine_stmt;
        this.weight_unit=weight_unit;
    }
    public void existsByweightCnt(Integer weightcnt){if(weightcnt>0)getWeightcnt(weightcnt);else getWeightcnt(0);}//Chekcing weightCnt's Ex
    public void setWeight_menu(ArrayList<String>weight_menu){this.weight_menu=weight_menu;}//Bidning Wieght Menu
    public void updateByWeightMenu(ArrayList<String>weight_menu){getweight_menu(weight_menu)+setWeight_menu(weight_menu)+1;}//Updating WeightMenu in App
    public String existsByWeightMenu(ArrayList<String> weight_menu){if(weight_menu.size()>0)getweight_menu(weight_menu);else getweight_menu(0);}//Updating Weight Menu in App
    public ArrayList<String> getweight_menu(ArrayList<String>weight_menu){return weight_menu;}//Printing Wieght menu in ir.
    public ArrayList<String>weight_menu(ArrayList<String>weight_menu){getweight_menu(weight_menu)+setWeight_menu(weight_menu)+1;}//Updating weight_menu in Server
    public String getWeight_unit(String weight_unit){return weight_unit;}
    public void  setWeight_unit(String weight_unit){ this.weight_unit;}//Binding  Weight Unit
    public String updateAllByweight_unit(String weight_unit){getWeight_unit(weight_unit)+setWeight_Unit(weight_unit)+1;}//udpating Weight Unit
//    public String updateAllByWeight_unit(String weight_unit){getWeight_unit(weight_unit)+setWeight_unit(weight_unit)+1;}//Updating WiegthWUnit In App #1

     public Integer accuracy=0;
     public void setAccuracy(Integer accuracy){this.accuracy=accuracy;}
     public Integer getAccuracy(Integer accuracy){
         return accuracy;
     }
     public Integer updateAllByAccuracy(Integer accuracy){getAccuracy(accuracy)+setAccuracy(accuracy);}
    public void existsByWeightUnit(Integer weight_unit){
         if(weight_unit>0)getWeight_Unit(weight_unit);
         else getWeight_Unit(0);
    }
    public String existByaccuracy(Integer accuracy){
         if(accuracy>0)getAccuracy(accuracy);
         else getAccuracy(0);
    }
    public Integer Sfx=0;
     public Integer setSfx(Integer Sfx){this.Sfx=Sfx;}
     public Integer getSfx(Integer sfx){
         return sfx;
     }
    public Integer updateAllBySfx(Integer Sfx){getSfx(Sfx)+setSfx(Sfx)+1;}//Updating Sfx In Server
//    public Integer existsBySfx(Integer sfx)
    public  String  existsBySfx(Integer Sfx){
        if(Sfx>0)getSfx(Sfx);
        else getSfx(0);
        return "SFX Exists in App";
    }
    public  String machine_stmt=null;
    public String getMachine_stmt(int machine_stmt){
        return machine_stmt;
    }
    public Integer setMachine_stmt(Integer Sfx){
        this.Sfx=Sfx;
    }
     public String updateAllBYMachineStmt(String machine_stmt){getMachine_stmt(machine_stmt)+setMachine_stmt(machine_stmt);}
    public void existsbyMachineStmt(Integer machine_stmt){
        if(machine_stmt>0)getMachine_stmt(machine_stmt);
        else getMachine_stmt(0);
    }   

    public Integer Weight_val=0;
     public Integer getWieghtVal(Integer Weight_val){
         return Weight_val;
     }
    public void setWeight_val(Integer Weight_val){
        this.Weight_val=Weight_val;
    }//bidning Weight_Val
    public Integer updateAllByWeightVal(Integer Weight_val){
        getWieghtVal(Weight_val)+setWeight_val(Weight_val)+1;
        return Weight_val;
    }
    public void existsByWeightVal(Integer Weight_Val){
         if(Weight_Val>0)getWieghtVal(Weight_Val);
         else getWieghtVal(0);
    }

    public String getWeight_Unit(int weight_unit){
        return weight_unit;
    }
    public void setWeight_Unit(int weight_unit){this.weight_unit=weight_unit;}//Binidng Weight Unit in App
    public String updateAllByWeightUnit(String weight_unit){getWeight_unit(weight_unit)+setWeight_Unit(weight_unit)+1;}//Updating Weight Unit in Server
    //public String updateAllByWeightUnit(String Weight_Unit){getWeight_unit(weight_unit)+setWeight_Unit(weight_unit)+1;}//Updating Weight Unit in App
//    public String getWeight_val(Integer Weight_val){
//        return Weight_val;
//    }




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
    public Integer updateAllByweightDetect(String weight_unit,Integer Wight_val,String machine_stmt){
         getweight_Detect(weight_unit,Wight_val,machine_stmt)+setWieghtDetect(weight_unit,Wight_val,machine_stmt)+1;
    }
    public void existsByWeightDetect(String weight_unit,Integer Wight_val,String machine_stmt){
         if(weight_unit !=null && Weight_val>0 && machine_stmt !=null){
             getweight_Detect(weight_unit,Wight_val,machine_stmt);
         }
         else  getweight_Detect(0,0,0);
    }
    public void setWieghtDetect(String weight_unit,Integer Wight_val,String machine_stmt){this.weight_Detect(weight_unit,machine_stmt,Wight_val)=weight_Detect(weight_unit,machine_stmt,Wight_val);}//binding Weight Detect in App
    public String getweight_Detect(String weight_unit,Integer Wight_val,String machine_stmt){weight_Detect(0,5,"Overiwieght1")+1;  }//Fethcing Weight Detec in tApp

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
    public Integer getAccuracy(Integer accuracy){weight_accuracy(accuracy);}//Fetching Accuracy in App
    public Integer setAccuracy(Integer accuracy){this.accuracy=accuracy;}//Binding Accuracy in App
    public Integer existsByaccuracy(Integer accuracy){if(accuracy>0)getAccuracy(accuracy);else getAccuracy(0);}//Checking Accuracy's Existence in App
    public Integer updateByaccuracy(Integer accuracy){getAccuracy(accuracy)+setAccuracy(accuracy)+1;}//updating Accuracy in App
    public Integer weightMeasure(Integer Weight_val, Integer accuracy){
        weight_Detect(weight_unit,Weight_val,machine_stmt)+ this.accuracy;
    }
    public Integer getAllByWeightMeasure(Integer Weight_val, Integer accuracy){weightMeasure( Weight_val,  accuracy);}
    public Integer setAllByWeightMeasure(Integer Weight_val, Integer accuracy){this.weightMeasure(Weight_val,accuracy)=weightMeasure(Weight_val,accuracy);}
    public Integer updateByweightMeasure(Integer Weight_val,Integer accuracy){getAllByWeightMeasure(Weight_val,accuracy)+setAllByWeightMeasure(Weight_val,accuracy)+1;}//Updating Weight's measure on App
    public  String  existsByWeightMeasure(Integer Weight_val,Integer accuracy){if(Weight_val>0)getAllByWeightMeasure(Weight_val,accuracy);else getAllByWeightMeasure(0,0);}//Checking Weight Measure  Existence in App

    public Integer Wight_Display(String machine_stmt,Integer Sfx,Integer accuracy){
        weight_Detect(weight_unit,Weight_val,machine_stmt)+weightMeasure(accuracy)+System.out.println(Sfx);
    }
    public Integer updateByWeightVal(Integer weight_val){getWieghtVal(weight_val)+setWeight_val(weight_val)+1;}//Updating Weight Val in App
    public  void existsByWeightVal(Integer weight_val){if(weight_val>0)getWieghtVal(weight_val);else getWieghtVal(0);}//Checking WeightVal's Existence in App
    }
//        public static void main(String[] args) {

