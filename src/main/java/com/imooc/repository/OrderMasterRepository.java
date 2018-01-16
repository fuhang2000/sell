package com.imooc.repository;

import com.imooc.dataobjdect.orderMaster;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/12.
 */

public interface OrderMasterRepository extends JpaRepository<orderMaster,String>{


}
