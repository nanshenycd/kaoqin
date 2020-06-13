package com.nanshenycd.kaoqin.service;

import com.nanshenycd.kaoqin.pojo.Attence;

import java.util.List;

public interface AttenceService {
  List<Attence> list();

  void add(Attence attence);

  void delete(int id);

  void update(Attence attence);

  Attence get(int id);

}
