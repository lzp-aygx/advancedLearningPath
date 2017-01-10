package tissueComplaint.entity;

/**
 * Created by lizhupeng on 2016/12/29.
 */
public class Product {
    private String CompanyId;
    private String ProductId;
    private String ProductType;
    private String ProductCategory;
    private String Specification;

    public Product() {
    }

    public Product(String companyId, String productId, String productType, String productCategory, String specification) {
        CompanyId = companyId;
        ProductId = productId;
        ProductType = productType;
        ProductCategory = productCategory;
        Specification = specification;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "CompanyId='" + CompanyId + '\'' +
                ", ProductId='" + ProductId + '\'' +
                ", ProductType='" + ProductType + '\'' +
                ", ProductCategory='" + ProductCategory + '\'' +
                ", Specification='" + Specification + '\'' +
                '}';
    }
}
