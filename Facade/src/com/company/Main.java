package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Power power = new Power();
//        power.on();
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.load();
//        dvdRom.unload();
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvdRom);
        Computer computer= new Computer();
        computer.copy();
    }
}
class Computer{
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();
    void  copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}
class Power {
    void on(){
        System.out.println("On power");
    }
    void off() {
        System.out.println("Of power");
    }
}
class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
//        System.out.println("Disk loaded");
        data = true;

    }
    void unload(){
//        System.out.println("Disk loaded");
        data = false;
    }
}
class HDD{
    void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("Copying data from disk ");
        }
        else {
            System.out.println("Put disk with data");
        }
    }
}