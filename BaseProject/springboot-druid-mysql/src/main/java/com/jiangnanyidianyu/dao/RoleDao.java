package com.jiangnanyidianyu.dao;

import com.jiangnanyidianyu.model.Personnel;
import com.jiangnanyidianyu.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {

    Personnel getPersonnelById(Integer id);

    List<Role> getRolesByUid(Integer id);
}
