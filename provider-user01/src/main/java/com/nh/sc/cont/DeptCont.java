package com.nh.sc.cont;

import com.nh.sc.entity.Dept;
import com.nh.sc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 95
 * @Title: DeptCont
 * @ProjectName scDemo
 * @Description: TODO
 * @date 2019/3/3011:21
 */
@RestController
public class DeptCont {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

}

