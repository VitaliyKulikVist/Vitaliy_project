package com.Vitaliy_Kulik_java.Vitaliy.service;

import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;
import com.Vitaliy_Kulik_java.Vitaliy.repository.Workers_Repository;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

@RunWith(MockitoJUnitRunner.class)

public class Workers_Service_ImplTest
{
    @Mock
    private Workers_Repository workers_repository;

    @InjectMocks
    private Workers_Service_Impl workers_Service_Impl;

//    private List<Workers> get_All_List()
//    {
//        List<Workers> workersList=workers_repository.findAll();
//        return workersList;
//    }
//
//    private Iterable<Workers> get_All_Iterable()
//    {
//        Iterable<Workers> workersIterable= workers_repository.findAll();
//        return  workersIterable;
//    }
//    private List<Workers> get_Workers_List()
//    {
//        return List.of(new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго"));
//    }
//
//    private Workers get_Workers()
//    {
//        return new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
//    }

    ////////////////////////////////////////////////////////////////////////////////
    @Test
public void test()
{
    when(workers_repository.findAll()).thenReturn(List.of(new Workers(1, "Вася", "Пупкін", 3, "senior", "Рівне обл енерго")));
    List<Workers> all = workers_Service_Impl.findAll();
    Assertions.assertThat(all.size()).isEqualTo(1);
}
/////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void findAll()
    {
        Workers_Service_Impl findAll_t =new Workers_Service_Impl();
        Workers workers1 = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        Assertions.assertThat(workers1);
        Workers workers2 = new Workers(2, "Вася","Пупкін",4,"senior","Рівне обл енерго");
        Assertions.assertThat(workers2);
    }

    @Test
    public void findWorkersById()
    {
        Workers_Service_Impl findWorkersById_t =new Workers_Service_Impl();


    }
    @Test
    public void shouldThrowCreateWorker_First_Name()
    {
        Workers shouldThrowCreateWorker_First_Name = new Workers(1, null,"Пупкін",3,"senior","Рівне обл енерго");
        Assertions.assertThatThrownBy(()->workers_Service_Impl.createWorkers(shouldThrowCreateWorker_First_Name)).
                hasMessage("First Name Workers ne Vvedeniy");

    }
    @Test
    public void shouldThrowCreateWorker_Second_Name_Workers()
    {
        Workers shouldThrowCreateWorker_Second_Name_Workers = new Workers(1, "Вася",null,3,"senior","Рівне обл енерго");
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorkers(shouldThrowCreateWorker_Second_Name_Workers)).
                hasMessage("Second Name Workers ne Vvedeniy");
    }
    @Test
    public void shouldThrowCreateWorker_Position_Workers()
    {
        Workers shouldThrowCreateWorker_Position_Workers = new Workers(1, "Вася","Пупкін",3,null,"Рівне обл енерго");
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorkers(shouldThrowCreateWorker_Position_Workers)).
                hasMessage("Position_Workers ne Vvedeniy");
    }
    @Test
    public void shouldThrowCreateWorker_Сompany_Workers()
    {
        Workers shouldThrowCreateWorker_Сompany_Workers = new Workers(1, "Вася","Пупкін",3,"senior",null);
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorkers(shouldThrowCreateWorker_Сompany_Workers)).
                hasMessage("Сompany_Workers ne Vvedeniy");
    }
    @Test
    public  void shouldThrowCreateWorkers_Id()
    {
        Workers shouldThrowCreateWorkers_Id = new Workers(000, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorkers(shouldThrowCreateWorkers_Id)).
                hasMessage("No Workers");
    }

    @Test
    public void createWorkers()
    {
        Workers worker = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorkers(worker)).hasNoCause();
    }
    private List<Workers> genWorkersList(){ return List.of(new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго"));}
    private Workers genWorkers(){
        return new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
    }

    @Test
    public void updateWorkers()
    {
        Workers_Service_Impl updateWorkers_t =new Workers_Service_Impl();

    }

    @Test
    public void deleteUser()
    {
        Workers_Service_Impl deleteUser_t =new Workers_Service_Impl();

    }
}
