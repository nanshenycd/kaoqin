package com.nanshenycd.kaoqin.service.Impl;

import com.nanshenycd.kaoqin.pojo.Attence;
import com.nanshenycd.kaoqin.mapper.AttenceMapper;
import com.nanshenycd.kaoqin.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttenceServiceImpl implements AttenceService {
    @Autowired
    AttenceMapper attenceMapper;

    @Override
    public List<Attence> list() {
        return attenceMapper.list();
    }

    @Override
    public void add(Attence attence) {
        attenceMapper.add(attence);
    }

    @Override
    public void delete(int id) {
        attenceMapper.delete(id);
    }

    @Override
    public void update(Attence attence) {
        attenceMapper.update(attence);
    }

    @Override
    public Attence get(int id) {
        return attenceMapper.get(id);
    }


}
