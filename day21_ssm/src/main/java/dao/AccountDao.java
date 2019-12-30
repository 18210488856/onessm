package dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {
    void inMoney(@Param("inName") String inName, @Param("money") Double money);

    void outMoney(@Param("outName") String outName, @Param("money") Double money);
}
