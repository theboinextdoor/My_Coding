//package com.company;

public class Student {
    String name;     //data member
    private int id_num;     //data member
    private static String S_name= "Sun Shine prep./ high school.";     //data member
    final int passing_marks= 33;
    static int count =0;

    public void setId_num(int num){
        if(num<0){
            System.out.println("I'd cannot be negetive.");
            return ;
        }
        id_num=num;
    }

    public static String getId_Sname(){
        return S_name;
    }


    public Student(String name, int id_num){    //Constructure with Parameter

        this.name= name;               // data member = local variable
        this.id_num = id_num;
        count ++;
        System.out.println(count);
    }

    public Student(int id_num){        //Constructure with Parameter
        this.id_num= id_num;
        name = "Damon";
    }

    public void print()
    {
        System.out.println(S_name+"\t"+name+": "+id_num+", passing marks: "+ passing_marks);
    }
}

