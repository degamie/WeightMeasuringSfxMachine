package com.WeightMeasuringSfxMachine;
//WID(28/10/2025)//Degamiesign
public class Main {
    public String col = null;

    public char[] weight_unit = new char[6];
    weight_unit=

    {
        "KG", "Gram", "t", "tonne", "oz", "lb"
        ;}

    public Integer Sfx = 0;
    public String machine_stmt = null;
    public String getMachine_stmt(String machine_stmt){
        return machine_stmt;
    }
    public Integer Wight_val = 0;
    public Main(String col,char[] weight_unit,Integer Sfx ,String machine_stmt,Integer Wight_val ){
        this.Sfx=Sfx;
        this.col=col;
        this.weight_unit=weight_unit;
        this.Wight_val=Wight_val;
    }
    public String OnpLaySound(Integer Sfx){
        Sfx+=weight_Detect(weight_unit, Wight_val, machine_stmt);
    }
        wieght_display(col,weight_unit,Wight_val,machine_stmt);

    public String getWight_val(Integer Wieght_val){
        return Wight_val;
    }
    public void  setWight_val(Integer Wieght_val){this.Wight_val=Wieght_val;}


    public String weight_Detect(weight_unit, Integer Wight_val, String machine_stmt) {//weight_Detect method Declare
        for (int i = 0; i < weight_unit.length(); i++) {
            while (Wight_val != 0) {
                if (Wight_val > 0 && Wight_val == 0 && weight_unit[0] || weight_unit[2] || weight_unit[3] || weight_unit[5] || weight_unit[4])
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
        } return machine_stmt + Sfx;
    }

    public String wieght_display(col, weight_unit, Integer Wight_val, String machine_stmt) {//weightdisplay  method Declare
        for (int i = 0; i < weight_unit.length(); i++) {
            while (Wight_val != 0) {
                if (Sfx == 1 && (weight_unit[0] || weight_unit[2] || weight_unit[3] || weight_unit[5] || weight_unit[4]))
                    weight_Detect(weight_unit, Wight_val, machine_stmt) col = "green";
                if (Sfx == 1 && (weight_unit[0] || weight_unit[2] || weight_unit[3] || weight_unit[5] || weight_unit[4]))
                    weight_Detect(weight_unit, Wight_val, machine_stmt) col = "yellow";
                if (Sfx == 1 && (weight_unit[0] || weight_unit[2] || weight_unit[3] || weight_unit[5] || weight_unit[4]))
                    weight_Detect(weight_unit, Wight_val, machine_stmt) col = "orange";
                if (Sfx == 1 && (weight_unit[0] || weight_unit[2] || weight_unit[3] || weight_unit[5] || weight_unit[4]))
                    weight_Detect(weight_unit, Wight_val, machine_stmt) col = "red";
            }
        } return col;//printing Color
    }
}



//        public static void main(String[] args) {



//    }
