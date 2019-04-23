package com.nh.sc.cont;

import java.util.List;

import com.nh.sc.entity.Dept;
import com.nh.sc.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ConsumerCont
{
    //private static final String REST_URL_PREFIX = "http://localhost:7900";
    private static final String REST_URL_PREFIX = "http://PROVIDERUSER";

    @Autowired
    private DeptClientService deptService;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return deptService.add(dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {

        return deptService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return deptService.list();
    }
}




