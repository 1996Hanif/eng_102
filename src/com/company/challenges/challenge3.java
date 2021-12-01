package com.company.challenges;

public class challenge3 {
    public static String name_switch (String name){
        char space = ' ';
        String firstname = "";
        String surname = "";
        Boolean after_space = false;
        for (int i = 0; i < name.length(); i++)
        {
            if(after_space == true)
                surname += name.charAt(i);
            else
                firstname += name.charAt(i);

            if(name.charAt(i) == ' ')
                after_space = true;
        }

        String new_name = surname + " " + firstname;

        return new_name;
    }
 }
