package com.Vitaliy_Kulik_java.Vitaliy.service;

import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;

import java.util.List;

public interface Workers_Service
{
    List<Workers> findAll();
    Workers findWorkersById(int workers_Id);
    Workers createWorkers(Workers workers);
    Workers updateWorkers(Workers workers);
    void deleteUser(int workers_Id);
}
