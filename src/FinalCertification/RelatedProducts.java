package FinalCertification;

public class RelatedProducts extends Good{
    String productPurpose;
    public RelatedProducts(int productCode, String productName, String productColor, String manufactureCountry, String productPurpose, double price) {
        super(productCode, productName, productColor, manufactureCountry, price);
        this.productPurpose = productPurpose;
    }
}
