package com.company;

public class InstructorManager extends UserManager{

    private UserManager userManager;
    public InstructorManager(UserManager userManager)
    {
        this.userManager=userManager;
    }
    public void Add(String message)
    {
        System.out.println("Eğitmen eklendi");
        this.userManager.Add("Kayit 1");


    }
}
