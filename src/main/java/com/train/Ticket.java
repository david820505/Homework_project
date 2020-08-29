package com.train;

public class Ticket {
    int total = 0;
    int tik_num;
    int rod_num;

    public Ticket(int tik_num, int rod_num){
        this.tik_num = tik_num;
        this.rod_num = rod_num;
    }

    public int totalnum(){
        total = ((tik_num-rod_num)*1000) + rod_num*(1800);
        return total;
    }
}