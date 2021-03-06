package com.sourceedge.bhagyalakshmi.orders.support;

import com.sourceedge.bhagyalakshmi.orders.models.Catagories;
import com.sourceedge.bhagyalakshmi.orders.models.CompanyModel;
import com.sourceedge.bhagyalakshmi.orders.models.CurrentUser;
import com.sourceedge.bhagyalakshmi.orders.models.LocationModel;
import com.sourceedge.bhagyalakshmi.orders.models.OfflineModel_Distributor;
import com.sourceedge.bhagyalakshmi.orders.models.Order;
import com.sourceedge.bhagyalakshmi.orders.models.OrderProduct;
import com.sourceedge.bhagyalakshmi.orders.models.Product;
import com.sourceedge.bhagyalakshmi.orders.models.Role;
import com.sourceedge.bhagyalakshmi.orders.models.Sections;

import java.util.ArrayList;

/**
 * Created by Centura User1 on 08-12-2016.
 */

public class Class_ModelDB {
    private static int APPVERSION = 0;
    public static String AppTitle = "Bhagyalakshmi Enterprises";
    private static Order orderModel = new Order();
    private static ArrayList<Order> orderList = new ArrayList<Order>();
    public static ArrayList<Order> DraftorderList = new ArrayList<Order>();
    private static ArrayList<Catagories> catagoryList = new ArrayList<Catagories>();

    private static Role roleModel = new Role();
    private static ArrayList<Role> roleList = new ArrayList<Role>();


    private static CurrentUser currentuserModel = new CurrentUser();

    private static OrderProduct orderProductModel = new OrderProduct();
    private static ArrayList<OrderProduct> orderProductList = new ArrayList<OrderProduct>();

    private static Product productModel = new Product();
    private static ArrayList<Product> productList = new ArrayList<Product>();

    private static LocationModel locationModel = new LocationModel();
    private static ArrayList<LocationModel> locationList = new ArrayList<LocationModel>();

    private static Sections sectionsModel = new Sections();
    private static ArrayList<Sections> sectionList = new ArrayList<Sections>();

    private static Catagories CatagoryModel = new Catagories();
    public static OfflineModel_Distributor OfflineDistributor= new OfflineModel_Distributor();
    public static ArrayList<OfflineModel_Distributor> OfflineDistributors= new ArrayList<OfflineModel_Distributor>();


    public static ArrayList<CompanyModel> CompanyList= new ArrayList<CompanyModel>();

    public static void ClearDB() {
        orderModel = new Order();
        orderList = new ArrayList<Order>();
        DraftorderList = new ArrayList<Order>();
        orderProductModel = new OrderProduct();
        orderProductList = new ArrayList<OrderProduct>();
        catagoryList = new ArrayList<Catagories>();
        productModel = new Product();
        productList = new ArrayList<Product>();
        currentuserModel = new CurrentUser();
        roleModel = new Role();
        roleList = new ArrayList<Role>();
        sectionsModel = new Sections();
        sectionList = new ArrayList<Sections>();
        locationModel= new LocationModel();
        locationList= new ArrayList<LocationModel>();
    }

    public static int getAPPVERSION() {
        return APPVERSION;
    }

    public static void setAPPVERSION(int APPVERSION) {
        Class_ModelDB.APPVERSION = APPVERSION;
    }

    public static String getAppTitle() {
        return AppTitle;
    }

    public static void setAppTitle(String appTitle) {
        AppTitle = appTitle;
    }

    public static ArrayList<Order> getDraftorderList() {
        return DraftorderList;
    }

    public static void setDraftorderList(ArrayList<Order> draftorderList) {
        DraftorderList = draftorderList;
    }

    public static LocationModel getLocationModel() {
        return locationModel;
    }

    public static void setLocationModel(LocationModel locationModel) {
        Class_ModelDB.locationModel = locationModel;
    }

    public static ArrayList<LocationModel> getLocationList() {
        return locationList;
    }

    public static void setLocationList(ArrayList<LocationModel> locationList) {
        Class_ModelDB.locationList = locationList;
    }

    //Getter and Setter of all above models

    public static Sections getSectionsModel() {
        return sectionsModel;
    }

    public static void setSectionsModel(Sections sectionsModel) {
        Class_ModelDB.sectionsModel = sectionsModel;
    }

    public static ArrayList<Sections> getSectionList() {
        return sectionList;
    }

    public static void setSectionList(ArrayList<Sections> sectionList) {
        Class_ModelDB.sectionList = sectionList;
    }

    public static Catagories getCatagoryModel() {
        return CatagoryModel;
    }

    public static void setCatagoryModel(Catagories catagoryModel) {
        CatagoryModel = catagoryModel;
    }

    public static ArrayList<Catagories> getCatagoryList() {
        return catagoryList;
    }

    public static void setCatagoryList(ArrayList<Catagories> catagoryList) {
        Class_ModelDB.catagoryList = catagoryList;
    }


    public static Order getOrderModel() {
        return orderModel;
    }

    public static void setOrderModel(Order orderModel) {
        Class_ModelDB.orderModel = orderModel;
    }

    public static ArrayList<Order> getOrderList() {
        return orderList;
    }

    public static void setOrderList(ArrayList<Order> orderList) {
        Class_ModelDB.orderList = orderList;
    }

    public static OrderProduct getOrderProductModel() {
        return orderProductModel;
    }

    public static void setOrderProductModel(OrderProduct orderProductModel) {
        Class_ModelDB.orderProductModel = orderProductModel;
    }

    public static ArrayList<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public static void setOrderProductList(ArrayList<OrderProduct> orderProductList) {
        Class_ModelDB.orderProductList = orderProductList;
    }

    public static Product getProductModel() {
        return productModel;
    }

    public static void setProductModel(Product productModel) {
        Class_ModelDB.productModel = productModel;
    }

    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static Product getSingleProduct(String Id) {
        Product product = new Product();
        for (Product tempProduct : productList) {
            if (tempProduct.getCode().matches(Id))
                product = tempProduct;
        }
        return product;
    }

    public static void setProductList(ArrayList<Product> productList) {
        Class_ModelDB.productList = productList;
    }

    public static Role getRoleModel() {
        return roleModel;
    }

    public static void setRoleModel(Role roleModel) {
        Class_ModelDB.roleModel = roleModel;
    }

    public static ArrayList<Role> getRoleList() {
        return roleList;
    }

    public static void setRoleList(ArrayList<Role> roleList)
    {
        Class_ModelDB.roleList = roleList;
    }

    public static CurrentUser getCurrentuserModel() {
        return currentuserModel;
    }

    public static void setCurrentuserModel(CurrentUser currentuserModel) {
        Class_ModelDB.currentuserModel = currentuserModel;
    }


}
