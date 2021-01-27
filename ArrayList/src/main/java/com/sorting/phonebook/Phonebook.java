package com.sorting.phonebook;

import java.util.ArrayList;

public class Phonebook
{
    ArrayList<PhoneNumber> phone = new ArrayList<PhoneNumber>();
    
    public void addNumber(PhoneNumber num)
    {
        phone.add(num);
        sort();
    }
    
    public void sort()
    {
        for( int i = 1; i < phone.size(); i++)
        {
            PhoneNumber curr = phone.get(i);
            int currIndex = i - 1;
            
            /*System.out.println(curr.getName());
            System.out.println(phone.get(currIndex).getName());
            System.out.println(curr.getName().compareTo(phone.get(currIndex).getName()));*/
            
            while (currIndex > -1 && phone.get(currIndex).getName().compareTo(curr.getName()) > 0)
            {
                phone.set(currIndex+1, phone.get(currIndex));
                currIndex--;
            }
            phone.set(currIndex+1, curr );
            //printPhoneBook();
        }
    }
    
    public void printPhoneBook ()
    {
        //System.out.println();
        for(PhoneNumber var : phone)
        {
            System.out.println(var.getName());
        }
    }

}