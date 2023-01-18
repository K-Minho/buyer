package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchaseRepository {
    public int insert(@Param("userId") int userId, @Param("productId") int productId);

    public List<Purchase> findAll();

    public Purchase findById(@Param("userId") int userId, @Param("productId") int productId);

    public int updateFindById(@Param("userId") int userId, @Param("productId") int productId);

    public int deleteFindById(int id);
}
