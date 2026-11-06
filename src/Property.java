// Lớp cha: Bất động sản chung
public class Property {
    protected String title;
    protected double price;
    protected double area;

    // Constructor (Hàm khởi tạo)
    public Property(String title, double price, double area) {
        this.title = title;
        this.price = price;
        this.area = area;
    }

    // Phương thức in thông tin chung
    public void displayInfo() {
        System.out.println("Tiêu đề: " + title);
        System.out.println("Giá: " + price + " Tỷ | Diện tích: " + area + " m2");
    }
}