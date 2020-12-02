package com.Vitaliy_Kulik_java.Vitaliy.service;

import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;
import com.Vitaliy_Kulik_java.Vitaliy.repository.Workers_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Workers_Service_Impl implements Workers_Service
{
    @Autowired
    private Workers_Repository workers_Repository;

    @Override
    public List<Workers> findAll()
    {
        return workers_Repository.findAll();
    }

    @Override
    public Workers findWorkersById(int Workers_Id)
    {
        return workers_Repository.findById(Workers_Id).orElse(null);
    }

    @Override
    public Workers createWorkers(Workers workers)
    {


        if (workers.get_First_Name_Workers() == null || workers.get_First_Name_Workers().length()==0)
        {
            throw new IllegalArgumentException("First Name Workers ne Vvedeniy");
        }


        if (workers.get_Second_Name_Workers() == null )
        {
            throw new IllegalArgumentException("Second Name Workers ne Vvedeniy");
        }


        if (workers.get_Position_Workers() == null )
        {
            throw new IllegalArgumentException("Position_Workers ne Vvedeniy");
        }


        if (workers.get_Сompany_Workers() == null)
        {
            throw new IllegalArgumentException("Сompany_Workers ne Vvedeniy");
        }

        workers.set_Workers_Id(000);
        if (workers.get_Workers_Id()!=000)
        {
            throw new IllegalArgumentException("Workers_Id ne Vvedeniy");
        }






        List<Workers> all = workers_Repository.findAll();
        if(all.isEmpty())
        {
            throw new RuntimeException("No Workers");
        }
        workers_Repository.save(workers);
        return workers;
    }

    @Override
    public Workers updateWorkers(Workers workers)
    {
        workers_Repository.save(workers);
        return workers;
    }

    @Override
    public void deleteUser(int Workers_Id)
    {
        workers_Repository.deleteById(Workers_Id);
    }
}
