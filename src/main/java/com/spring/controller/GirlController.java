package com.spring.controller;

import com.spring.entity.Girl;
import com.spring.mapper.GirlMapper;
import com.spring.vo.AddGirlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cherry
 * @date 2017/12/17 11:32
 */
@RestController
@RequestMapping(value = "/girls")
public class GirlController {

    @Autowired
    private GirlMapper girlMapper;

    /**
     * 查询所有女孩列表
     * @return
     */
    @GetMapping
    public List<Girl> getGirlList(){
        return girlMapper.selectAll();
    }

    /**
     * 新增一个女孩
     *
     */
    @PostMapping
    public int addGirl(@RequestBody AddGirlVo addGirlVo){
        return girlMapper.addGirl(addGirlVo.getName(), addGirlVo.getAge());
    }

    /**
     * 通过id查询一个女孩
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Girl getGirlById(@PathVariable(value = "id") Integer id){
        return girlMapper.selectById(id);
    }

    /**
     * 更新一个女孩信息
     * @param id
     */
    @PostMapping(value = "/{id}")
    public int updateGirl(@PathVariable(value = "id") Integer id, @RequestParam Integer age){
        return girlMapper.updateGirlById(id, age);
    }

    /**
     * 删除一个女孩
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    public int deleteGirl(@PathVariable(value = "id") Integer id){
        return girlMapper.deleteGirlById(id);
    }


}
