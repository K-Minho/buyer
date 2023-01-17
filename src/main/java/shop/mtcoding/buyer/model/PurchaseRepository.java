package shop.mtcoding.buyer.model;

import java.util.List;

public interface PurchaseRepository {
    public int insert(int userId, int productId);

    public List<Purchase> findAll();

    public Purchase findById(int userId, int productId);

    public int updateFindById(int userId, int productId);

    public int deleteFindById(int id);
}