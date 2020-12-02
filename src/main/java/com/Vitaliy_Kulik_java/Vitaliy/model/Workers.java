package com.Vitaliy_Kulik_java.Vitaliy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name="workers")
public class Workers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "workers_Id")
    private int Workers_Id;
    @Column(name = "first_Name_Workers")
    private String First_Name_Workers;
    @Column(name = "second_Name_Workers")
    private String Second_Name_Workers;
    @Column(name = "work_Experience_Workers")
    private int Work_Experience_Workers;
    @Column(name = "position_Workers")
    private String Position_Workers;
    @Column(name = "company_Workers")
    private String Сompany_Workers;

    public Workers(int Workers_Id, String First_Name_Workers, String Second_Name_Workers, int Work_Experience_Workers, String Position_Workers, String Сompany_Workers)
    {
        this.Workers_Id=Workers_Id;
        this.First_Name_Workers=First_Name_Workers;
        this.Second_Name_Workers=Second_Name_Workers;
        this.Work_Experience_Workers=Work_Experience_Workers;
        this.Position_Workers=Position_Workers;
        this.Сompany_Workers=Сompany_Workers;
    }
    public Workers()
    {

    }

    public int get_Workers_Id() {
        return Workers_Id;
    }

    public void set_Workers_Id(int Workers_Id) {
        this.Workers_Id = Workers_Id;
    }

    /////////////////////////////////
    public String get_First_Name_Workers() {
        return First_Name_Workers;
    }

    public void set_First_Name_Workers(String First_Name_Workers) {
        this.First_Name_Workers = First_Name_Workers;
    }

    ///////////////////////////////////
    public String get_Second_Name_Workers() {
        return Second_Name_Workers;
    }

    public void set_Second_Name_Workers(String Second_Name_Workers) {
        this.Second_Name_Workers = Second_Name_Workers;
    }

    ////////////////////////////////////
    public String get_Work_Experience_Workers(String Work_Experience_Workers) {
        return Work_Experience_Workers;
    }

    public void set_Work_Experience_Workers(int Work_Experience_Workers) {
        this.Work_Experience_Workers = Work_Experience_Workers;
    }
    //////////////////////////////////////
    public String get_Position_Workers() {
        return Position_Workers;
    }

    public void set_Position_Workers(String Position_Workers) {
        this.Position_Workers = Position_Workers;
    }

    ///////////////////////////////////////////
    public String get_Сompany_Workers() {
        return Сompany_Workers;
    }

    public void set_Сompany_Workers(String Сompany_Workers)
    {
        this.Сompany_Workers = Сompany_Workers;
    }

    @Override
    public String toString()
    {
        return "Workers[Workers_Id="+ Workers_Id+", First_Name_Workers= "+ First_Name_Workers+
                ", Second_Name_Workers="+Second_Name_Workers+", Work_Experience_Workers="+Work_Experience_Workers+
                ", Position_Workers="+Position_Workers+", Сompany_Workers="+Сompany_Workers+"]";
    }
}
