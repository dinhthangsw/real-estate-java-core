public class Main {
    public static void main(String[] args) {
        System.out.println("=== QUẢN LÝ DANH SÁCH BẤT ĐỘNG SẢN ===");

        // Khởi tạo đối tượng căn hộ
        Apartment apt1 = new Apartment("Chung cư Vinhomes Central Park", 4.8, 75.5, 12);

        // Gọi hàm hiển thị
        apt1.displayInfo();
    }
}