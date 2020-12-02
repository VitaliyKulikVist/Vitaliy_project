package com.Vitaliy_Kulik_java.Vitaliy.repository;

import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Workers_Repository extends JpaRepository<Workers, Integer>
{
    //List <Workers> findAll();
    // Iterable<Workers>findAllBy_Workers_Id();
    //    List <Workers> findWorkersById();
    //    List <Workers> createWorkers(String workers);
    //    List <Workers> validateCreateWorkers();
    //    List <Workers> updateWorkers();
    //    List <Workers> deleteWorkers();
}

