package kr.ac.mongtons.college_support_fees.domain.repository;

import kr.ac.mongtons.college_support_fees.domain.entity.Pay_List;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface Pay_ListRepository extends CrudRepository<Pay_List, Integer> {
    @Override
    ArrayList<Pay_List> findAll();
}
