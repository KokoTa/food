package com.food.service;

import com.food.pojo.Stu;

public interface StuService {

    public Stu getStuInfo(int id);

    public void saveStu(Stu stu);

    public void updateStud(int id);

    public void deleteSut(int id);
}
