package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class NameComparetor implements Comparator<Student>
{
    @Override
    public int compare( Student s1, Student s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}