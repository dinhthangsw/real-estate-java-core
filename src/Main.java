// Tạo một khuôn mẫu (Class) cho Bất động sản
class Property {
    // Các thuộc tính (Properties)
    String title;
    double price;

    // Phương thức (Method) - Hành động của đối tượng
    public void displayInfo() {
        System.out.println("Tên tin đăng: " + title);
        System.out.println("Mức giá: " + price + " Tỷ VNĐ");
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ BẤT ĐỘNG SẢN ===");

        // Khởi tạo đối tượng (Object) từ khuôn mẫu Property
        Property house1 = new Property();
        house1.title = "Chung cư cao cấp 2PN Quận 1";
        house1.price = 4.5;

        Property house2 = new Property();
        house2.title = "Nhà nguyên căn Hẻm xe hơi Quận 7";
        house2.price = 6.2;

        // Gọi hàm in thông tin
        house1.displayInfo();
        house2.displayInfo();
    }
}