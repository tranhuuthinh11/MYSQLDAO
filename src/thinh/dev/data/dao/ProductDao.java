package thinh.dev.data.dao;

import java.util.List;

import thinh.dev.data.model.Product;

public interface ProductDao {
    
    public boolean insert(Product product);

    public boolean update(Product product);

    public boolean delete(int id);

    public Product find(int id);

    // Lấy ds sp
    public List<Product> findAll();

    // Tìm sp theo id danh mục
    public List<Product> findByCategory(int categoryId);

    // Tìm sp theo tên
    public List<Product> findByName(String name);

    // Tìm sp theo khoảng giá
    public List<Product> findByPriceRange(double minPrice, double maxPrice);

    // Tìm sp theo trạng thái
    public List<Product> findByStatus(String status);
}
