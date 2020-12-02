package com.Vitaliy_Kulik_java.Vitaliy.controller;

import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;
import com.Vitaliy_Kulik_java.Vitaliy.service.Workers_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Workers")
public class Workes_controller
{
    @Autowired
    private Workers_Service workers_Service;



    @GetMapping
    public List<Workers> get_All()
    {
        return workers_Service.findAll();
//        var get_all_a=workers_Service.findAll();
//        return get_all_a;
    }

    @GetMapping("/{Workers_Id}")
    public Workers get_Workers(@PathVariable int Workers_Id)
    {
        return workers_Service.findWorkersById(Workers_Id);
//        var get_worker_a = workers_Service.findWorkersById(Workers_Id);
//        return get_worker_a;
    }
    @PostMapping
    public Workers create_Workers(@RequestBody Workers workers)
    {
        return workers_Service.createWorkers(workers);
    }
    @PutMapping(value = "/{Workers_Id}")
    public Workers update_Workers(@RequestBody Workers workers)
    {
        return workers_Service.updateWorkers(workers);
    }
    @DeleteMapping(value = "/{Workers_Id}")
    public ResponseEntity delete_Workers(@PathVariable int Workers_Id)
    {
        workers_Service.deleteUser(Workers_Id);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }
}
