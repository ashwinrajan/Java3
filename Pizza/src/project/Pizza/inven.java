/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Pizza;
import java.io.*;
import java.util.*;
/**
 *
 * @author ramneet
 */
public class inven { 
    
    public static void upin(int  base,int dip[] ,int pop[],int top[],int chips )throws FileNotFoundException, IOException{
        RandomAccessFile f = new RandomAccessFile(new File("inven.txt"), "rw");
        long index = 0 ;
        byte [] baseby = new byte[4];
byte [] popby = new byte[4];
byte [] dipby= new byte[4];
byte [] topby= new byte[4];
byte [] chipsby = new byte[4];
        if(base==1)
            index = 0;
        else if (base==2)
            index = 4;
        else if (base == 3)
            index = 8;
        else if(base==4)
            index = 12;
        if (base>0){
        f.seek(index);
        
        f.read(baseby);
        String readbase = new String(baseby);
        readbase = readbase.trim();
        int i = Integer.parseInt(readbase);
        i=i-1;
        readbase = ""+i;
        baseby = convertToByteArray(readbase);
        f.seek(index);
        f.write(baseby);
        }
        if (dip[0] > 0)
           {
        index=16; 
        f.seek(index);
        f.read(dipby);
        String readdip = new String(dipby);
        readdip = readdip.trim();
        int l= Integer.parseInt(readdip);
        l=l-1;
        readdip = ""+l;
        dipby = convertToByteArray(readdip);
        f.seek(index);
        f.write(dipby);
            }
        if(dip[1] > 0){
            index=20;
        f.seek(index);
        f.read(dipby);
        String readdip = new String(dipby);
        readdip = readdip.trim();
        int l= Integer.parseInt(readdip);
        l=l-1;
        readdip = ""+l;
        dipby = convertToByteArray(readdip);
        f.seek(index);
        f.write(dipby);
            }
        if(dip[2]>0){
           index=24;
        f.seek(index);
        f.read(dipby);
        String readdip = new String(dipby);
        readdip = readdip.trim();
        int l= Integer.parseInt(readdip);
        l=l-1;
        readdip = ""+l;
        dipby = convertToByteArray(readdip);
        f.seek(index);
        f.write(dipby);
            }
        
        if (pop[0]>0)
        {
           index=28;
        f.seek(index);
        f.read(popby);
        String readpop = new String(popby);
        readpop = readpop.trim();
         int t = Integer.parseInt(readpop);
        t=t-1;
        readpop = ""+t;
        popby = convertToByteArray(readpop);
        f.seek(index);
        f.write(popby);
        }
         if(pop[1]>0){
            index=32;
        f.seek(index);
        f.read(popby);
        String readpop = new String(popby);
        readpop = readpop.trim();
         int t = Integer.parseInt(readpop);
        t=t-1;
        readpop = ""+t;
        popby = convertToByteArray(readpop);
        f.seek(index);
        f.write(popby);
        }
         if(pop[2]>0){
            index=36;
        f.seek(index);
        f.read(popby);
        String readpop = new String(popby);
        readpop = readpop.trim();
         int t = Integer.parseInt(readpop);
        t=t-1;
        readpop = ""+t;
        popby = convertToByteArray(readpop);
        f.seek(index);
        f.write(popby);
        }
        else if(pop[3]>0)
        {
           index=40;
         f.seek(index);
        f.read(popby);
        String readpop = new String(popby);
        readpop = readpop.trim();
         int t = Integer.parseInt(readpop);
        t=t-1;
        readpop = ""+t;
        popby = convertToByteArray(readpop);
        f.seek(index);
        f.write(popby);
        }
        if (top[0] > 0)
           {
        index=44; 
        f.seek(index);
        f.read(topby);
        String readtop = new String(topby);
        readtop = readtop.trim();
        int l= Integer.parseInt(readtop);
        l=l-1;
        readtop = ""+l;
        topby = convertToByteArray(readtop);
        f.seek(index);
        f.write(topby);
            }
        if(top[1] > 0){
        index=48; 
        f.seek(index);
        f.read(topby);
        String readtop = new String(topby);
        readtop = readtop.trim();
        int l= Integer.parseInt(readtop);
        l=l-1;
        readtop = ""+l;
        topby = convertToByteArray(readtop);
        f.seek(index);
        f.write(topby);
            }
        
        if(top[2]>0){
           index=56; 
        f.seek(index);
        f.read(topby);
        String readtop = new String(topby);
        readtop = readtop.trim();
        int l= Integer.parseInt(readtop);
        l=l-1;
        readtop = ""+l;
        topby = convertToByteArray(readtop);
        f.seek(index);
        f.write(topby);
            }
        if(top[3]>0){
           index=56; 
        f.seek(index);
        f.read(topby);
        String readtop = new String(topby);
        readtop = readtop.trim();
        int l= Integer.parseInt(readtop);
        l=l-1;
        readtop = ""+l;
        topby = convertToByteArray(readtop);
        f.seek(index);
        f.write(topby);
            }
        
        if (chips==1)
        {
         index=60;
         f.seek(index);
        f.read(chipsby);
        String readchips = new String(chipsby);
        readchips = readchips.trim();
         int m = Integer.parseInt(readchips);
        m=m-1;
        readchips = ""+m;
        chipsby = convertToByteArray(readchips);
        f.seek(index);
        f.write(chipsby);
        f.close();
        }
        
        
        
        
        
    }
    
    public static byte [] convertToByteArray(String input) {
byte [] tmp = new byte[4];
for(int i = 0; i < tmp.length; i++) {
tmp[i] = ' ';
}
int numchars;
if(tmp.length > input.length()) numchars = input.length();
else numchars = tmp.length;
for(int i = 0; i < numchars; i++) {
tmp[i] = (byte) input.charAt(i);
}
return tmp;
}
}



