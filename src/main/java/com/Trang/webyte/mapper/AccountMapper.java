package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Account;
import com.Trang.webyte.model.AccountExample;
import com.Trang.webyte.model.AccountKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {

    long countByExample(AccountExample example);
    int deleteByExample(AccountExample example);
    int deleteByPrimaryKey(AccountKey key);
    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(AccountKey key);
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);
    int updateByPrimaryKeySelective(Account record);
    int updateByPrimaryKey(Account record);
}