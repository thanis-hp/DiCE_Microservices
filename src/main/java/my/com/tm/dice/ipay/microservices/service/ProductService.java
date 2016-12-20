package my.com.tm.dice.ipay.microservices.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import my.com.tm.dice.ipay.microservices.exception.InfrastructureException;
import my.com.tm.dice.ipay.microservices.exception.InvalidInputException;
import my.com.tm.dice.ipay.microservices.exception.SystemException;
import my.com.tm.dice.ipay.microservices.model.Product;

public interface ProductService {
    /**
     * Returns all products grouped by category for a given channel and segment
     * 
     * @param channel
     *            - Non Empty String
     * @param segment
     *            - Non Empty String
     * @return All products for given channel and segment grouped by category
     */
    public Map<String, List<Product>> getAllProductsByCategory(String channel, String segment) throws InvalidInputException;

    public Set<Product> getProductsInHierarchy(Product root) throws InvalidInputException, InfrastructureException;

    public List<Product> getProductsWithLogin(Product root, List<Product> chosenProducts) throws InvalidInputException, InfrastructureException, SystemException;

    public Set<Product> getProductsToBeBought(Product root, List<Product> chosenProducts) throws InvalidInputException, InfrastructureException, SystemException;

    public Product getProductDetails(String productId);

    public List<Product> getProductDetails(List<String> productIds);

    public Set<Product> getProductsToBeBought(Map<String, List<String>> productMap) throws InvalidInputException, InfrastructureException, SystemException;

    public List<Product> getProductsWithLogin(Map<String, List<String>> productsMap) throws InvalidInputException, InfrastructureException, SystemException;

    float getOverallDiscount() throws SystemException;
    
    float getPercentGstValue();
    
    List<String> getFlattenedListOfProducts(Set<Product> productsToBuy);
    
    public List<String> getPartNumbers(List<Product> chosenProduts);
    
    public List<Product> createListOfProducts(Map<String, List<String>> productsHashMap);
}
