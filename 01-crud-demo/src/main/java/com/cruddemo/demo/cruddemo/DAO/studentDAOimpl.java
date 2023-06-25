package com.cruddemo.demo.cruddemo.DAO;

import com.cruddemo.demo.cruddemo.entity.student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class studentDAOimpl implements studentDAO{

    //define fields for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection

    @Autowired
    public studentDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(student Student) {
        entityManager.persist(Student);

    }
}

