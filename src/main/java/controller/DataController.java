package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class DataController {

//    使用构造函数进行注入
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping("/data")
    public String getUser(){
        String sql="select * from user";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        System.out.println("lsit.size()="+list.size());

        for (Map<String,Object> map:list){
            Set<Map.Entry<String,Object>> entries=map.entrySet();
            Iterator<Map.Entry<String,Object>> iterator=entries.iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Object> entry=iterator.next();
                Object key=entry.getKey();
                Object value=entry.getValue();
                System.out.println("key:"+key+"value:"+value);

            }
        }

        return "data";

    }
}
