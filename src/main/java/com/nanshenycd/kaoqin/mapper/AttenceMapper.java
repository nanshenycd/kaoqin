package com.nanshenycd.kaoqin.mapper;

import com.nanshenycd.kaoqin.pojo.Attence;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface AttenceMapper {
    List<Attence> list();

    void add(Attence attence);

    void delete(int id);

    void update(Attence attence);

    Attence get(int id);

}
