package com.override.onlineCompanies;

public class CompanyTester
{
    public static void main(String[] args)
    {
        Company apple = new Company("Apple", "8 Johnson rd", "Arlington", "MA");
        System.out.println(apple);
        
        OnlineCompany code = new OnlineCompany("Code", "www.code.hs");
        System.out.println(code);
        
    }
}
