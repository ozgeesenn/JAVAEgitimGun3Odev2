package com.company;

public class StudentManager extends UserManager {

    private UserManager userManager;
    public StudentManager(UserManager userManager)
    {
        this.userManager=userManager;
    }
    public void Add(String message)
    {
        System.out.println("Öğrenci eklendi");
        this.userManager.Add("Kayit 1");


    }
}
