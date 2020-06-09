package com.nanshenycd.kaoqin.service;

import com.nanshenycd.kaoqin.pojo.Attence;
import com.nanshenycd.kaoqin.mapper.AttenceMapper;
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
}
